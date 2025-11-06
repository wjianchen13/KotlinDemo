package com.example.kotlin.practice.test18

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * 测试kotlin调用含有默认参数构造方法，使用@JvmOverloads和不适用@JvmOverloads是否成功
 *
 */
class PracticeActivity181 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val t13 = TestBean18("11")
        val t15 = TestBean18("11", 2)
        val t16 = TestBean18("11", 2, false)
    }



}