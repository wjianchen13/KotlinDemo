package com.cold.kotlin.delegate

import kotlin.reflect.KProperty

public fun <T>delegate1(initializer:() -> T) : Delegate1<T> = Delegate1(initializer)

class MyClass3 {
    var name : String by delegate1 {
        println("================> MyClass3.name 初始化函数被调用")
        "<MyClass3>"
    }
}

class MyClass4 {
    var name : String by delegate1 {
        println("================> MyClass4.name 初始化函数被调用")
        "<MyClass4>"
    }
}

class Delegate1<T>(initializer: () -> T) {
    var name : String = ""
    var className = initializer()
    operator fun getValue(thisRef : Any?, property : KProperty<*>) : String {
        val className = thisRef.toString().substringBefore("@")
        println("===============> className: ${className}.get 已经被调用")
        return name
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value : String) {
        val className = thisRef.toString().substringBefore("@")
        println("===============> className: ${className}.set 经被调用")
        name = value
    }
}

fun main() {
    var c1 = MyClass3()
    var c2 = MyClass4()
    c1.name = "Bill1"
    c2.name = "Mike1"
    println("===============> c1.name ${c1.name}")
    println("===============> c2.name ${c2.name}")
}

