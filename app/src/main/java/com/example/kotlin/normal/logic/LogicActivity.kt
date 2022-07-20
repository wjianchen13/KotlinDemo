package com.example.kotlin.normal.logic

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 程序逻辑控制
 */
class LogicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logic)
    }

    /**
     * java实现最大值
     */
    fun largerNumber(num1: Int, num2: Int): Int {
        var value = 0
        if (num1 > num2) {
            value = num1
        } else {
            value = num2
        }
        return value
    }

    /**
     *
     */
    fun onIf(v : View) {
        val a = 37
        val b = 40
        val value = largerNumber1(a, b)
        println("larger number is " + value)
    }

    /**
     * Kotlin中的if语句相比于Java 有一个额外的功能，它是可以有返回值的，返回值就是if语句每
     * 一个条件中最后一行代码的返回值。
     */
    fun largerNumber1(num1: Int, num2: Int): Int {
        val value = if (num1 > num2) {
            num1
        } else {
            num2
        }
        return value
    }

    /**
     * value其实也是一个多余的变量，我们可以直接将if语句返回，
     * 这样代码将会变得更加精简，
     */
    fun largerNumber2(num1: Int, num2: Int): Int {
        return if (num1 > num2) {
            num1
        } else {
            num2
        }
    }

    /**
     * 当一个函数只有一行代码时，可以省略函数体部分，直接将这一
     * 行代码使用等号串连在函数定义的尾部。
     */
    fun largerNumber3(num1: Int, num2: Int) = if (num1 > num2) {
        num1
    } else {
        num2
    }

    /**
     * 当一个函数中只有一行代码时，Kotlin允许我们不必编写函数体，可以直接将唯一的一行代码写
     * 在函数定义的尾部，中间用等号连接即可。
     */
    fun largerNumber4(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

    fun onWhen(v : View) {
        val num = 10
        checkNumber(num)
    }

    /**
     * 原始例子
     */
    fun getScore(name: String) = if (name == "Tom") {
        86
    } else if (name == "Jim") {
        77
    } else if (name == "Jack") {
        95
    } else if (name == "Lily") {
        100
    } else {
        0
    }

    /**
     * when语句允许传入一个任意类型的参数，然后可以在when的结构体中定义一系列的条件，格式
     * 是：
     * 匹配值 -> { 执行逻辑 }
     * 当你的执行逻辑只有一行代码时，{ }可以省略。这
     */
    fun getScore1(name: String) = when (name) {
        "Tom" -> 86
        "Jim" -> 77
        "Jack" -> 95
        "Lily" -> 100
        else -> 0
    }

    /**
     * 类型匹配
     */
    fun checkNumber(num: Number) {
        when (num) {
            is Int -> println("number is Int")
            is Double -> println("number is Double")
            else -> println("number not support")
        }
    }

    /**
     * when不带参数的写法
     */
    fun getScore2(name: String) = when {
        name == "Tom" -> 86
        name == "Jim" -> 77
        name == "Jack" -> 95

        name == "Lily" -> 100
        else -> 0
    }

    /**
     * 有些场景必须使用这种写法才能实现。举个
     * 例子，假设所有名字以Tom开头的人，他的分数都是86 分，这种场景如果用带参数的when语句
     * 来写就无法实现，而使用不带参数的when语句就可以这样写：
     */
    fun getScore3(name: String) = when {
        name.startsWith("Tom") -> 86
        name == "Jim" -> 77
        name == "Jack" -> 95
        name == "Lily" -> 100
        else -> 0
    }

    /**
     * 和java完全一样
     */
    fun onWhile(v : View) {

    }

    /**
     * 和java完全一样
     */
    fun onFor(v : View) {
        test1()

    }

    /**
     * 创建了一个0到10 的区间，并且两端都是闭区间，这意味着0到10 这两个端点都是包含在区间中的，用数学的方式表达出来就是[0, 10]
     */
    fun test1() {
        var range = 0..10
        for (i in 0..10) {
            println(i)
        }
    }

    /**
     * 使用until关键字来创建一个左闭右开的区间
     */
    fun test2() {
        var range = 0 until 10
        for (i in 0..10) {
            println(i)
        }
    }

    /**
     * 如果你想跳过其中的一些元素，可以使用step关键字
     */
    fun test3() {
        var range = 0 until 10
        for (i in 0..10 step 2) {
            println(i)
        }
    }

    /**
     * 果你想创建一个降序的区间，可以使用downTo关键字，
     */
    fun test4() {
        for (i in 10 downTo 1) {
            println(i)
        }
    }


}