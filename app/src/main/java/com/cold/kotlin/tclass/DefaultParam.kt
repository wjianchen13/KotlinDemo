package com.cold.kotlin.tclass

/**
 * kotlin默认参数
 * kotlin支持默认参数，kotlin编译器在编译时，如果主构造器有默认参数
 * 不仅回升长对应的构造器，还会生成一些辅助构造器，在调用的时候，尽管调用
 * 主构造器创建类的实例，但是实际上是调用了另外一个自动生成的构造器，并在该
 * 构造器中指定了所有的默认参数，最后才调用类中定义的构造器。
 *
 */
class Person1(val name : String = "hello", var age : Int = 20) {
    init {
        println("=================> name: $name  age: $age")
    }

}

fun main(args : Array<String>) {
    Person1();
}
