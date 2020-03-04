package com.cold.kotlin.enumexpand

/**
 * kotlin扩展既可以对JDK API进行扩展，也可以对kotlin原生API进行扩展
 */

/***
 * 为MutableList类添加一个swap方法，用来交换任意两个集合元素的位置
 */
fun MutableList<Int>.swap(index1 : Int, index2 : Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

/***
 * 为JDK标准集合类ArrayList类添加一个swap方法，用来交换任意两个集合元素的位置
 */
fun ArrayList<Int>.swap(index1 : Int, index2 : Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

/**
 * 扩展自定义类
 * open关键字不能用在顶层函数中，所以下列例子扩展是不能添加可继承的成员函数的
 */
open class Parent(val value1 : Int, val value2 : Int) {
    var mValue1 = value1
    var mValue2 = value2

    fun add() : Int {
        return mValue1 + mValue2
    }
}

class Child(value1 : Int, value2 : Int) : Parent(value1, value2) {
    fun sub() : Int {
        return mValue1 - mValue2
    }
}

fun Parent.printResult() {
    println("===============> add result: ${add()}")
}

fun Child.printResult() {
    println("===============> sub result: ${sub()}")
}

/**
 * 如果类内部的成员函数和通过扩展添加的成员函数冲突，内部成员函数的优先级
 * 更高，无法通过扩展的的方式覆盖内部的成员函数
 */
class Parent1 {
    fun printlnResult() {
        println("===============> Parent1 printResult")
    }
}

fun Parent1.printlnResult() {
    println("===============> expand Parent1 printlnResult")
}

/**
 * 扩展属性
 * 通过扩展添加的属性没有backing field，因此扩展属性需要实现setter为属性初始化
 */
class MyClass {
    var mValue : Int = 0
    var str : String = ""
        get() = field
        set(value) {
            field = value
        }
}

var MyClass.value : Int
    get() = mValue
    set(value) {
        mValue = value
    }

/**
 * 在类内使用扩展
 */
class Parent2 {
    fun bar() {
        println("===============> Parent bar")
    }

    override fun toString() : String {
        return "Parent2"
    }
}

class Child1 {
    fun baz() {
        println("===============> Child1 baz")
    }

    fun Parent2.foo() {
        bar()
        baz()
    }

    fun caller(p : Parent2) {
        p.foo()
    }

    override fun toString() : String {
        return "Child1"
    }

    fun Parent2.test() {
        println(toString())
        println(this@Child1.toString())
    }

    fun process(p : Parent2) {
        p.test()
    }

}

/**
 * 扩展成员的继承
 * 写在顶层的扩展成员是不能被继承的，因为无法添加open关键字，但是在类中扩展是可以添加open关键字的
 */
open class Parent3 {

}

class Child3 : Parent3() {

}

open class Parent4 {
    open fun Parent3.foo() {
        println("===============> Parent3.foo in Parent4")
    }

    open fun Child3.foo() {
        println("===============> Child1.foo in Parent4")
    }

    fun caller(p3 : Parent3) {
        p3.foo()
    }
}

class Child4 : Parent4() {
    override fun Parent3.foo() {
        println("===============> Parent3.foo in Child4")
    }

    override fun Child3.foo() {
        println("===============> Child1.foo in Child4")
    }
}

fun main(args : Array<String>) {
//    val mutableList = mutableListOf(1, 2, 3)
//    mutableList.swap(0, 2)
//    println("===============> MutableList $mutableList")
//
//    var list : ArrayList<Int> = ArrayList()
//    list.add(1)
//    list.add(2)
//    list.add(3)
//    list.swap(0, 2)
//    println("===============> ArrayList $list")
//
//    //
//    var p1 : Parent = Parent(1, 2)
//    var p2 : Parent = Child(2, 1)
//    p1.printResult()
//    p2.printResult()

//    var p3 = Parent1()
//    p3.printlnResult()

//    var myClass = MyClass()
//    myClass.str = "hello"
//    myClass.value = 100
//    println("===============> str: ${myClass.str}  value: ${myClass.value}")

//    Child1().caller(Parent2())
//    Child1().process(Parent2())

    Parent4().caller(Parent3())
    Child4().caller(Parent3())
    Parent4().caller(Child3())
}

