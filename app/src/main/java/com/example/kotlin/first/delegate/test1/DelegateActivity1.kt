package com.example.kotlin.first.delegate.test1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 委托模式
 */
class DelegateActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate1)
    }

    /**
     * 委托模式测试
     */
    fun onTest1(v : View) {

    }

}