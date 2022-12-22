package com.example.kotlin.higher

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.lamda.TestLamdaActivity2

/**
 * Kotlin 高阶函数
 */
class HigherActivity : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_higher)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin Lamda表达式"
    }

    /**
     * 测试
     */
    fun onHigher1(v : View) {
        startActivity(Intent(this, HigherActivity1::class.java))
    }

    /**
     * 测试
     */
    fun onHigher2(v : View) {
        startActivity(Intent(this, HigherActivity2::class.java))
    }

    /**
     * 测试
     */
    fun onHigher3(v : View) {
        startActivity(Intent(this, HigherActivity3::class.java))
    }

    /**
     * 高阶函数和扩展函数
     */
    fun onHigher4(v : View) {
        startActivity(Intent(this, HigherActivity4::class.java))
    }

    /**
     * 高阶函数的演化过程
     */
    fun onHigher5(v : View) {
        startActivity(Intent(this, HigherActivity5::class.java))
    }

    /**
     * 函数引用类型
     */
    fun onHigher6(v : View) {
        startActivity(Intent(this, HigherActivity6::class.java))
    }


    /**
     * 模拟android 点击事件
     */
    fun onHigher7(v : View) {
        startActivity(Intent(this, HigherActivity7::class.java))
    }

}

