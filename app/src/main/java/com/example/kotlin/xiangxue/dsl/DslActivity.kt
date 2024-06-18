package com.example.kotlin.xiangxue.dsl

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin DSL
 */
class DslActivity : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dsl)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin DSL(领域特定语言)"
    }

    /**
     * DSL简单例子
     */
    fun onDsl1(v : View) {
        startActivity(Intent(this, DslActivity1::class.java))
    }

    /**
     * 模拟AndroidManifest.xml的解析
     */
    fun onDsl2(v : View) {
        startActivity(Intent(this, DslActivity2::class.java))
    }

    /**
     * DSL简单例子泛型实现
     */
    fun onDsl3(v : View) {
        startActivity(Intent(this, DslActivity3::class.java))
    }

    /**
     * DSL简单例子泛型实现
     */
    fun onDsl4(v : View) {
        startActivity(Intent(this, DslActivity4::class.java))
    }

    /**
     * DSL实现Html语法规则
     */
    fun onHtml(v : View) {
        startActivity(Intent(this, DslHtmlActivity5::class.java))
    }
}

