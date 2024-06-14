package com.example.kotlin.normal.generic.test2

class MyClass2 {
    fun <T> method(param: T): T {
        return param
    }
}