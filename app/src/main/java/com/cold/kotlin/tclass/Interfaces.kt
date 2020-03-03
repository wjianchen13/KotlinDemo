package com.cold.kotlin.tclass

/**
 * kotlin接口使用interface关键字声明，接口中所有的属性和方法都是open的
 * 接口中允许方法包含默认的方法体，对于有方法体的接口，并不要求一定要重写该方法
 *
 */
interface MyInterface {
    fun process()
    fun getName() : String {
        return "hello"
    }
}

class MyClass : MyInterface {
    override fun process() {
        println("===============> process")
    }

    override fun getName(): String {
        return "world"
    }
}

fun main(args : Array<String>) {
    var m = MyClass()
    println("===============> name: ${m.getName()}")
    m.process()
}