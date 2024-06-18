package com.example.kotlin.first.generic.test8

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 测试Java的extends和super
 */
class GenericActivity8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic8)
    }

    /**
     * 启动java activity
     */
    fun onTest1(v : View) {
        startActivity(Intent(this, com.example.kotlin.first.generic.test8.java.view.TestMvpActivity::class.java))
    }

    /**
     * 启动kotlin activity
     */
    fun onTest2(v : View) {
        startActivity(Intent(this, com.example.kotlin.first.generic.test8.kotlin.view.TestMvpActivity::class.java))
    }

    /**
     * 泛型逆变 原因
     * 为什么逆变的时候泛型T不能出现在out 位置上
     */
    fun onTest3(v : View) {

    }

}