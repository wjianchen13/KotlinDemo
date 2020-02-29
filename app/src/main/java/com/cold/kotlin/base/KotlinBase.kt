package com.cold.kotlinstudy.base

/**
 * kotlin基础
 */
fun main(args : Array<String>) {
    defineVariable()
    println("=========> 2 + 3 = " + add(2, 3))
    log(5, 6)
}

/**
 * 定义变量
 * 1.kotlin定义变量，数据类型要放到变量后面，并且用冒号：分隔
 * 2.定义变量使用var关键字，定义常量使用val关键字
 * 3.数据类型都以大写字母开头
 * 4.如果定义变量时未进行初始化，就必须指定数据类型，如果已经初始化，可以不指定数据类型
 * kotlin编译器能够自动推导出数据类型
 */
private fun defineVariable() {
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
 * 1.使用fun关键字
 * 2.参数定义和kotlin定义变量方式相同
 * 3.返回值定义在函数末尾，用冒号：隔开
 * 4.如果没有返回值可以返回Unit，或者省略
 *
 * /* 嵌套注释 */
 */
fun add(x : Int, y : Int) : Int {
    return x + y
}

fun log(a : Int, b : Int) {
    println(a + b)
}

