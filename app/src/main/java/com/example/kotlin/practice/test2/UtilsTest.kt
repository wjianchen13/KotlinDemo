package com.example.kotlin.practice.test2

import android.util.Log

/**
 * 内部创建了UtilsTest的实例，方法是静态的
 */
object UtilsTest {

    @JvmStatic
    fun log(str: String) {
        println("=========================> $str")
    }

    @JvmStatic
    fun i(tag: String?, str: String) {
        Log.i(tag, "===========================> $str")
    }

}
