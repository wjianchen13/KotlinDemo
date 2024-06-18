package com.example.kotlin.first.npe

/**
 *
 */
class Student(val name : String, val age : Int) : Study{

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