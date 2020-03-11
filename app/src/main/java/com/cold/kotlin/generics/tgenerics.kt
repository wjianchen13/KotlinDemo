package com.cold.kotlin.generics

/**
 * 泛型
 * 只在定义数据解构时，只指定类型的占位符，等到使用的时候再指定具体的数据类型
 *
 */
class Box<T>(t : T) {
    var value = t
}

fun main() {
    var b1 : Box<Int> = Box(20)
    var b2 : Box<String> = Box("test")
    println("===============> b1: ${b1.value}  b2: ${b2.value}")
}

abstract class Source<out T>
{
    abstract fun nextT() : T
}
fun demo(strs : Source<String>) {
    val objects : Source<Any> = strs
}

abstract class Comparable<in T> {
    abstract fun compare(other : T) : Int
}

fun demo(x : Comparable<Number>) {
    x.compare(1.0)
    val y : Comparable<Double> = x
}

