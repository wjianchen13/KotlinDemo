package com.example.kotlin.first.standard

class Util3 {
    fun doAction1() {
        println("do action1")
    }

    /**
     * 前面使用的单例类和companion object都只是在语法的形式上模仿了静态方法
     * 的调用方式，实际上它们都不是真正的静态方法。因此如果你在Java 代码中以静态方法的形式
     * 去调用的话，你会发现这些方法并不存在。而如果我们给单例类或companion object中的方
     * 法加上@JvmStatic注解，那么Kotlin 编译器就会将这些方法编译成真正的静态方法
     */
    companion object {
        @JvmStatic
        fun doAction2() {
            println("do action2")
        }
    }
}