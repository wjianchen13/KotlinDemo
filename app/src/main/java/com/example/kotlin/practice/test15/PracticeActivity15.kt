package com.example.kotlin.practice.test15

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.test12.test1.TestListener
import com.example.kotlin.practice.test12.test2.Test2ListenerK

/**
 * Kotlin访问Java代码的属性，当Java同时拥有getXXX和setXXX方法时，Kotlin可以直接通过XXX访问属性，包括属性读写
 * 如果只有setXXX，不能通过XXX写，如果只有getXXX，可以通过XXX读取
 */
class PracticeActivity15 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice15)
    }

    /**
     * 测试
     */
    fun onTest1(v : View) {
        val test = Test15()
        test.age = 1
        val age = test.age_1
//        test.age_1 = 2
    }


}