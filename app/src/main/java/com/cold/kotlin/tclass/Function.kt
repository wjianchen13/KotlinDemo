package com.cold.kotlin.tclass

/**
 * kotlin函数
 * 函数既可以在类外部定义，也可以在类内部定义，如果是前者，是全局函数
 * 如果是后者，是类成员函数。函数也支持默认参数，带默认值的参数必须是最后
 * 几个参数。
 * kotlin允许使用命名参数传递参数值，就是在调用函数时指定函数的形参名，
 * 为了解决函数默认参数过多指定后面默认参数导致传递参数过多的情况
 * 如果传入的参数个数不固定，要使用可变参数，可变参数使用vararg关键字声明
 *
 */
class Function {
    fun test1(name : String, age : Int = 10) {
        println("====================> name: $name  age: $age")
    }

    fun test2(name : String, age : Int = 10, sex : String = "男", height : Int = 180) {
        println("====================> name: $name  age: $age   sex: $sex   height: $height")
    }

    fun test3(vararg values : String) : List<String> {
        val result = ArrayList<String>()
        for(s in values) {
            result.add(s)
        }
        return result
    }

    fun test4() {
        println("====================> varargs test: ${test3("a", "b", "c", "d", "e")}")
    }

    /**
     * 如果kotlin函数体只有一行代码，可以直接在函数声明后面加上等号（=），后面
     * 直接跟代码，这种表达式也可以省略函数的返回值
     *
     */
    private var mName : String = "hello"
    fun getName() : String {
        return mName
    }
    fun getName1() : String = mName
    fun getName2() = mName

    /**
     * kotlin还有一种叫本地函数，它是在函数体内部定义的函数，这种函数的作用域
     * 就是包含本地函数的函数体
     */
    fun test5(name : String) {
        fun test6(age : Int) {
            println("====================> age: $age")
        }
        test6(100)
        println("====================> name: $name")
    }
}

/**
 * 嵌套类
 * 嵌套类就是在类中定义的类
 * 嵌套类可以使用关键字inner声明，这样就可以通过外部类的实例引用嵌套类。
 *
 */

class Outer1 {
    private val bar : Int = 1
    class Nested {
        fun foo() = 2
    }
}

class Outer2 {
    private val bar : Int = 1
    inner class Nested {
        fun foo() = 3
    }
}

fun main(args : Array<String>) {
    var f = Function()

    f.test1("hello")
    f.test2("hello", height = 189)
    f.test4()
    f.test5("hello")

    val outer1 = Outer1.Nested().foo()
    println("====================> outer1: $outer1")

    val outer2 = Outer2().Nested().foo()
    println("====================> outer2: $outer2")
 }