package com.example.kotlin.practice.test4

class SingletonTest private constructor() {

    companion object {
        @Volatile private var instance: SingletonTest? = null
        fun getInstance(): SingletonTest {
            return instance ?: synchronized(this) {
                instance ?: SingletonTest().also { instance = it }
            }
        }
    }

    fun test() {

    }

}