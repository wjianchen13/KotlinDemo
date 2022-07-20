package com.example.kotlin.normal.obj

/**
 * Student类的后面没有显式地定义主构造函数，同时又因为定义了
 * 次构造函数，所以现在Student类是没有主构造函数的。那么既然没有主构造函数，继承
 * Person类的时候也就不需要再加上括号了
 */
class Student5: Person5 {

    constructor(name : String, age : Int) : super(name, age) {

    }

    /**
     * Kotlin给我们提供了一个init结构体，所有主构造函数中的逻辑都可以写在里面
     */
    init {
        println("init name:" + name  + "  age: " + age)
    }

    fun info() {
        println("name:" + name  + "  age: " + age)
    }
}