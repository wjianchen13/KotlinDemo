package com.example.kotlin.normal.delegate.test1

class MySet1<T>(val helperSet: HashSet<T>) : Set<T> by helperSet {
    fun helloWorld() = println("Hello World")
    override fun isEmpty() = false
}