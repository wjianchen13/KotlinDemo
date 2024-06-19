package com.example.kotlin.practice.test4

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.xiangxue.delegate.Simple04

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
        SingletonTest.getInstance().test()
    }

    /**
     *
     */
    fun onTest2(v : View) {

    }

}