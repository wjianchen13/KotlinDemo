package com.cold.kotlin.tpackage

//import a.b.getPersonName
//import a.b.Person

import a.b.getPersonName as n
import a.b.Person as p

/**
 * Kotlin的包和目录没有任何关系，仅仅是为了引用文件中的资源而设计的
 * 在kotlin中，直接使用添加包名和引用名称的方式引用方法和类
 * 也可以适应import导入对应的函数和方法
 * 可以使用import给导入的资源起一个别名，使用关键字as
 */
fun main(args : Array<String>) {
    // 直接引入使用
//    println(a.b.getPersonName())
//    println(a.b.Person())

    // 使用import引入使用
//    println(getPersonName())
//    println(Person())

    // 使用别名
    println(n())
    println(p())
}