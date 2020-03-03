package com.cold.kotlin.tclass

/**
 * 修饰符
 * private：仅仅在类内部可以访问
 * protected：在类内部和子类可以访问
 * internal：在模块内部可以访问
 * public：任何外部类可以访问
 * 如果不指定修饰符，默认是public
 */

open class Outer { // open表示类是可以继承的
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4
    protected class Nested {
        public val e : Int = 5
    }
}

class Subclass : Outer() {
    // 无法访问父类的a常量，可以访问b，c，d和Nested类与e变量

    override val b = 5 // 重写父类的b常量
}