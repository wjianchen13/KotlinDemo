package com.example.kotlin.mvc

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.mvc.java.MvcJavaActivity
import com.example.kotlin.mvc.kotlin.view.TestMvpActivity

/**
 * 框架
 */
class MvcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc)
    }

    /**
     * Java方式
     */
    fun onTest1(v : View) {
        startActivity(Intent(this, MvcJavaActivity::class.java))
    }

    /**
     * Kotlin方式
     */
    fun onTest2(v : View) {
        startActivity(Intent(this, TestMvpActivity::class.java))
    }

}