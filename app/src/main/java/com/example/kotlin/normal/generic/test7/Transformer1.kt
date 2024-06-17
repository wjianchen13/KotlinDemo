package com.example.kotlin.normal.generic.test7

interface Transformer1<in T> {

    fun transform(t: T): String

}