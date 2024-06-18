package com.example.kotlin.first.obj.obj9

open class Person9(val name : String, val age : Int) {

    var mSex : Int = 0

    init {

    }

    constructor() : this("", 0) {

    }


    constructor(name : String, age : Int,  sex : Int) : this(name, age) {
        mSex = sex
    }

    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }
}
