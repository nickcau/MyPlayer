package com.meetyou.crsdk.util;

import android.util.Log;

/**
 * Created by gaoyoujian on 2017/3/5.
 */

public class LogUtils {

    private static final String TAG = "TAG";
    private static String checkEmpty(String content) {
        return content;
    }


    public static void e(String content) {
        Log.e(TAG, checkEmpty(content));
    }

    public static void i(String content) {
        Log.i(TAG, checkEmpty(content));
    }


    @Deprecated
    public static void d(String content) {
        Log.d(TAG, checkEmpty(content));
    }

    public static void w(String content) {
        Log.w(TAG, checkEmpty(content));
    }

    public static void w(String tag, String content, Throwable tr) {
        Log.w(tag, checkEmpty(content),tr);
    }

    public static void d(String tag, String content, Throwable tr) {
        Log.d(tag, checkEmpty(content),tr);
    }

    public static void i(String tag, String content) {
        Log.d(tag, checkEmpty(content));
    }

    public static void d(String tag, String content, String tr) {
        Log.d(tag, checkEmpty(content));
    }


    public static void e(String tag, String content, Throwable tr) {
        Log.e(tag, checkEmpty(content),tr);
    }

    public static void d(String content, Throwable tr) {
        Log.d(TAG, content, tr);
    }


    public static void w(String content, Throwable tr) {
        Log.e(TAG, content, tr);
    }

    public static void e(String content, Throwable tr) {
        Log.e(TAG, content, tr);
    }

    public static void e(String tag, String content) {
        Log.e(tag, content);
    }

    public static void w(String tag, String content) {
        Log.e(tag, content);
    }

    public static void d(String tag, String content) {
        Log.e(tag, content);
    }
}
