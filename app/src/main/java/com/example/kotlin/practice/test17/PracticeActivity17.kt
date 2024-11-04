package com.example.kotlin.practice.test17

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.test16.Test3

/**
 * 标签
 * 【Kotlin从入门到深坑】之返回和跳转
 * https://blog.csdn.net/guohaiyang1992/article/details/72823992
 *
 */
class PracticeActivity17 : AppCompatActivity() {

    private var ints = intArrayOf(1, 2, 3, 4, 5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice17)
    }

    /**
     * 测试1
     */
    fun onTest1(v : View) {
        loop@ for (i in 1..10) {
            for (j in 1..10) {
                if (j == 2) {
                    break@loop
                }
                println(i.toString() + ":" + j.toString())
            }
        }
    }

    /**
     * 测试
     */
    fun onTest2(v : View) {
        loop@ for (i in 1..10) {
            for (j in 1..10) {
                if (j == 2) {
                    continue@loop //只是修改此处
                }
                println(i.toString() + ":" + j.toString())
            }
        }
    }

    /**
     * 测试3
     */
    fun onTest3(v : View) {
        foo()
    }

    fun foo() {
        ints.forEach {
            if (it == 2) return
            println(it)
        }
    }


    /**
     * 测试
     */
    fun onTest4(v : View) {
        foo1()
    }

    fun foo1() {
        ints.forEach lit@ { //注意此处的位置
            if (it == 2) return@lit
            println(it)
        }
    }

    /**
     * 测试
     */
    fun onTest5(v : View) {
        foo2()
    }

    fun foo2() {
        ints.forEach {
            if (it == 2) return@forEach
            println(it)
        }
    }

    /**
     * 测试
     */
    fun onTest6(v : View) {
        foo3()
    }

    fun foo3() {
        ints.forEach(fun(value: Int) {
            if (value == 2) return
            println(value)
        })
    }

}