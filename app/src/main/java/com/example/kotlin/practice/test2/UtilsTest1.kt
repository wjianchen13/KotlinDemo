package com.example.kotlin.practice.test2

import android.util.Log

/**
 * 定义了一个内部静态类，然后通过静态类的实例Companion来访问对应的接口
 */
class UtilsTest1 {

    companion object {

        @JvmStatic
        fun log(str: String) {
            println("=========================> $str")
        }

        @JvmStatic
        fun i(tag: String?, str: String) {
            Log.i(tag, "===========================> $str")
        }
    }
}
