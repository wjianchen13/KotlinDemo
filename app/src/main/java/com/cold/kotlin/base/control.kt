package com.cold.kotlin.base

fun main(args : Array<String>) {
//    normalif()
//    ifExpression()
//    normalWhen()
//    funExpression()
//    sameCode()
//    useIn()
//    expression()
//    useIterator()
//    useIndex1()
//    testWhile()
    testDoWhile();

}

/**
 *  条件语句
 */
private fun normalif() {
    var a : Int = 20
    var b = 30
    var max : Int
    if(a < b) max = b
    var min :Int
    if(a > b) {
        min = a
    } else {
        min = b
    }
    println("=============> min: " + min)
}

/**
 * 条件语句表达式
 */
private fun ifExpression() {
    var a : Int = 20
    var b = 30
    var max = if(a > b) a else b
    println("=============> max: " + max)
    var min = if(a < b) {
        println("=============> a: " + a)
        a
    } else {
        println("=============> b: " + b)
        b
    }
}

/**
 *  标准When语句
 */
private fun normalWhen() {
    var x = 1
    when(x) {
        1 -> {
            println("x = 1")
        }
        2 ->
            println("x = 2")
        else -> {
            println("x is other")
        }
    }
}

/**
 * when作为表达式使用
 */
private fun funExpression() {
    var x = 1
    var m = when(x) {
        1 -> {
            println("x = 1")
            1
        }
        2 -> {
            println("x = 2")
            2
        }
        else -> {
            println("x is other")
            3
        }
    }
    println("m = " + m)
}

/**
 * 多个条件执行代码一样，在一个分支用逗号分隔多个条件
 */
private fun sameCode() {
    var x = 1
    when(x) {
        1, 2 -> {
            println("x = 1 or x = 2")
        }
        3 -> {
            println("x = 3")
        }
        else -> {
            println("other")
        }
    }
}


/**
 * 使用in关键字确定范围
 */
private fun useIn() {
    var n = 25
    when(n) {
        in 1..10 -> println("test1")
        in 11..20 -> println("test2")
        in 21..30 -> println("test3")
        else -> println("test")
    }

}

/**
 * 条件是表达式
 */
fun getValue(x : Int) : Int {
    return x * x
}
fun expression() {
    var n = 4
    when(n) {
        getValue(2) -> println("满足条件")
        else -> println("条件未知")
    }
}

/**
 * for使用迭代器iterator枚举集合中的所有元素
 */
private fun useIterator() {
    var arr = intArrayOf(1, 2, 3, 4, 5)
    for(item : Int in arr)
        println(item)
}

/**
 * 使用索引枚举数组中的元素值
 */
private fun useIndex() {
    var arr = intArrayOf(1, 2, 3, 4, 5)
    for(i in arr.indices) {
        println("arr[$i] = " + arr[i])
    }
}

private fun useIndex1() {
    var arr = intArrayOf(1, 2, 3, 4, 5)
    for((index, value) in arr.withIndex()) {
        println("arr[$index] = " + value)
    }
}

/**
 * while语句
 */
private fun testWhile() {
    var i = 0
    while (i++ <10) {
        println("i = " + i)
    }
}

/**
 * do..while
 */
private fun testDoWhile() {
    var i = 10
    do {
        println("i = " + i)
    } while (--i > 0)
}





