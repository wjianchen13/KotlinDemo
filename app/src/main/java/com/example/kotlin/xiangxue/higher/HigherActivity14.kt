package com.example.kotlin.xiangxue.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 函数式编程
 */
class HigherActivity14 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_higher14)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 函数式编程"
    }

    /**
     * 测试1
     */
    fun onTest1(v : View) {
        // 1.定义name集合
        val names = listOf("Zhangsan", "Lisi", "Wangwu")
        // 2.定义age集合
        val ages = listOf(20, 21, 22)

        names.zip(ages).toMap().map { "you name:${it.key}, you age:${it.value}" }.map { println(it) }

        // 简化
        names.zip(ages).toMap().map { println("you name:${it.key}, you age:${it.value}") }
    }

    /**
     * 测试1
     */
    fun onTest2(v : View) {
        listOf("Zhangsan", "Lisi", "Wangwu").zip(listOf(20, 21, 22)).toMap().map { println("you name:${it.key}, you age:${it.value}") }
    }

}

