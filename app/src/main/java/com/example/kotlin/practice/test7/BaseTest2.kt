package com.example.kotlin.practice.test7

/**
 *
 */
class BaseTest2<V : IBaseView2>(view : V) : BaseTest1<V>(view) {

    fun test2() {
        view?.test2()
    }

    companion object {
        private val TAG = BaseTest2::class.java.simpleName
    }

}