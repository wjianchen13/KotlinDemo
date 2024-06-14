package com.example.kotlin.normal.delegate.test2

import kotlin.reflect.KProperty

class Delegate {

    var propValue: Any? = null

    operator fun getValue(myClass: MyClass, prop: KProperty<*>): Any? {
        println("=======================> Delegate getValue")
        return propValue
    }
    operator fun setValue(myClass: MyClass, prop: KProperty<*>, value: Any?) {
        println("=======================> Delegate setValue: $value")
        propValue = value
    }
}