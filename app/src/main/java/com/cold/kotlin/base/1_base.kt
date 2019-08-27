package com.cold.kotlinstudy.base

fun main(args : Array<String>) {
    define()
    println("=========> 2 + 3 = " + add(2, 3))
    log(5, 6)
}

private fun define() {
    var n : Int = 30
    var ok : Int
    val  m : Int = 20
    ok = 100
    var k = 10

    println("=========> n: " + n)
    println("=========> ok: " + ok)
    println("=========> m: " + m)
    println("=========> k " + k)
}

/**
 * kotlin函数
 * /* 嵌套注释 */
 */
fun add(x : Int, y : Int) : Int {
    return x + y
}

fun log(a : Int, b : Int) {
    println(a + b)
}

