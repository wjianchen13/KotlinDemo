package com.cold.kotlin.tclass

/**
 * 单例模式
 * 使用private来申明第一构造器和第二构造器的方式
 */
class SingleTon private constructor() {
    public var value : SingleTon? = null

    private object mHolder {
        val INSTANCE = SingleTon()
    }

    companion object Factory {
        fun getInstance() : SingleTon {
            return mHolder.INSTANCE
        }
    }
}

fun main(args : Array<String>) {
    var obj1 = SingleTon.getInstance()
    var obj2 = SingleTon.getInstance()
    println(obj1)
    println(obj2)
}