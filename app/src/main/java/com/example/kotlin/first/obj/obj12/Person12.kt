package com.example.kotlin.first.obj.obj12

open class Person12 {

//    init {
//        println("=========================> constructor init")
//    }

    constructor() {
        println("=========================> constructor 0")
    }

    constructor(name : String) : this() {

    }

    var name = ""
    var age = 0
    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }
}
