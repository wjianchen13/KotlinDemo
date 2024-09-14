package com.example.kotlin.first.obj.obj12

open class Person121(val name: String, val age: Int) {

    constructor() :  this("", 1)  {

    }

    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }
}
