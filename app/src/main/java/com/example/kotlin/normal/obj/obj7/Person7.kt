package com.example.kotlin.normal.obj.obj7

open class Person7(val name : String, val age : Int) {

    init {
        println("Person7 init name:" + name  + "  age: " + age)
    }

    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }
}
