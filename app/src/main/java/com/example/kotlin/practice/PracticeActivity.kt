package com.example.kotlin.practice

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.first.obj.obj1.ObjActivity1
import com.example.kotlin.practice.test1.PracticeActivity1
import com.example.kotlin.xiangxue.delegate.Simple04

/**
 * Kotlin实践
 *
 * 从原理对比分析，Kotlin中单例模式的5种实现方式
 * https://blog.csdn.net/chuyouyinghe/article/details/136368806
 *
 */
class PracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)
    }

    /**
     * kotlin的getter和setter方法
     */
    fun onTest1(v : View) {
        startActivity(Intent(this, PracticeActivity1::class.java))
    }

    /**
     *
     */
    fun onTest2(v : View) {

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