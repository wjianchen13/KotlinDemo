package com.example.kotlin.mvc.kotlin.utils;

import android.util.Log;

public class Utils {

    public static void log(String str) {
        System.out.println("=========================> " + str);
    }

    public static void i(String tag, String str) {
        Log.i(tag, "===========================> " + str);
    }
}
