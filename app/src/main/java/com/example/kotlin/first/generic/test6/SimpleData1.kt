package com.example.kotlin.first.generic.test6

class SimpleData1<out T>(val data: T?) {

    fun get(): T? {
        return data
    }

}