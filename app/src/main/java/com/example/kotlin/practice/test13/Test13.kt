package com.example.kotlin.practice.test13

import android.content.Context
import android.widget.ImageView

object Test13 {


    @JvmOverloads
    @JvmStatic
    fun test(a: Int, b: Int, c: Boolean = false) {
        println("============> a: $a  b: $b  c: $c ")
    }


    @JvmOverloads
    @JvmStatic
    fun loadAvatar(context: Context?, avatar: String?, imageView: ImageView?, isCircle: Boolean = false) {
        println("============> a: $avatar ")
    }
}