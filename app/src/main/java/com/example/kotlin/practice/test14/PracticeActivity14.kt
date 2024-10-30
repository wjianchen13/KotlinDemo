package com.example.kotlin.practice.test14

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.test12.test1.TestListener
import com.example.kotlin.practice.test12.test2.Test2ListenerK

/**
 * Java activity 继承Kotlin 父类Activity 父类Activity重写了接口方法，但是在子类缺提示没有覆写方法的问题
 */
class PracticeActivity14 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice14)
    }

    /**
     * 测试
     */
    fun onTest1(v : View) {

    }


}