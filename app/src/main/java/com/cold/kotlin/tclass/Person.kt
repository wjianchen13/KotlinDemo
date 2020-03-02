package com.cold.kotlin.tclass

/**
 * Kotlin类允许定义一个柱构造器和若干个第二构造器
 * 如果柱构造器中没有任何注释和修饰器，construction关键字可以省略
 * 柱构造器在init代码块中进行初始化，定义柱构造器可以使用var和val
 * 关键字，但是在构造器内部修改参数的变量值后，并不会把修改的值传递到外部
 * kotlin类中第二构造器需要在类中声明，前面必须添加construction关键字
 * 如果类中申明了柱构造器，所有第二构造器都需要在声明后面调用柱构造器，或者
 * 通过另外一个第二构造器间接调用柱构造器
 * 在主构造参数中可以使用var和val，但是在第二构造参数中不能使用var和val，所以
 * 第二构造器的参数都是只读的。
 * kotlin类的实例化并不需要使用关键字new，直接使用类名()的方式实例化类
 */
class Person(firstName : String) {
    var name = firstName
    init {
        println("====================> first name: $firstName")
    }

    constructor(age : Int) : this("test") {
        println("====================> age: $age")
    }

    constructor() : this(20) {
        println("====================> class")
    }

}

fun main(args : Array<String>) {
    Person()
}