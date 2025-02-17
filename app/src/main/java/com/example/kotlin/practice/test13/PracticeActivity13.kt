package com.example.kotlin.practice.test13

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.test12.test1.TestListener
import com.example.kotlin.practice.test12.test2.Test2ListenerK

/**
 * Kotlin静态方法@JvmStatic 和 @JvmOverloads一起使用，导致找不到方法的问题
 * 这里测试是可以的，项目不可以
 * 但是项目改了下之后，重新改成原来的又可以，具体可以看文档 2_新项目日常问题记录
 * java.lang.NoSuchMethodError: No static method
 */
class PracticeActivity13 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice13)
    }

    /**
     * 测试
     */
    fun onTest1(v : View) {
        Test13.test(1, 2)
        Test13.test(1, 2, true)
        Test13.loadAvatar(this, "hello", null)
    }


}