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
        tvTitle?.text = "Kotlin 高阶函数"
    }

    /**
     * 测试
     */
    fun onHigher1(v : View) {
        startActivity(Intent(this, HigherActivity1::class.java))
    }

    /**
     * 测试
     */
    fun onHigher2(v : View) {
        startActivity(Intent(this, HigherActivity2::class.java))
    }

    /**
     * 测试
     */
    fun onHigher3(v : View) {
        startActivity(Intent(this, HigherActivity3::class.java))
    }

    /**
     * 高阶函数和扩展函数
     */
    fun onHigher4(v : View) {
        startActivity(Intent(this, HigherActivity4::class.java))
    }

    /**
     * 高阶函数的演化过程
     */
    fun onHigher5(v : View) {
        startActivity(Intent(this, HigherActivity5::class.java))
    }

    /**
     * 函数引用类型
     */
    fun onHigher6(v : View) {
        startActivity(Intent(this, HigherActivity6::class.java))
    }

    /**
     * 模拟android 点击事件
     */
    fun onHigher7(v : View) {
        startActivity(Intent(this, HigherActivity7::class.java))
    }

    /**
     * Kotlin 模拟RxJava链式调用
     */
    fun onHigher8(v : View) {
        startActivity(Intent(this, HigherActivity8::class.java))
    }

    /**
     * Kotlin 模拟RxJava链式调用2
     */
    fun onHigher9(v : View) {
        startActivity(Intent(this, HigherActivity9::class.java))
    }

    /**
     * Kotlin 模拟RxJava链式调用简化版本
     */
    fun onHigher10(v : View) {
        startActivity(Intent(this, HigherActivity10::class.java))
    }

    /**
     * Kotlin 模拟RxJava链式调用简化版本
     */
    fun onHigher11(v : View) {
        startActivity(Intent(this, HigherActivity11::class.java))
    }

    /**
     * Kotlin 模拟RxJava链式调用简化版本
     */
    fun onHigher12(v : View) {
        startActivity(Intent(this, HigherActivity12::class.java))
    }

    /**
     * Kotlin 实现apply方法
     */
    fun onHigher13(v : View) {
        startActivity(Intent(this, HigherActivity13::class.java))
    }

    /**
     * Kotlin 函数式编程
     */
    fun onHigher14(v : View) {
        startActivity(Intent(this, HigherActivity14::class.java))
    }

    /**
     * Kotlin 自定义forEach循环
     */
    fun onHigher15(v : View) {
        startActivity(Intent(this, HigherActivity15::class.java))
    }

    /**
     * Kotlin inline内联
     */
    fun onHigher16(v : View) {
        startActivity(Intent(this, HigherActivity16::class.java))
    }

    /**
     * Kotlin 高阶函数总结
     */
    fun onHigher17(v : View) {
        startActivity(Intent(this, HigherActivity17::class.java))
    }

    /**
     * Kotlin 手写内置函数let
     */
    fun onHigher18(v : View) {
        startActivity(Intent(this, HigherActivity18::class.java))
    }

    /**
     * Kotlin 手写内置函数repeat
     */
    fun onHigher19(v : View) {
        startActivity(Intent(this, HigherActivity19::class.java))
    }

    /**
     * Kotlin
     */
    fun onHigher20(v : View) {
        startActivity(Intent(this, HigherActivity20::class.java))
    }

    /**
     * Kotlin
     */
    fun onHigher21(v : View) {
        startActivity(Intent(this, HigherActivity21::class.java))
    }


}

