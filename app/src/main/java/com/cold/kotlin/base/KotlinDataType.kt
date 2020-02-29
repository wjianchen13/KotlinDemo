package com.cold.kotlin.base

fun main() {
//    testType()
//    special()
//    testChar()
//    testBoolean()
//    testArray()
    testString()

}

/**
 * Kotlin数据类型
 * kotlin内置的数据类型有
 * 数据类型      占用字节数
 * Double        8
 * Long          8
 * Float         4
 * Int           4
 * Short         2
 * Byte          1
 * 整数默认类型是Int，浮点数默认类型是Double
 * Kotlin数据类型不能进行强制转换，需要使用如下方法进行类型转换
 * toByte(),toShort()...在类型前面使用toXxx()方法
 *
 */
fun testType() {
    var m = 20
    val n : Byte = 10
    m = n.toInt()
    val x : Long = 20
    val value : Short = 20
    m = value.toInt()
}

/**
 * Kotlin数值类型的一些特殊表示法
 * 1.表示Long类型，在数值后面加上L或l，如123L
 * 2.表示Float类型，在数值后面添加F或f，如123.1F
 * 3.在数值前面添加0x表示十六进制，如0x1f
 * 4.在数值前面添加0b表示二进制，如0b1000010
 * 5.使用下划线作为数值分隔符，可以任意插在数值之间，具体根据需要表示含义进行插入
 */
fun special() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_1234_1234_1234
    println("======================> oneMillion: $oneMillion")
    println("======================> creditCardNumber: $creditCardNumber")
}

/**
 * 字符类型
 * kotlin使用Char描述字符类型，不能直接看做是数字，使用单引号表示
 * 可以用toInt()方法吧字符串转换成对应的ASCII码
 *
 */
fun testChar() {
    var c : Char = 'c'
    println("======================> c: ${c.toInt()}")
}

/**
 * kotlin布尔类型使用Boolean表示
 * Boolean有2个值：true和false
 * 有3中操作：逻辑或(||) 逻辑与(&&) 逻辑非(!)
 */
fun testBoolean() {
    var flag1 : Boolean = true
    val flag2 : Boolean = false
    flag1 = false
    if(flag1 && !flag2) {
        println("flag1 && !flag2")
    }
    if(!flag1 || flag2) {
        println("!flag1 || flag2")
    }
}

/**
 * 数组
 * kotlin使用Array类描述数组
 * 数组定义有多种方式
 * 1.使用arrayOf函数定义可以存储任意值得数组
 * 2.使用arrayOfNulls函数定义指定长度的空数组
 * 3.使用Array类的构造器指定数组长度和初始化数组的方式
 * 4.使用intArrayOf，shortArrayOf等函数定义并初始化数组
 *
 */
fun testArray() {
    // 使用arrayOf定义数组
    val arr1 = arrayOf(1, 2, 3, 'a')
    println(arr1[3])
    arr1[2] = 'b'
    println(arr1[2])

    // 使用arrayOfNull函数定义数组
    var arr2 = arrayOfNulls<Int>(10)
    println("======================> arr2 length: ${arr2.size}")

    // 使用Array类构造器定义数组，第二个参数初始化每一个数组元素的值
    var arr3 = Array(10, {i -> i + 1})
    for(arr in arr3) {
        println("======================> arr3: $arr")
    }

    //使用intArrayOf函数定义数组
    var arr4 : IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("======================> arr4[2]: $arr4[2]")
}

/**
 * 字符串
 * kotlin字符串使用String表示
 * 1.普通字符串，需要放在双引号中，可以在字符串中加上转义字符
 * 2.保留格式字符串，需要放在3个双引号中，不能使用转义符，将保留字符串的格式，如换行，空格
 * 3.字符串模板，在字符串中添加占位符，内容后期指定，使用模板符号($)
 */
fun testString() {
    var s1 : String = "hello \n world"
    var s2 : String = """hello
        world
    """
    println("======================> s1: $s1")
    println("======================> s2: $s2")
}




