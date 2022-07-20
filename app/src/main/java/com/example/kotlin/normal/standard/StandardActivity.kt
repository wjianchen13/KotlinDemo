package com.example.kotlin.normal.standard

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 标准函数和静态方法
 */
class StandardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard)
    }

    /**
     * with 函数
     * with函数会在Lambda 表达式中提供第一个参数对象的上下文，并使用Lambda 表达式中的最后一行代码作为返回值返回
     */
    fun onTest1(v : View) {
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
     * run函数通常不会直接调用，
     * 而是要在某个对象的基础上调用；其次run函数只接收一个Lambda 参数，并且会在Lambda 表
     * 达式中提供调用对象的上下文
     */
    fun onTest2(v : View) {
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
     * apply函数和run函数也是极其类似的，都要在某
     * 个对象上调用，并且只接收一个Lambda 参数，也会在Lambda 表达式中提供调用对象的上下
     * 文，但是apply函数无法指定返回值，而是会自动返回调用对象本身
     */
    fun onTest3(v : View) {
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
     * 静态方法 单例类
     */
    fun onTest4(v : View) {
        Util.doAction()
    }


    /**
     * 静态方法 companion object
     * object声明（一个类）是延迟加载的，只有当第一次被访问时才会初始化，所以被用来实现单例
     * companion object是当包含它的类被加载时就初始化了的，这一点和Java的static还是一样的
     */
    fun onTest5(v : View) {
        Util2().doAction1()
        Util2.doAction2()
    }


    /**
     * 静态方法 @JvmStatic
     */
    fun onTest6(v : View) {
        Util2.doAction2()
    }

    /**
     * 静态方法 顶层方法
     */
    fun onTest7(v : View) {
        doSomething()
    }

    /**
     * Java调用Kotlin方法
     */
    fun onTest8(v : View) {
        startActivity(Intent(this, StandardActivity1::class.java))
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

}