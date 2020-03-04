package com.cold.kotlin.enumexpand

/**
 * 枚举类
 * 在默认状态下，直接输出枚举类的元素值，会输出元素值名称
 */
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

/**
 * 枚举类每一个值都是当前枚举类的对象，如果要为每一个枚举对象指定一个数字，可以
 * 直接通过构造器传入。
 * kotlin提供name和ordinal属性，分别用于获取枚举值名称和索引
 * 通过valueOf传入枚举名称获取枚举对应的数值
 * 如果想获取枚举类中所有的的枚举值对应的数值，使用values()方法
 *
 */

enum class Direction1 private constructor(val d : Int) {
    NORTH(1), SOUTH(2), WEST(3), EAST(4);

    override fun toString(): String {
        return d.toString()
    }
}

fun main(args : Array<String>) {
    var d1 : Direction
    var d2 : Direction = Direction.NORTH
    var d3 : Direction = Direction.EAST
    var d4 = Direction.EAST
    if(d3 == d4) {
        println("===============> 枚举类型值相等")
    } else {
        println("===============> 枚举类型值不相等")
    }
    println("===============> test1: ${Direction.EAST}")
    println("===============> test2: $d2")

    var d11 : Direction1 = Direction1.EAST
    var d12 = Direction1.NORTH
    println("===============> d11: $d11")
    println("===============> d12: $d12")

    // 其他方法
    println("===============> d11 name: ${d11.name}")
    println("===============> d11 ordinal: ${d11.ordinal}")
    println("===============> d11 WEST index: ${Direction1.valueOf("WEST")}")

    for(index in Direction1.values()) {
        println("===============> Direction index: $index")
    }
}

