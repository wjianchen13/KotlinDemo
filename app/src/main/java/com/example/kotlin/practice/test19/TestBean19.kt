package com.example.kotlin.practice.test19

/**
 * 父类是kotlin，子类是java，需要添加    @JvmField，让子类可以直接操作对应的属性
 */
open class TestBean19 {

    @JvmField
    var name = ""
    var age = 1

    @JvmOverloads constructor(name: String, sex: Int = 1, isChinese: Boolean = true) {

    }

}