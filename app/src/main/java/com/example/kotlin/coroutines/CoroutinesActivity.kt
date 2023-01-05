package com.example.kotlin.coroutines

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.coroutines.jetpack_mvvm_coroutinue.activity.CoroutinesActivity5

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
     * 模拟多个访问请求串行访问
     */
    fun onCoroutines3(v : View) {
        startActivity(Intent(this, CoroutinesActivity3::class.java))
    }

    /**
     * 模拟多个访问请求串行访问（协程实现）
     */
    fun onCoroutines4(v : View) {
        startActivity(Intent(this, CoroutinesActivity4::class.java))
    }

    /**
     * JetPack&MVVM&协程案例实战
     */
    fun onCoroutines5(v : View) {
        startActivity(Intent(this, CoroutinesActivity5::class.java))
    }

    /**
     * 协程的挂起与恢复流程
     */
    fun onCoroutines6(v : View) {
        startActivity(Intent(this, CoroutinesActivity6::class.java))
    }

}

