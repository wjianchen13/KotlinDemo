package com.example.kotlin.first.delegate.test1

class MySet1<T>(val helperSet: HashSet<T>) : Set<T> by helperSet {
    fun helloWorld() = println("Hello World")
    override fun isEmpty() = false
}