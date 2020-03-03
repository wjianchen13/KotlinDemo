package com.cold.kotlin.tclass

/**
 * 抽象类需要使用abstract声明，抽象类实现接口之后，接口中没有函数体的
 * 函数可以不用重写，这些方法被自动继承到抽象类中，成为抽象方法
 * 抽象方法不需要使用open声明，因为抽象类本身就是可以继承的。
 */
interface IBase {
    fun process()
    fun getName() : String {
        return "hello"
    }
}


open class Base {
    open fun f() {

    }
}

abstract class Derived : Base(), IBase {
    override abstract fun f()
}

class Child : Derived() {
    override fun f() {
        println("===============> abstract test")
    }

    override fun process() {
        println("===============> process")
    }
}

fun main(args : Array<String>) {
    Child().f()
    Child().process()
}