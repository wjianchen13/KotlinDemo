package com.cold.kotlinstudy.base

fun main(args : Array<String>) {
    testTem()
}

private fun define() {
    var m : Int = 20
    var price : Double = 10.6
    var flag : Boolean = true
    val v1 : Int = 10
    val v2 : Double = 10.0
}

private fun change() {
    var m = 20
    var n : Byte = 10
    m = n.toInt()
    var x : Long = 20
    var value : Short = 20
    m = value.toInt()
}

private fun separate() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5656_9012_1234L
}

private fun check(m : Char) {
    if(m == 'a')
        println("m == a: " + true)
}

private fun decimalDigitValue(c : Char) : Int {
    if(c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt()
}

private fun testBoolean() {
    var flag1 : Boolean = true
    val flag2 : Boolean = false
    if(flag1 && !flag2)
        println("true")
}

private fun testArrays() {
    val arr1 = arrayOf(1, 2, 3, '4')
    println(arr1[3])
    arr1[2] = 'b'
    println(arr1[2])

    var arr2 = arrayOfNulls<Int>(10)
    println("arr2 size: " + arr2.size)

    var arr3 = Array(10, {i ->
        (i * i).toString()
    })
    println(arr3[5])

    var arr4 : IntArray = intArrayOf(10, 20, 30)
    println(arr4[1])
}

private fun testString() {
    var s1 = "hello\nwrold"
    var s2 = """
        hello
        world
    """
    println(s1)
    println(s2)
}

private fun testTem() {
    val i = 10
    val s1 = "i = $i"
    println(s1)

    val s2 = "abc"
    val str = "$s2 length: ${s2.length}"
    println(str)
}