package com.example.kotlin.normal.delegate.test2

import kotlin.reflect.KProperty

class Delegate2 {

    var propValue: Any? = null

    operator fun getValue(myClass: MyClass2, prop: KProperty<*>): Any? {
        println("=======================> Delegate2 getValue")
        return propValue
    }

}