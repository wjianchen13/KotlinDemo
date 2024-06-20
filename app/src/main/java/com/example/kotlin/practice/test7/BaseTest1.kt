package com.example.kotlin.practice.test7

/**
 *
 */
open class BaseTest1<V : IBaseView1?>(var view : V) {

    fun test1() {
        view?.test1()
    }

    companion object {
        private val TAG = BaseTest1::class.java.simpleName
    }
}