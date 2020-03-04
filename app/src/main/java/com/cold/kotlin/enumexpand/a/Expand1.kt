package com.cold.kotlin.enumexpand.a

import com.cold.kotlin.enumexpand.b.*

/**
 * 不同包之前的扩展，需要使用import导入需要的资源
 */
class MyClass {

}

fun main(args : Array<String>) {
    var myClass = MyClass()
    println("===============> add: ${myClass.add(1, 2)}")
}