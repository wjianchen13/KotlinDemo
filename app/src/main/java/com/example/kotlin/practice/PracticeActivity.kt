package com.example.kotlin.practice

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.test1.PracticeActivity1
import com.example.kotlin.practice.test10.PracticeActivity10J
import com.example.kotlin.practice.test11.PracticeActivity11
import com.example.kotlin.practice.test12.PracticeActivity12
import com.example.kotlin.practice.test13.PracticeActivity13
import com.example.kotlin.practice.test14.PracticeActivity14
import com.example.kotlin.practice.test15.PracticeActivity15
import com.example.kotlin.practice.test16.PracticeActivity16
import com.example.kotlin.practice.test17.PracticeActivity17
import com.example.kotlin.practice.test18.PracticeActivity18
import com.example.kotlin.practice.test2.PracticeActivity2
import com.example.kotlin.practice.test3.PracticeActivity3
import com.example.kotlin.practice.test4.PracticeActivity4
import com.example.kotlin.practice.test5.PracticeActivity5
import com.example.kotlin.practice.test6.PracticeActivity6
import com.example.kotlin.practice.test7.PracticeActivity7
import com.example.kotlin.practice.test8.PracticeActivity8
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
     * Kotlin 定义变量，Java可以直接通过getXXX()进行访问
     */
    fun onTest8(v : View) {
        startActivity(Intent(this, PracticeActivity8::class.java))
    }

    /**
     * Kotlin注解
     */
    fun onTest9(v : View) {
        startActivity(Intent(this, PracticeActivity9::class.java))
    }

    /**
     * 测试java接口实现default
     */
    fun onTest10(v : View) {
        startActivity(Intent(this, PracticeActivity10J::class.java))
    }

    /**
     * let、run、with、apply和also
     */
    fun onTest11(v : View) {
        startActivity(Intent(this, PracticeActivity11::class.java))
    }

    /**
     * Kotlin通过 lambda 传递给Java 接口类型
     */
    fun onTest12(v : View) {
        startActivity(Intent(this, PracticeActivity12::class.java))
    }

    /**
     * Kotlin静态方法@JvmStatic 和 @JvmOverloads一起使用，导致找不到方法的问题
     */
    fun onTest13(v : View) {
        startActivity(Intent(this, PracticeActivity13::class.java))
    }

    /**
     * Java activity 继承Kotlin 父类Activity 父类Activity重写了接口方法，但是在子类缺提示没有覆写方法的问题
     */
    fun onTest14(v : View) {
        startActivity(Intent(this, PracticeActivity14::class.java))
    }

    /**
     * Kotlin访问Java代码的属性，当Java同时拥有getXXX和setXXX方法时，Kotlin可以直接通过XXX访问属性，包括属性读写
     */
    fun onTest15(v : View) {
        startActivity(Intent(this, PracticeActivity15::class.java))
    }

    /**
     * 测试Kotlin接口属性获取不会调用括号内容的问题
     */
    fun onTest16(v : View) {
        startActivity(Intent(this, PracticeActivity16::class.java))
    }

    /**
     * 标签
     */
    fun onTest17(v : View) {
        startActivity(Intent(this, PracticeActivity17::class.java))
    }

    /**
     * @JvmOverloads 的用法
     */
    fun onTest18(v : View) {
        startActivity(Intent(this, PracticeActivity18::class.java))
    }

}