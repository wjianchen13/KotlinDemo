package com.example.kotlin.practice

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.test1.PracticeActivity1
import com.example.kotlin.practice.test10.PracticeActivity10J
import com.example.kotlin.practice.test2.PracticeActivity2
import com.example.kotlin.practice.test3.PracticeActivity3
import com.example.kotlin.practice.test4.PracticeActivity4
import com.example.kotlin.practice.test5.PracticeActivity5
import com.example.kotlin.practice.test6.PracticeActivity6
import com.example.kotlin.practice.test7.PracticeActivity7
import com.example.kotlin.practice.test9.PracticeActivity9

/**
 * Kotlin实践
 */
class PracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)
    }

    /**
     * kotlin的getter和setter方法
     */
    fun onTest1(v : View) {
        startActivity(Intent(this, PracticeActivity1::class.java))
    }

    /**
     * 静态方法
     */
    fun onTest2(v : View) {
        startActivity(Intent(this, PracticeActivity2::class.java))
    }

    /**
     * 线程
     */
    fun onTest3(v : View) {
        startActivity(Intent(this, PracticeActivity3::class.java))
    }

    /**
     * 单例模式
     */
    fun onTest4(v : View) {
        startActivity(Intent(this, PracticeActivity4::class.java))
    }

    /**
     * 线程同步
     */
    fun onTest5(v : View) {
        startActivity(Intent(this, PracticeActivity5::class.java))
    }

    /**
     * Java子类访问Kotlin父类成员
     */
    fun onTest6(v : View) {
        startActivity(Intent(this, PracticeActivity6::class.java))
    }

    /**
     * 泛型测试，通配符使用
     */
    fun onTest7(v : View) {
        startActivity(Intent(this, PracticeActivity7::class.java))
    }

    /**
     * 函数默认参数
     */
    fun onTest8(v : View) {

    }

    /**
     * Kotlin注解
     */
    fun onTest9(v : View) {
        startActivity(Intent(this, PracticeActivity9::class.java))
    }

    /**
     *
     */
    fun onTest10(v : View) {
        startActivity(Intent(this, PracticeActivity10J::class.java))
    }




}