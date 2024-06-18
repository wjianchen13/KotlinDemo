package com.example.kotlin.first.coroutines

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.first.coroutines.test1.CoroutinesFirstActivity1
import com.example.kotlin.first.coroutines.test2.CoroutinesFirstActivity2
import com.example.kotlin.first.coroutines.test3.CoroutinesFirstActivity3
import com.example.kotlin.first.coroutines.test4.CoroutinesFirstActivity4
import com.example.kotlin.first.coroutines.test5.CoroutinesFirstActivity5

/**
 * Kotlin 协程
 */
class CoroutinesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_coroutines)
    }

    /**
     * GlobalScope.launch 创建协程
     */
    fun onTest1(v : View) {
        startActivity(Intent(this, CoroutinesFirstActivity1::class.java))
    }

    /**
     * runBlocking 创建协程
     */
    fun onTest2(v : View) {
        startActivity(Intent(this, CoroutinesFirstActivity2::class.java))
    }

    /**
     * coroutineScope 创建协程
     */
    fun onTest3(v : View) {
        startActivity(Intent(this, CoroutinesFirstActivity3::class.java))
    }

    /**
     * 协程常用的写法
     */
    fun onTest4(v : View) {
        startActivity(Intent(this, CoroutinesFirstActivity4::class.java))
    }

    /**
     * 协程简化回调的写法
     */
    fun onTest5(v : View) {
        startActivity(Intent(this, CoroutinesFirstActivity5::class.java))
    }

    /**
     *
     */
    fun onTest6(v : View) {

    }

    /**
     *
     */
    fun onTest7(v : View) {

    }

    /**
     *
     */
    fun onTest8(v : View) {

    }

    /**
     *
     */
    fun onTest9(v : View) {

    }

    /**
     *
     */
    fun onTest10(v : View) {

    }

    /**
     *
     */
    fun onTest11(v : View) {

    }

    /**
     *
     */
    fun onTest12(v : View) {

    }

    /**
     *
     */
    fun onTest13(v : View) {

    }

}