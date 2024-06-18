package com.example.kotlin.practice.test1

/**
 * 常见错误：在get, set，调用get, set,出现死循环（get不能return age,set不能直接age=10)——注意触发条件，set是赋值，get是调用；
 * 细节：val只有get方法，var两种方法都有；
 * 小技巧：若希望内部可以改变赋值，外部无法赋值，则私有化set方法
 */
class TestBean1 {

    var floatValue : Float = 757567.65f
        set(v) {
            // 这里使用field而不是使用lastName, 是因为如果使用lastName会造成递归调用从而造成内存溢出, 因为使用lastName也会涉及到调用set/get的问题
            field = v
            println("你设置了 floatValue哦 v:$v")
        }
        get() {
            println("你获取了 floatValue哦")
            return field
        }
}