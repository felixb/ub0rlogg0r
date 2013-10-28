package de.ub0r.android.logg0r;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Helper class to collect and send device Logs by intent.
 *
 * @author flx
 */
public class LogCollector {

    private static final String TAG = "LogCollector";

    private static final String SENDLOG_PACKAGE_NAME = "org.l6n.sendlog";

    private LogCollector() {
        // hide constructor
    }

    /**
     * Collect logs and send them by Intent.
     *
     * @param context             context
     * @param recipient           recipient, most likely a mail address
     * @param sendlogInstallTitle title to show in dialog asking to install the sendlog app
     * @param sendlogInstallText  text to show in dialog asking to install the sendlog app
     * @param sendlogRunTitle     title to show in dialog asking to run sendlog
     * @param sendlogRunText      text to show in dialog asking to run sendlog
     */
    @SuppressWarnings("UnusedDeclaration")
    public static void collectAndSendLogs(final Context context, final String recipient,
            final String sendlogInstallTitle, final String sendlogInstallText,
            final String sendlogRunTitle, final String sendlogRunText) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            if (!sendLogsPlain(context, recipient, true)) {
                sendLogsWithSendlog(context, recipient, sendlogInstallTitle, sendlogInstallText,
                        sendlogRunTitle, sendlogRunText);
            }
        } else {
            sendLogsPlain(context, recipient, false);
        }
    }

    /**
     * Collect and send logs with sendlog app.
     *
     * @param context             context
     * @param recipient           recipient, most likely a mail address
     * @param sendlogInstallTitle title to show in dialog asking to install the sendlog app
     * @param sendlogInstallText  text to show in dialog asking to install the sendlog app
     * @param sendlogRunTitle     title to show in dialog asking to run sendlog
     * @param sendlogRunText      text to show in dialog asking to run sendlog
     */
    @TargetApi(Build.VERSION_CODES.DONUT)
    private static void sendLogsWithSendlog(final Context context, final String recipient,
            final String sendlogInstallTitle, final String sendlogInstallText,
            final String sendlogRunTitle, final String sendlogRunText) {
        PackageManager pm = context.getPackageManager();
        Intent intent = pm == null ? null : pm.getLaunchIntentForPackage(SENDLOG_PACKAGE_NAME);
        String title, message;
        if (intent == null) {
            intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + SENDLOG_PACKAGE_NAME));
            title = sendlogInstallTitle;
            message = sendlogInstallText;
        } else {
            intent.putExtra(Intent.EXTRA_SUBJECT, "SendLog: " + context.getPackageName());
            intent.setType("0||" + recipient);
            title = sendlogRunTitle;
            message = sendlogRunText;
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        final Intent i = intent;
        AlertDialog.Builder b = new AlertDialog.Builder(context);
        b.setIcon(android.R.drawable.ic_dialog_info);
        b.setTitle(title);
        b.setMessage(message);
        b.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                context.startActivity(i);
            }
        });
        b.setNegativeButton(android.R.string.cancel, null);
        b.show();
    }

    /**
     * Send logs by reading them directly from device
     *
     * @param context   context
     * @param recipient recipient, most likely a mail address
     * @param silent    do not show any message to user
     * @return true, if intent was fired to send logs
     */
    private static boolean sendLogsPlain(final Context context, final String recipient,
            final boolean silent) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        String pkgname = context.getPackageName();

        StringBuilder sb = new StringBuilder();
        sb.append("Manufacturer: ").append(Build.MANUFACTURER).append("\n");
        sb.append("Model: ").append(Build.MODEL).append("\n");
        sb.append("Device: ").append(Build.DEVICE).append("\n");
        sb.append("Product: ").append(Build.PRODUCT).append("\n");
        sb.append("Android Release: ").append(Build.VERSION.RELEASE).append("\n");
        sb.append("SDK: ").append(Build.VERSION.SDK_INT).append("\n");
        sb.append("\n");
        try {
            Process p = Runtime.getRuntime().exec("logcat -d -v time");

            File d = Environment.getExternalStorageDirectory();
            File f = new File(d, pkgname + "-" + new SimpleDateFormat("y-MM-d_HH-mm-ss")
                    .format(Calendar.getInstance().getTime()) + "-device-logs.log");

            if (f.exists()) {
                //noinspection ResultOfMethodCallIgnored
                f.delete();
            }

            FileOutputStream os = new FileOutputStream(f);
            InputStream is = p.getInputStream();

            byte[] buf = new byte[1024];
            int c;
            while ((c = is.read(buf, 0, buf.length)) > 0) {
                os.write(buf, 0, c);
            }
            is.close();
            os.close();
            p.destroy();
            Uri u = Uri.parse("file://" + f.getAbsolutePath());
            intent.putExtra(Intent.EXTRA_STREAM, u);
        } catch (IOException e) {
            String s = "IOException while reading logs";
            Log.e(TAG, s, e);
            if (!silent) {
                Toast.makeText(context, s, Toast.LENGTH_LONG).show();
            }
            sb.append(s);
            sb.append("\n\n");
            return false;
        }
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "SendLog: " + pkgname);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{recipient, ""});
        intent.putExtra(Intent.EXTRA_TEXT, sb.toString());
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            context.startActivity(Intent.createChooser(intent, "SendLog"));
        } catch (ActivityNotFoundException e) {
            Log.e(TAG, "No app found for this action", e);
            if (!silent) {
                Toast.makeText(context, "No app found for this action", Toast.LENGTH_LONG).show();
            }
            return false;
        }
        return true;
    }
}
