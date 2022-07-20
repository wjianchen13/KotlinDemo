package com.example.kotlin.normal.obj

/**
 * Student类的后面没有显式地定义主构造函数，同时又因为定义了
 * 次构造函数，所以现在Student类是没有主构造函数的。那么既然没有主构造函数，继承
 * Person类的时候也就不需要再加上括号了
 */
class Student6(name : String, age : Int) : Person6(name, age), Study{

    override fun readBooks() {
        println(name + " is reading.")
    }

    override fun doHomework() {
        println(name + " is doing homework.")
    }

    fun info() {
        println("name:" + name  + "  age: " + age)
    }
}