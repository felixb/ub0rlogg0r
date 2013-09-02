Ub0rLogg0r
==========

ub0r logg0r is just a simple wrapper around the android.util.Log class.
It allows you to write things like `Log.d(TAG, "foo=" + bar)` as `Log.d(TAG, "foo=", bar)`.
This simple change allows you to remove `Log.d()` and `Log.v()` with with proguard WITH the strings you are passing to it.

Just add the following lines to your proguard configuration:

    -assumenosideeffects class android.util.Log {
        public static *** d(...);
        public static *** v(...);
    }


    -assumenosideeffects class de.ub0r.android.logg0r.Log {
        public static *** d(...);
        public static *** v(...);
    }

Including in your project
=========================

Either include it in your project as an android library project, or grab it via maven:

    <dependency>
        <groupId>de.ub0r.android.logg0r</groupId>
        <artifactId>logg0r</artifactId>
        <version>{latest.version}</version>
        <type>jar</type>
    </dependency>

Or add it in your build.gradle

    repositories {
        maven {
            url 'https://github.com/felixb/ub0rlogg0r/raw/mvn-repo/'
        }
        mavenCentral()
    }

    dependencies {
        compile 'de.ub0r.android.ub0rlogg0r:logg0r:1.0.+'
    }

Migration
=========

To migrate to this library you need to:

 1. Change the imports from android.util.Log to de.ub0r.android.logg0r.Log
 2. Use the new method parameters instead of concating strings in your app

A simple sed like this should do the work:

    sed -e 's:android.util.Log:de.ub0r.android.logg0r.Log:g' -e '/Log.[dviwe](/s: *+:,:g' -i [your *.java files]

In some cases, you need to change implicit toString() into explicit calls.

References
==========

 * Further reading, why this is necessary: http://stackoverflow.com/q/6009078/2331953

License
=======

    Copyright 2012 Simon Vig Therkildsen

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
