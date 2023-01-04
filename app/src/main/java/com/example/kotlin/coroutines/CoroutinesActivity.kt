package com.example.kotlin.coroutines

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.higher.HigherActivity1

/**
 * Kotlin DSL
 */
class CoroutinesActivity : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin DSL(领域特定语言)"
    }

    /**
     * 传统方式完成异步任务网络加载
     */
    fun onCoroutines1(v : View) {
        startActivity(Intent(this, CoroutinesActivity1::class.java))
    }

    /**
     * 协程方式完成异步任务网络加载
     */
    fun onCoroutines2(v : View) {
        startActivity(Intent(this, CoroutinesActivity2::class.java))
    }

    /**
     * DSL简单例子泛型实现
     */
    fun onDsl3(v : View) {
        startActivity(Intent(this, CoroutinesActivity1::class.java))
    }

    /**
     * DSL简单例子泛型实现
     */
    fun onDsl4(v : View) {
        startActivity(Intent(this, CoroutinesActivity1::class.java))
    }

    /**
     * DSL实现Html语法规则
     */
    fun onHtml(v : View) {
        startActivity(Intent(this, CoroutinesActivity1::class.java))
    }
}

