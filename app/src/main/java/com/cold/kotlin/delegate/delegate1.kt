package com.cold.kotlin.delegate

import kotlin.reflect.KProperty

class Delegate {
    var name : String = ""
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

class MyClass1 {
    var name : String by Delegate()
}

class MyClass2 {
    var name : String by Delegate()
}

fun main() {
    var c1 = MyClass1()
    var c2 = MyClass2()
    c1.name = "Bill"
    c2.name = "Mike"
    println("===============> c1.name ${c1.name}")
    println("===============> c2.name ${c2.name}")
}