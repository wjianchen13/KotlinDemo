package com.example.kotlin.practice.test11

/**
 *
 */
class PracticeTest() {

    var name : String ? = null
    var age : Int = 0

    constructor(name : String, age : Int) : this() {
        this.name = name
        this.age = age
    }

    fun logName() {
        println("=====================> name: $name")
    }

    fun logAge() {
        println("=====================> age: $age")
    }

}