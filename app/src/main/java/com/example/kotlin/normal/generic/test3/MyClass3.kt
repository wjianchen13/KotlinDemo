package com.example.kotlin.normal.generic.test3

class MyClass3 {
    fun <T : Number> method(param: T): T {
        return param
    }

    /**
     * 所有的泛型都是可以指定成可空类型的
     */
    fun <T : Any?> method1(param: T): T {
        return param
    }

    /**
     * 泛型的类型不可为空
     */
    fun <T : Any> method2(param: T): T {
        return param
    }
}