package com.example.kotlin.practice.test11

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * let、run、with、apply和also
 */
class PracticeActivity11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice11)
    }

    /**
     * let
     */
    fun onTest1(v : View) {
        initLet()
    }

    private fun initLet() {
        var test1 = PracticeTest()
        /**
         * 当Lambda 表达式的参数列表中只有一个参数时，可以不用声明参数名，直接使用it关键字来代替即可
         */
        test1?.let {
            it.logName()
            it.logAge()
        }

        test1.let { ts1 ->
            ts1.logName()
            ts1.logAge()
        }
    }

    /**
     * run
     */
    fun onTest2(v : View) {
        initRun()
    }

    /**
     * run函数通常不会直接调用，
     * 而是要在某个对象的基础上调用；其次run函数只接收一个Lambda 参数，并且会在Lambda 表
     * 达式中提供调用对象的上下文，可以自定义返回值
     */
    private fun initRun() {
        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
        val result = StringBuilder().run {
            append("Start eating fruits.\n")
            for (fruit in list) {
                append(fruit).append("\n")
            }
            append("Ate all fruits.")
            toString()
        }
        println(result)
    }

    /**
     * with
     */
    fun onTest3(v : View) {
        initWith()
    }

    /**
     * with函数接收两个参数：你正在操作的对象和一个包含在该对象上执行的操作的lambda。在这个lambda内部，可以直接访问对象的成员，无需用对象的名字或引用作为前缀。
     * with函数会在Lambda 表达式中提供第一个参数对象的上下文，并使用Lambda 表达式中的最后一行代码作为返回值返回
     */
    private fun initWith() {
        var test1 = PracticeTest()
        with(test1) {
            logAge()
            logName()
        }

        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
        val result = with(StringBuilder()) {
            append("Start eating fruits.\n")
            for (fruit in list) {
                append(fruit).append("\n")
            }
            append("Ate all fruits.")
            toString()
        }
        println(result)
    }

    /**
     * apply
     */
    fun onTest4(v : View) {
        initApply()
    }

    /**
     * apply函数和run函数也是极其类似的，都要在某
     * 个对象上调用，并且只接收一个Lambda 参数，也会在Lambda 表达式中提供调用对象的上下
     * 文，但是apply函数无法指定返回值，而是会自动返回调用对象本身
     */
    private fun initApply() {
        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
        val result = StringBuilder().apply {
            append("Start eating fruits.\n")
            for (fruit in list) {
                append(fruit).append("\n")
            }
            append("Ate all fruits.")
        }
        println(result.toString())
    }

    /**
     * also
     */
    fun onTest5(v : View) {
        initAlso()
    }

    /**
     * 使用 also 可以在调用某个函数或操作之前，先对该对象进行一些其他的处理或操作，而无需使用中间变量
     */
    private fun initAlso() {
        val name = "Alice"
        val length = name.also {
            println("The length of the name is ${it.length}")
        }.length
        println("The length of the name is $length")

    }

}