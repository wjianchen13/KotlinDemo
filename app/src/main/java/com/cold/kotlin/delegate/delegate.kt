package com.cold.kotlin.delegate

interface Base {
    fun print()
}

class BaseImpl(val x : Int) : Base {
    override fun print() {
        print(x)
    }
}

class Derived(b : Base) : Base by b {
    fun getName() : String {
        return "Bill"
    }
}

fun main() {
    val b = BaseImpl(10)
    Derived(b).print()
}