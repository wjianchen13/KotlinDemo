package com.example.kotlin.normal.generic.test6

class SimpleData<T> {

    private var data: T? = null

    fun set(t: T?) {
        data = t
    }

    fun get(): T? {
        return data
    }

}