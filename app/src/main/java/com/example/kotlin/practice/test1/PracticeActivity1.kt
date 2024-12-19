package com.example.kotlin.practice.test1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.xiangxue.delegate.Simple04

/**
 * kotlin的getter和setter方法
 */
class PracticeActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice1)
    }

    /**
     *
     */
    fun onTest1(v : View) {
        val simple04 = TestBean1()
        simple04.floatValue = 99999.0f  // 我给number赋值【用户在赋值 number 调用 setNumber ---> 实例 ---> setFloatValue】
        println(simple04.floatValue) // 我读取number【/用户在读取 number 调用 getNumber ---> 实例 ---> getFloatValue】
    }

    /**
     *
     */
    fun onTest2(v : View) {
        val simple04 = TestBean2(false)
        println(simple04.floatValue) // 我读取number【/用户在读取 number 调用 getNumber ---> 实例 ---> getFloatValue】
    }

    /**
     *
     */
    fun onTest3(v : View) {

    }

    /**
     *
     */
    fun onTest4(v : View) {

    }


    /**
     *
     */
    fun onTest5(v : View) {

    }


    /**
     *
     */
    fun onTest6(v : View) {

    }

    /**
     *
     */
    fun onTest7(v : View) {

    }

    /**
     * 函数默认参数
     */
    fun onTest8(v : View) {

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