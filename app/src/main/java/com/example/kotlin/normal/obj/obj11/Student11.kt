package com.example.kotlin.normal.obj.obj11

import com.example.kotlin.normal.obj.obj10.Person10

/**
 * Student类的后面没有显式地定义主构造函数，同时又因为定义了
 * 次构造函数，所以现在Student类是没有主构造函数的。那么既然没有主构造函数，继承
 * Person类的时候也就不需要再加上括号了
 */
class Student11(name : String, age : Int) : Person11(name, age), Study2{

    override fun readBooks() {
        println(name + " is reading.")
    }

    fun info() {
        println("name:" + name  + "  age: " + age)
    }
}