package com.example.kotlin.normal.obj

/**
 * 在Kotlin中创建一个单例类的方式极其简单，只需要将class关键字改成object关键字即可
 * Kotlin在背后自动帮我们创建了一个Singleton类的实例，并且保证全局只会存在一个Singleton实例
 */
object Singleton {

    fun singletonTest() {
        println("singletonTest is called.")
    }

}