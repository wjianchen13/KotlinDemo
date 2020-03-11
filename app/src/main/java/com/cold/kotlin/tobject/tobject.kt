package com.cold.kotlin.tobject

open class MyClass(name : String) {
    open var name = name
    open fun verify() {
        println("===============> verify")
    }
}

fun process(obj : MyClass) {
    obj.verify()
}

fun main() {
    process(object : MyClass("Bill") {
        override fun verify() {
            println("================> object verify")
        }
    })
}

/**
 * 匿名对象
 * 匿名对象只能在本地函数或private声明中
 */
class MyClass1 {
    private fun foo() = object {
        var x : String = "x"
    }

    fun pfoo() {
        var x : String = "x"
    }

    fun bar() {
        var x1 = foo().x
//        var x2 = pfoo().x
    }
}

/**
 * 陪伴对象
 */
class MyClass2 {
    companion object Factory {
        fun create() : MyClass2 = MyClass2()
    }
}

val instance = MyClass2.create()