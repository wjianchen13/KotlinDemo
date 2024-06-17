package com.example.kotlin.normal.generic.test7

interface Transformer2<in T> {
    fun transform(name: String, age: Int): @UnsafeVariance T
}