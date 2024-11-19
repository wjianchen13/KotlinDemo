package com.example.kotlin.practice.test4

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 单例模式
 * 从原理对比分析，Kotlin中单例模式的5种实现方式
 * https://blog.csdn.net/chuyouyinghe/article/details/136368806
 */
class PracticeActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice4)
    }

    /**
     *
     */
    fun onTest1(v : View) {
        SingletonTest3.getInstance().test()

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
        SingletonTest4.instance.test()
    }

    /**
     *
     */
    fun onTest5(v : View) {

    }

}