package com.example.kotlin.practice.test12

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.test12.test1.TestListener
import com.example.kotlin.practice.test12.test2.Test2ListenerK

/**
 * Kotlin通过 lambda 传递给Java 接口类型
 */
class PracticeActivity12 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice12)
    }

    /**
     * Kotlin调用Java接口
     * Kotlin通过 lambda 传递给Java 接口类型
     * 在 Kotlin 中，当你尝试通过 lambda 表达式的方式传递一个函数给一个接收函数类型参数的方法时，如果该
     * 方法接收的是 Java 接口类型，那么 lambda 表达式会默认被解释为 Kotlin 函数类型而不是 Java 接口类型
     */
    fun onTest1(v : View) {
        var test : TestListener = TestListener()
        test.test1{

        }
//        test.test2 {
//
//        }
    }

    /**
     * Kotlin继承Java接口
     * 如果java接口的参数是基本类型，例如int double，那么kotlin继承下来就不能为空，因为基本类型不能为空
     * 如果java接口参数是报装类型，例如Integer，kotlin继承下来可以为空，也可以不为空
     * 参考Test2ListenerK类
     */
    fun onTest2(v : View) {
        val test = Test2ListenerK()
    }

    /**
     * with
     */
    fun onTest3(v : View) {

    }

    /**
     * apply
     */
    fun onTest4(v : View) {

    }

    /**
     * also
     */
    fun onTest5(v : View) {

    }

}