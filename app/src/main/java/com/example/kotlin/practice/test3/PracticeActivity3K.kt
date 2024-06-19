package com.example.kotlin.practice.test3

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.JUtils

/**
 * 线程
 */
class PracticeActivity3K : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice3)
    }

    /**
     *
     */
    fun onTest1(v : View) {
        val t = Thread(Runnable { JUtils.log("Thread test") })
        t.start()
        Thread{ JUtils.log("Thread test")}.start()
    }

    /**
     *
     */
    fun onTest2(v : View) {

    }

}