package com.example.kotlin.practice.test2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.xiangxue.delegate.Simple04

/**
 * 静态方法
 */
class PracticeActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice2)
    }

    /**
     *
     */
    fun onTest1(v : View) {
        UtilsTest.log("test1")
    }

    /**
     *
     */
    fun onTest2(v : View) {
        UtilsTest1.log("test2")
    }

}