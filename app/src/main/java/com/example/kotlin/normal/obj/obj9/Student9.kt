package com.example.kotlin.normal.obj.obj9

/**
 * Student类的后面没有显式地定义主构造函数，同时又因为定义了
 * 次构造函数，所以现在Student类是没有主构造函数的。那么既然没有主构造函数，继承
 * Person类的时候也就不需要再加上括号了
 */
class Student9 : Person9 {

    constructor(name : String, age : Int) : super(name, age) {

    }

    constructor(name : String, age : Int, sex : Int) : super(name, age, sex) {

    }


    /**
     * Kotlin给我们提供了一个init结构体，所有主构造函数中的逻辑都可以写在里面
     * Kotlin中的init代码块用于初始化属性，并执行在创建类的实例时需要运行的代码。它是主要构造函数的一部分，
     * 在对象初始化阶段被调用。有点类似于Java中的static代码块，在创建类时就需要初始化的内容。
     * 如果有多个构造函数，无论调用哪个构造函数，init块总是会被执行。
     */
    init {
        println("init name:" + name  + "  age: " + age)
    }

    fun info() {
        println("name:" + name  + "  age: " + age)
    }
}