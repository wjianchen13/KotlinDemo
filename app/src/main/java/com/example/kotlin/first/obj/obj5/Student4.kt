package com.example.kotlin.first.obj.obj5

/**
 * 你要知道，任何一个类只能有一个主构造函数，但是可以有多个次构造函数。次构造函数也可
 * 以用于实例化一个类，这一点和主构造函数没有什么不同，只不过它是有函数体的。
 * Kotlin规定，当一个类既有主构造函数又有次构造函数时，所有的次构造函数都必须调用主构造
 * 函数（包括间接调用）
 */
class Student4(val sno : String, val grade : Int, name : String, age : Int) : Person4(name, age) {

    constructor(name : String, age : Int) : this("", 0, name, age) {

    }

    constructor() : this("", 0) {

    }

    /**
     * Kotlin给我们提供了一个init结构体，所有主构造函数中的逻辑都可以写在里面
     */
    init {
        println("init sno:" + sno  + "  grade: " + grade)
    }

    fun info() {
        println("name:" + name  + "  age: " + age + " sno: " + sno + "  grade: " + grade)
    }
}