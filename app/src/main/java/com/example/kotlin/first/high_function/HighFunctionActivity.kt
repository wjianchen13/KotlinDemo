package com.example.kotlin.first.high_function

import android.content.ContentValues
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 高阶函数
 * 如果一个函数接收另一个函数作为参数，或者返回值的类型是
 * 另一个函数，那么该函数就称为高阶函数
 * (String, Int) -> Unit
 */
class HighFunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_high_function)
    }

    fun example(func: (String, Int) -> Unit) {
        func("hello", 123)
    }

    fun test1(str : String, index : Int) : Unit {
        println("============= str: $str  index:$index")
    }

    /**
     * 高阶函数使用
     */
    fun onTest1(v : View) {
        example(::test1)
    }

    /**
     * 高阶函数使用
     */
    fun onTest2(v : View) {
        val num1 = 100
        val num2 = 80
        val result1 = num1AndNum2(num1, num2, ::plus)
        val result2 = num1AndNum2(num1, num2, ::minus)
        println("result1 is $result1")
        println("result2 is $result2")
    }

    /**
     * 高阶函数使用 lambda表达式
     */
    fun onTest3(v : View) {
        val num1 = 100
        val num2 = 80
        val result1 = num1AndNum2(num1, num2) { n1, n2 ->
            n1 + n2
        }
        val result2 = num1AndNum2(num1, num2) { n1, n2 ->
            n1 - n2
        }
        println("result1 is $result1")
        println("result2 is $result2")
    }

    /**
     * 模仿apply函数
     * 定义到StringBuilder传入lambda表达式会自动拥有StringBuilder的上下文
     */
    fun onTest4(v : View) {
        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
        val result = StringBuilder().build {
            append("Start eating fruits.\n")
            for (fruit in list) {
                append(fruit).append("\n")
            }
            append("Ate all fruits.")
        }
        println(result.toString())
    }

    /**
     * 内联函数测试
     */
    fun onTest5(v : View) {
        val num1 = 100
        val num2 = 80
        val result = num1AndNum2_2(num1, num2) { n1, n2 ->
            n1 + n2
        }
    }

    private fun printString(str: String, block: (String) -> Unit) {
        println("printString begin")
        block(str)
        println("printString end")
    }


    /**
     * lambda表达式局部返回
     */
    fun onTest6(v : View) {
        println("main start")
        val str = ""
        printString(str) { s ->
            println("lambda start")
            if (s.isEmpty()) return@printString
            println(s)
            println("lambda end")
        }
        println("main end")
    }

    inline fun printString_2(str: String, block: (String) -> Unit) {
        println("printString begin")
        block(str)
        println("printString end")
    }

    /**
     * 内联函数返回
     */
    fun onTest7(v : View) {
        println("main start")
        val str = ""
        printString_2(str) { s ->
            println("lambda start")
            if (s.isEmpty()) return
            println(s)
            println("lambda end")
        }
        println("main end")
    }

    /**
     * 报错
     * 如果我们在高阶函数中创建了另外的Lambda 或者匿名类的实现，并且在这些实现
     * 中调用函数类型参数，此时再将高阶函数声明成内联函数，就一定会提示错误
     */
//    inline fun runRunnable(block: () -> Unit) {
//        val runnable = Runnable {
//            block()
//        }
//        runnable.run()
//    }

    inline fun runRunnable1(crossinline block: () -> Unit) {
        val runnable = Runnable {
            block()
//            return // crossinline关键字就像一个契约，它用于保证在内联函数的Lambda 表达式中一定不会使用return关键字
        }
        runnable.run()
//        return@runRunnable1

    }

    fun runRunnable2(block: () -> Unit) {
        val runnable = Runnable {
            block()
            return@Runnable
        }
        runnable.run()
    }

    fun SharedPreferences.open(block: SharedPreferences.Editor.() -> Unit) {
        val editor = edit()
        editor.block()
        editor.apply()
    }

    /**
     * 简化SharedPreferences的用法
     */
    fun onTest8(v : View) {
        getSharedPreferences("data", Context.MODE_PRIVATE).open {
            putString("name", "Tom")
            putInt("age", 28)
            putBoolean("married", false)
        }
    }

    fun cvOf(vararg pairs: Pair<String, Any?>) = ContentValues().apply {
        for (pair in pairs) {
            val key = pair.first
            val value = pair.second
            when (value) {
                is Int -> put(key, value)
                is Long -> put(key, value)
                is Short -> put(key, value)
                is Float -> put(key, value)
                is Double -> put(key, value)
                is Boolean -> put(key, value)
                is String -> put(key, value)
                is Byte -> put(key, value)
                is ByteArray -> put(key, value)
                null -> putNull(key)
            }
        }
    }

    /**
     *
     */
    fun onTest9(v : View) {

    }

    /**
     *
     */
    fun onTest10(v : View) {

    }

    /**
     *
     */
    fun onTest11(v : View) {

    }

    /**
     *
     */
    fun onTest12(v : View) {

    }

    /**
     *
     */
    fun onTest13(v : View) {

    }

}