package com.example.kotlin.dsl

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


}

