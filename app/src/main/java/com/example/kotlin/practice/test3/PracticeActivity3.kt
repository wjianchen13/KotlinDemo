package com.example.kotlin.practice.test3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 线程
 */
class PracticeActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice3)
    }

    /**
     * Kotlin测试
     */
    fun onTest1(v : View) {
        startActivity(Intent(this, PracticeActivity3K::class.java))
    }

    /**
     * Java测试
     */
    fun onTest2(v : View) {
        startActivity(Intent(this, PracticeActivity3J::class.java))
    }

}