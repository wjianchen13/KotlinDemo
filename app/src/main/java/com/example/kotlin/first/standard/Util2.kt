package com.example.kotlin.first.standard

/**
 * object声明（一个类）是延迟加载的，只有当第一次被访问时才会初始化，所以被用来实现单例
 * companion object是当包含它的类被加载时就初始化了的，这一点和Java的static还是一样的
 */
class Util2 {
    fun doAction1() {
        println("do action1")
    }

    /**
     * doAction2()方法其实也并不是静态方法， companion object这个关键字实际上会
     * 在Util类的内部创建一个伴生类，而doAction2()方法就是定义在这个伴生类里面的实例方
     * 法
     */
    companion object {
        fun doAction2() {
            println("do action2")
        }
    }
}