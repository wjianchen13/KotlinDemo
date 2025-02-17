package com.example.kotlin.practice.test4

import com.example.kotlin.practice.JUtils

class SingletonTest4 private constructor() {

    init {
        JUtils.log("SingletonTest4 init")
    }

    companion object {
        val instance = Holder.INSTANCE
    }

    private object Holder {
        val INSTANCE = SingletonTest4()
    }

    fun test() {
        JUtils.log("SingletonTest4 test")
    }

}