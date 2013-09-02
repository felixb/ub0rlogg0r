/*
 * Copyright (C) 2006 The Android Open Source Project
 * Copyright (C) 2013 Felix Bechstein
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.ub0r.android.logg0r;

import android.os.Build;

/**
 * Mirror android.util.Log for easy removal with proguard.
 *
 * @author flx
 */
@SuppressWarnings("UnusedDeclaration")
public class Log {

    /**
     * Priority constant for the println method; use Log.v.
     */
    public static final int VERBOSE = android.util.Log.VERBOSE;

    /**
     * Priority constant for the println method; use Log.d.
     */
    public static final int DEBUG = android.util.Log.DEBUG;

    /**
     * Priority constant for the println method; use Log.i.
     */
    public static final int INFO = android.util.Log.INFO;

    /**
     * Priority constant for the println method; use Log.w.
     */
    public static final int WARN = android.util.Log.WARN;

    /**
     * Priority constant for the println method; use Log.e.
     */
    public static final int ERROR = android.util.Log.ERROR;

    /**
     * Priority constant for the println method.
     */
    public static final int ASSERT = android.util.Log.ASSERT;

    private Log() {
        // no instances
    }

    /**
     * Send a {@link #VERBOSE} log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int v(String tag, String msg) {
        return android.util.Log.v(tag, msg);
    }

    /**
     * Send a {@link #VERBOSE} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     */
    public static int v(String tag, String msg, String msg1) {
        return android.util.Log.v(tag, msg + msg1);
    }

    /**
     * Send a {@link #VERBOSE} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     */
    public static int v(String tag, Object msg, Object msg1) {
        return android.util.Log.v(tag, "" + msg + msg1);
    }

    /**
     * Send a {@link #VERBOSE} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     */
    public static int v(String tag, String msg, String msg1, String msg2) {
        return android.util.Log.v(tag, msg + msg1 + msg2);
    }

    /**
     * Send a {@link #VERBOSE} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     */
    public static int v(String tag, Object msg, Object msg1, Object msg2) {
        return android.util.Log.v(tag, "" + msg + msg1 + msg2);
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr  An exception to log
     */
    public static int v(String tag, String msg, Throwable tr) {
        return android.util.Log.v(tag, msg, tr);
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log
     */
    public static int v(String tag, String msg, String msg1, Throwable tr) {
        return android.util.Log.v(tag, msg + msg1, tr);
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log
     */
    public static int v(String tag, Object msg, Object msg1, Throwable tr) {
        return android.util.Log.v(tag, "" + msg + msg1, tr);
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log
     */
    public static int v(String tag, String msg, String msg1, String msg2, Throwable tr) {
        return android.util.Log.v(tag, msg + msg1 + msg2, tr);
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log
     */
    public static int v(String tag, Object msg, Object msg1, Object msg2, Throwable tr) {
        return android.util.Log.v(tag, "" + msg + msg1 + msg2, tr);
    }

    /**
     * Send a {@link #DEBUG} log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int d(String tag, String msg) {
        return android.util.Log.d(tag, msg);
    }

    /**
     * Send a {@link #DEBUG} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     */
    public static int d(String tag, String msg, String msg1) {
        return android.util.Log.d(tag, msg + msg1);
    }

    /**
     * Send a {@link #DEBUG} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     */
    public static int d(String tag, Object msg, Object msg1) {
        return android.util.Log.d(tag, "" + msg + msg1);
    }

    /**
     * Send a {@link #DEBUG} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     */
    public static int d(String tag, String msg, String msg1, String msg2) {
        return android.util.Log.d(tag, msg + msg1 + msg2);
    }

    /**
     * Send a {@link #DEBUG} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     */
    public static int d(String tag, Object msg, Object msg1, Object msg2) {
        return android.util.Log.d(tag, "" + msg + msg1 + msg2);
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr  An exception to log
     */
    public static int d(String tag, String msg, Throwable tr) {
        return android.util.Log.d(tag, msg, tr);
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log
     */
    public static int d(String tag, String msg, String msg1, Throwable tr) {
        return android.util.Log.d(tag, msg + msg1, tr);
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log
     */
    public static int d(String tag, Object msg, Object msg1, Throwable tr) {
        return android.util.Log.d(tag, "" + msg + msg1, tr);
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log
     */
    public static int d(String tag, String msg, String msg1, String msg2, Throwable tr) {
        return android.util.Log.d(tag, msg + msg1 + msg2, tr);
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log
     */
    public static int d(String tag, Object msg, Object msg1, Object msg2, Throwable tr) {
        return android.util.Log.d(tag, "" + msg + msg1 + msg2, tr);
    }

    /**
     * Send an {@link #INFO} log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int i(String tag, String msg) {
        return android.util.Log.i(tag, msg);
    }

    /**
     * Send an {@link #INFO} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part0.
     * @param msg1 The message you would like logged, part1.
     */
    public static int i(String tag, String msg, String msg1) {
        return android.util.Log.i(tag, msg + msg1);
    }

    /**
     * Send an {@link #INFO} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part0.
     * @param msg1 The message you would like logged, part1.
     */
    public static int i(String tag, Object msg, Object msg1) {
        return android.util.Log.i(tag, "" + msg + msg1);
    }

    /**
     * Send an {@link #INFO} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part0.
     * @param msg1 The message you would like logged, part1.
     * @param msg2 The message you would like logged, part2.
     */
    public static int i(String tag, String msg, String msg1, String msg2) {
        return android.util.Log.i(tag, msg + msg1 + msg2);
    }

    /**
     * Send an {@link #INFO} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part0.
     * @param msg1 The message you would like logged, part1.
     * @param msg2 The message you would like logged, part2.
     */
    public static int i(String tag, Object msg, Object msg1, Object msg2) {
        return android.util.Log.i(tag, "" + msg + msg1 + msg2);
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr  An exception to log
     */
    public static int i(String tag, String msg, Throwable tr) {
        return android.util.Log.i(tag, msg, tr);
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log
     */
    public static int i(String tag, String msg, String msg1, Throwable tr) {
        return android.util.Log.i(tag, msg + msg1, tr);
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log
     */
    public static int i(String tag, Object msg, Object msg1, Throwable tr) {
        return android.util.Log.i(tag, "" + msg + msg1, tr);
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log
     */
    public static int i(String tag, String msg, String msg1, String msg2, Throwable tr) {
        return android.util.Log.i(tag, msg + msg1 + msg2, tr);
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log
     */
    public static int i(String tag, Object msg, Object msg1, Object msg2, Throwable tr) {
        return android.util.Log.i(tag, "" + msg + msg1 + msg2, tr);
    }

    /**
     * Send a {@link #WARN} log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int w(String tag, String msg) {
        return android.util.Log.w(tag, msg);
    }

    /**
     * Send a {@link #WARN} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     */
    public static int w(String tag, String msg, String msg1) {
        return android.util.Log.w(tag, msg + msg1);
    }

    /**
     * Send a {@link #WARN} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     */
    public static int w(String tag, Object msg, Object msg1) {
        return android.util.Log.w(tag, "" + msg + msg1);
    }

    /**
     * Send a {@link #WARN} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     */
    public static int w(String tag, String msg, String msg1, String msg2) {
        return android.util.Log.w(tag, msg + msg1 + msg2);
    }

    /**
     * Send a {@link #WARN} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     */
    public static int w(String tag, Object msg, Object msg1, Object msg2) {
        return android.util.Log.w(tag, "" + msg + msg1 + msg2);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr  An exception to log
     */
    public static int w(String tag, String msg, Throwable tr) {
        return android.util.Log.w(tag, msg, tr);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log
     */
    public static int w(String tag, String msg, String msg1, Throwable tr) {
        return android.util.Log.w(tag, msg + msg1, tr);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log
     */
    public static int w(String tag, Object msg, Object msg1, Throwable tr) {
        return android.util.Log.w(tag, "" + msg + msg1, tr);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log
     */
    public static int w(String tag, String msg, String msg1, String msg2, Throwable tr) {
        return android.util.Log.w(tag, msg + msg1 + msg2, tr);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log
     */
    public static int w(String tag, Object msg, Object msg1, Object msg2, Throwable tr) {
        return android.util.Log.w(tag, "" + msg + msg1 + msg2, tr);
    }

    /**
     * Checks to see whether or not a log for the specified tag is loggable at the specified level.
     *
     * The default level of any tag is set to INFO. This means that any level above and including
     * INFO will be logged. Before you make any calls to a logging method you should check to see if
     * your tag should be logged. You can change the default level by setting a system property:
     * 'setprop log.tag.&lt;YOUR_LOG_TAG> &lt;LEVEL>' Where level is either VERBOSE, DEBUG, INFO,
     * WARN, ERROR, ASSERT, or SUPPRESS. SUPPRESS will turn off all logging for your tag. You can
     * also create a local.prop file that with the following in it: 'log.tag.&lt;YOUR_LOG_TAG>=&lt;LEVEL>'
     * and place that in /data/local.prop.
     *
     * @param tag   The tag to check.
     * @param level The level to check.
     * @return Whether or not that this is allowed to be logged.
     * @throws IllegalArgumentException is thrown if the tag.length() > 23.
     */
    public static boolean isLoggable(String tag, int level) {
        return android.util.Log.isLoggable(tag, level);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param tr  An exception to log
     */
    public static int w(String tag, Throwable tr) {
        return android.util.Log.w(tag, tr);
    }

    /**
     * Send an {@link #ERROR} log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static int e(String tag, String msg) {
        return android.util.Log.e(tag, msg);
    }

    /**
     * Send an {@link #ERROR} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     */
    public static int e(String tag, String msg, String msg1) {
        return android.util.Log.e(tag, msg + msg1);
    }

    /**
     * Send an {@link #ERROR} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     */
    public static int e(String tag, Object msg, Object msg1) {
        return android.util.Log.e(tag, "" + msg + msg1);
    }

    /**
     * Send an {@link #ERROR} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     */
    public static int e(String tag, String msg, String msg1, String msg2) {
        return android.util.Log.e(tag, msg + msg1 + msg2);
    }

    /**
     * Send an {@link #ERROR} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     */
    public static int e(String tag, Object msg, Object msg1, Object msg2) {
        return android.util.Log.e(tag, "" + msg + msg1 + msg2);
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr  An exception to log
     */
    public static int e(String tag, String msg, Throwable tr) {
        return android.util.Log.e(tag, msg, tr);
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log
     */
    public static int e(String tag, String msg, String msg1, Throwable tr) {
        return android.util.Log.e(tag, msg + msg1, tr);
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log
     */
    public static int e(String tag, Object msg, Object msg1, Throwable tr) {
        return android.util.Log.e(tag, "" + msg + msg1, tr);
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log
     */
    public static int e(String tag, String msg, String msg1, String msg2, Throwable tr) {
        return android.util.Log.e(tag, msg + msg1 + msg2, tr);
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log
     */
    public static int e(String tag, Object msg, Object msg1, Object msg2, Throwable tr) {
        return android.util.Log.e(tag, "" + msg + msg1 + msg2, tr);
    }

    /**
     * What a Terrible Failure: Report a condition that should never happen. The error will always
     * be logged at level ASSERT with the call stack. Depending on system configuration, a report
     * may be added to the {@link android.os.DropBoxManager} and/or the process may be terminated
     * immediately with an error dialog.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     */
    public static int wtf(String tag, String msg) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
            return android.util.Log.wtf(tag, msg, null);
        } else {
            return android.util.Log.e(tag, msg);
        }
    }

    /**
     * What a Terrible Failure: Report a condition that should never happen. The error will always
     * be logged at level ASSERT with the call stack. Depending on system configuration, a report
     * may be added to the {@link android.os.DropBoxManager} and/or the process may be terminated
     * immediately with an error dialog.
     *
     * @param tag  Used to identify the source of a log message.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     */
    public static int wtf(String tag, Object msg, Object msg1) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
            return android.util.Log.wtf(tag, "" + msg + msg1, null);
        } else {
            return android.util.Log.e(tag, "" + msg + msg1);
        }
    }

    /**
     * What a Terrible Failure: Report a condition that should never happen. The error will always
     * be logged at level ASSERT with the call stack. Depending on system configuration, a report
     * may be added to the {@link android.os.DropBoxManager} and/or the process may be terminated
     * immediately with an error dialog.
     *
     * @param tag  Used to identify the source of a log message.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     */
    public static int wtf(String tag, Object msg, Object msg1, Object msg2) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
            return android.util.Log.wtf(tag, "" + msg + msg1 + msg2, null);
        } else {
            return android.util.Log.e(tag, "" + msg + msg1 + msg2);
        }
    }

    /**
     * What a Terrible Failure: Report an exception that should never happen. Similar to {@link
     * #wtf(String, String)}, with an exception to log.
     *
     * @param tag Used to identify the source of a log message.
     * @param tr  An exception to log.
     */
    public static int wtf(String tag, Throwable tr) {
        return wtf(tag, tr.getMessage(), tr);
    }

    /**
     * What a Terrible Failure: Report an exception that should never happen. Similar to {@link
     * #wtf(String, Throwable)}, with a message as well.
     *
     * @param tag Used to identify the source of a log message.
     * @param msg The message you would like logged.
     * @param tr  An exception to log.  May be null.
     */
    public static int wtf(String tag, Object msg, Throwable tr) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
            return android.util.Log.wtf(tag, "" + msg, tr);
        } else {
            return android.util.Log.e(tag, "" + msg, tr);
        }
    }

    /**
     * What a Terrible Failure: Report an exception that should never happen. Similar to {@link
     * #wtf(String, Throwable)}, with a message as well.
     *
     * @param tag  Used to identify the source of a log message.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param tr   An exception to log.  May be null.
     */
    public static int wtf(String tag, Object msg, Object msg1, Throwable tr) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
            return android.util.Log.wtf(tag, "" + msg + msg1, tr);
        } else {
            return android.util.Log.e(tag, "" + msg + msg1, tr);
        }
    }

    /**
     * What a Terrible Failure: Report an exception that should never happen. Similar to {@link
     * #wtf(String, Throwable)}, with a message as well.
     *
     * @param tag  Used to identify the source of a log message.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param tr   An exception to log.  May be null.
     */
    public static int wtf(String tag, Object msg, Object msg1, Object msg2, Throwable tr) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
            return android.util.Log.wtf(tag, "" + msg + msg1 + msg2, tr);
        } else {
            return android.util.Log.e(tag, "" + msg + msg1 + msg2, tr);
        }
    }

    /**
     * Send a {@link #VERBOSE} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     */
    public static int v(String tag, String msg, String msg1, String msg2, String msg3) {
        return android.util.Log.v(tag, msg + msg1 + msg2 + msg3);
    }

    /**
     * Send a {@link #VERBOSE} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     */
    public static int v(String tag, Object msg, Object msg1, Object msg2, Object msg3) {
        return android.util.Log.v(tag, "" + msg + msg1 + msg2 + msg3);
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param tr   An exception to log
     */
    public static int v(String tag, String msg, String msg1, String msg2, String msg3,
            Throwable tr) {
        return android.util.Log.v(tag, msg + msg1 + msg2 + msg3, tr);
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param tr   An exception to log
     */
    public static int v(String tag, Object msg, Object msg1, Object msg2, Object msg3,
            Throwable tr) {
        return android.util.Log.v(tag, "" + msg + msg1 + msg2 + msg3, tr);
    }

    /**
     * Send a {@link #DEBUG} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     */
    public static int d(String tag, String msg, String msg1, String msg2, String msg3) {
        return android.util.Log.d(tag, msg + msg1 + msg2 + msg3);
    }

    /**
     * Send a {@link #DEBUG} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     */
    public static int d(String tag, Object msg, Object msg1, Object msg2, Object msg3) {
        return android.util.Log.d(tag, "" + msg + msg1 + msg2 + msg3);
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param tr   An exception to log
     */
    public static int d(String tag, String msg, String msg1, String msg2, String msg3,
            Throwable tr) {
        return android.util.Log.d(tag, msg + msg1 + msg2 + msg3, tr);
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param tr   An exception to log
     */
    public static int d(String tag, Object msg, Object msg1, Object msg2, Object msg3,
            Throwable tr) {
        return android.util.Log.d(tag, "" + msg + msg1 + msg2 + msg3, tr);
    }

    /**
     * Send an {@link #INFO} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     */
    public static int i(String tag, String msg, String msg1, String msg2, String msg3) {
        return android.util.Log.i(tag, msg + msg1 + msg2 + msg3);
    }

    /**
     * Send an {@link #INFO} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part0.
     * @param msg1 The message you would like logged, part1.
     * @param msg2 The message you would like logged, part2.
     */
    public static int i(String tag, Object msg, Object msg1, Object msg2, Object msg3) {
        return android.util.Log.i(tag, "" + msg + msg1 + msg2 + msg3);
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param tr   An exception to log
     */
    public static int i(String tag, String msg, String msg1, String msg2, String msg3,
            Throwable tr) {
        return android.util.Log.i(tag, msg + msg1 + msg2 + msg3, tr);
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param tr   An exception to log
     */
    public static int i(String tag, Object msg, Object msg1, Object msg2, Object msg3,
            Throwable tr) {
        return android.util.Log.i(tag, "" + msg + msg1 + msg2 + msg3, tr);
    }

    /**
     * Send a {@link #WARN} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     */
    public static int w(String tag, String msg, String msg1, String msg2, String msg3) {
        return android.util.Log.w(tag, msg + msg1 + msg2 + msg3);
    }

    /**
     * Send a {@link #WARN} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     */
    public static int w(String tag, Object msg, Object msg1, Object msg2, Object msg3) {
        return android.util.Log.w(tag, "" + msg + msg1 + msg2 + msg3);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param tr   An exception to log
     */
    public static int w(String tag, String msg, String msg1, String msg2, String msg3,
            Throwable tr) {
        return android.util.Log.w(tag, msg + msg1 + msg2 + msg3, tr);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param tr   An exception to log
     */
    public static int w(String tag, Object msg, Object msg1, Object msg2, Object msg3,
            Throwable tr) {
        return android.util.Log.w(tag, "" + msg + msg1 + msg2 + msg3, tr);
    }

    /**
     * Send an {@link #ERROR} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     */
    public static int e(String tag, String msg, String msg1, String msg2, String msg3) {
        return android.util.Log.e(tag, msg + msg1 + msg2 + msg3);
    }

    /**
     * Send an {@link #ERROR} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     */
    public static int e(String tag, Object msg, Object msg1, Object msg2, Object msg3) {
        return android.util.Log.e(tag, "" + msg + msg1 + msg2 + msg3);
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param tr   An exception to log
     */
    public static int e(String tag, String msg, String msg1, String msg2, String msg3,
            Throwable tr) {
        return android.util.Log.e(tag, msg + msg1 + msg2 + msg3, tr);
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param tr   An exception to log
     */
    public static int e(String tag, Object msg, Object msg1, Object msg2, Object msg3,
            Throwable tr) {
        return android.util.Log.e(tag, "" + msg + msg1 + msg2 + msg3, tr);
    }

    /**
     * Send a {@link #VERBOSE} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     */
    public static int v(String tag, String msg, String msg1, String msg2, String msg3,
            String msg4) {
        return android.util.Log.v(tag, msg + msg1 + msg2 + msg3 + msg4);
    }

    /**
     * Send a {@link #VERBOSE} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     */
    public static int v(String tag, Object msg, Object msg1, Object msg2, Object msg3,
            Object msg4) {
        return android.util.Log.v(tag, "" + msg + msg1 + msg2 + msg3 + msg4);
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     * @param tr   An exception to log
     */
    public static int v(String tag, String msg, String msg1, String msg2, String msg3, String msg4,
            Throwable tr) {
        return android.util.Log.v(tag, msg + msg1 + msg2 + msg3 + msg4, tr);
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     * @param tr   An exception to log
     */
    public static int v(String tag, Object msg, Object msg1, Object msg2, Object msg3, Object msg4,
            Throwable tr) {
        return android.util.Log.v(tag, "" + msg + msg1 + msg2 + msg3 + msg4, tr);
    }

    /**
     * Send a {@link #DEBUG} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     */
    public static int d(String tag, String msg, String msg1, String msg2, String msg3,
            String msg4) {
        return android.util.Log.d(tag, msg + msg1 + msg2 + msg3 + msg4);
    }

    /**
     * Send a {@link #DEBUG} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     */
    public static int d(String tag, Object msg, Object msg1, Object msg2, Object msg3,
            Object msg4) {
        return android.util.Log.d(tag, "" + msg + msg1 + msg2 + msg3 + msg4);
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     * @param tr   An exception to log
     */
    public static int d(String tag, String msg, String msg1, String msg2, String msg3, String msg4,
            Throwable tr) {
        return android.util.Log.d(tag, msg + msg1 + msg2 + msg3 + msg4, tr);
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     * @param tr   An exception to log
     */
    public static int d(String tag, Object msg, Object msg1, Object msg2, Object msg3, Object msg4,
            Throwable tr) {
        return android.util.Log.d(tag, "" + msg + msg1 + msg2 + msg3 + msg4, tr);
    }

    /**
     * Send an {@link #INFO} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part0.
     * @param msg1 The message you would like logged, part1.
     * @param msg2 The message you would like logged, part2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     */
    public static int i(String tag, String msg, String msg1, String msg2, String msg3,
            String msg4) {
        return android.util.Log.i(tag, msg + msg1 + msg2 + msg3 + msg4);
    }

    /**
     * Send an {@link #INFO} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part0.
     * @param msg1 The message you would like logged, part1.
     * @param msg2 The message you would like logged, part2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     */
    public static int i(String tag, Object msg, Object msg1, Object msg2, Object msg3,
            Object msg4) {
        return android.util.Log.i(tag, "" + msg + msg1 + msg2 + msg3 + msg4);
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     * @param tr   An exception to log
     */
    public static int i(String tag, String msg, String msg1, String msg2, String msg3, String msg4,
            Throwable tr) {
        return android.util.Log.i(tag, msg + msg1 + msg2 + msg3 + msg4, tr);
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     * @param tr   An exception to log
     */
    public static int i(String tag, Object msg, Object msg1, Object msg2, Object msg3, Object msg4,
            Throwable tr) {
        return android.util.Log.i(tag, "" + msg + msg1 + msg2 + msg3 + msg4, tr);
    }

    /**
     * Send a {@link #WARN} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     */
    public static int w(String tag, String msg, String msg1, String msg2, String msg3,
            String msg4) {
        return android.util.Log.w(tag, msg + msg1 + msg2 + msg3 + msg4);
    }

    /**
     * Send a {@link #WARN} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     */
    public static int w(String tag, Object msg, Object msg1, Object msg2, Object msg3,
            Object msg4) {
        return android.util.Log.w(tag, "" + msg + msg1 + msg2 + msg3 + msg4);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     * @param tr   An exception to log
     */
    public static int w(String tag, String msg, String msg1, String msg2, String msg3, String msg4,
            Throwable tr) {
        return android.util.Log.w(tag, msg + msg1 + msg2 + msg3 + msg4, tr);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     * @param tr   An exception to log
     */
    public static int w(String tag, Object msg, Object msg1, Object msg2, Object msg3, Object msg4,
            Throwable tr) {
        return android.util.Log.w(tag, "" + msg + msg1 + msg2 + msg3 + msg4, tr);
    }

    /**
     * Send an {@link #ERROR} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     */
    public static int e(String tag, String msg, String msg1, String msg2, String msg3,
            String msg4) {
        return android.util.Log.e(tag, msg + msg1 + msg2 + msg3 + msg4);
    }

    /**
     * Send an {@link #ERROR} log message.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     */
    public static int e(String tag, Object msg, Object msg1, Object msg2, Object msg3,
            Object msg4) {
        return android.util.Log.e(tag, "" + msg + msg1 + msg2 + msg3 + msg4);
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     * @param tr   An exception to log
     */
    public static int e(String tag, String msg, String msg1, String msg2, String msg3, String msg4,
            Throwable tr) {
        return android.util.Log.e(tag, msg + msg1 + msg2 + msg3 + msg4, tr);
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     *
     * @param tag  Used to identify the source of a log message.  It usually identifies the class or
     *             activity where the log call occurs.
     * @param msg  The message you would like logged, part 0.
     * @param msg1 The message you would like logged, part 1.
     * @param msg2 The message you would like logged, part 2.
     * @param msg3 The message you would like logged, part 3.
     * @param msg4 The message you would like logged, part 4.
     * @param tr   An exception to log
     */
    public static int e(String tag, Object msg, Object msg1, Object msg2, Object msg3, Object msg4,
            Throwable tr) {
        return android.util.Log.e(tag, "" + msg + msg1 + msg2 + msg3 + msg4, tr);
    }
}