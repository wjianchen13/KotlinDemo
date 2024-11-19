package com.example.kotlin.practice.test4

class SingletonTest3 /*private constructor()*/ {

    private constructor() {

    }

    companion object {
        @Volatile private var instance: SingletonTest3? = null

        fun getInstance(): SingletonTest3 {
            return instance ?: synchronized(this) {
                instance ?: SingletonTest3().also {
                    instance = it
                }
            }
        }

    }

    fun test() {

    }

}