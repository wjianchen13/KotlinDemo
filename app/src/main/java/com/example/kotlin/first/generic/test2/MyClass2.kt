package com.example.kotlin.first.generic.test2

class MyClass2 {
    fun <T> method(param: T): T {
        return param
    }
}