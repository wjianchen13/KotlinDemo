package com.cold.kotlin.tclass

/**
 * kotlin属性
 * 完整语法如下：
 * var/val <propertyName> [:<PropertyType] [= <property_initializer]
 * [<getter>]
 * [<setter>]
 * 在上述属性语法中,只有var/val和propertyName是必须的,其他都是可选的
 * 对于只读属性来说，由于该属性只有 getter 方法，因此只能重写 getter方法；
 * 对于读写属性来说，由于该属性既有 getter 方法，也有 setter 方法，当属性
 * 有默认值时，开发者可以更新需要重写其中之一；当属性没有默认值时，必须重写两个方法
 * 在属性getter和setter中，可以将field当做成员变量使用，也就是通过field读写属性值
 *
 */
class Customer {
    var name : String = "bill"
    val value : Int = 20
    var flag : Boolean = true

    fun description() {
        println("================> name: $name   value: $value   flag: $flag")
    }

    var a : Int = 5

    var age : Int
    get() = a
    set(args) {
        println("================> 调用set()方法 ")
        a = args
    }

    var b : Int = 0
        get() = field
        set(value) {
            field = value
        }

}

fun main(args : Array<String>){
    var customer = Customer()
    customer.description()
    customer.age = 30
    println("================>  age: " + customer.age)
    customer.b = 50
    println("================>  b: " + customer.b)
}