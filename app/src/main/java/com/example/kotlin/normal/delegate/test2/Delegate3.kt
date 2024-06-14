package com.example.kotlin.normal.delegate.test2

import kotlin.reflect.KProperty

class Delegate3<T> {

    var propValue: Any? = null

    operator fun getValue(myClass: T, prop: KProperty<*>): Any? {
        println("=======================> Delegate3 getValue")
        return propValue
    }

    operator fun setValue(myClass: T, prop: KProperty<*>, value: Any?) {
        println("=======================> Delegate3 setValue: $value")
        propValue = value
    }

}