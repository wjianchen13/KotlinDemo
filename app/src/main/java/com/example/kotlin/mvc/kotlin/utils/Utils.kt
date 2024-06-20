package com.example.kotlin.mvc.kotlin.utils

import android.util.Log

object Utils {

    @JvmStatic
    fun log(str: String) {
        println("=========================> $str")
    }

    @JvmStatic
    fun i(tag: String?, str: String) {
        Log.i(tag, "===========================> $str")
    }

}