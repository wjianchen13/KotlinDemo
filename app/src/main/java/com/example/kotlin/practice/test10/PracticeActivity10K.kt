package com.example.kotlin.practice.test10

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.JUtils

/**
 * 测试java接口实现default，kotlin类继承提示override onthing的问题
 */
class PracticeActivity10K : AppCompatActivity(), ITest10 {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice10)
    }

    /**
     *
     */
    fun onTest1(v: View?) {
        val t = Thread { JUtils.log("Thread test") }
        t.start()
    }

    /**
     *
     */
    fun onTest2(v: View?) {}

    override fun test1() {}
}