package com.example.kotlin.normal.obj.singleton

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 单例类
 */
class SingletonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singleton)
    }

    /**
     * 单例类测试
     */
    fun onTest1(v : View) {
        Singleton.singletonTest()
    }

}