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
    

}

