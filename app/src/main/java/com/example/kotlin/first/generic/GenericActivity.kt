package com.example.kotlin.first.generic

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.first.generic.test1.GenericActivity1
import com.example.kotlin.first.generic.test2.GenericActivity2
import com.example.kotlin.first.generic.test3.GenericActivity3
import com.example.kotlin.first.generic.test4.GenericActivity4
import com.example.kotlin.first.generic.test5.GenericActivity5
import com.example.kotlin.first.generic.test6.GenericActivity6
import com.example.kotlin.first.generic.test7.GenericActivity7
import com.example.kotlin.first.generic.test8.GenericActivity8

/**
 * 泛型
 *
 * 【码上开学】Kotlin 的泛型(1)，2024年最新kotlin极简教程
 * https://blog.csdn.net/2401_84103386/article/details/137576098
 *
 *
 *
 *
 */
class GenericActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic)
    }

    /**
     * 泛型类
     */
    fun onTest1(v : View) {
        startActivity(Intent(this, GenericActivity1::class.java))
    }

    /**
     * 泛型方法
     */
    fun onTest2(v : View) {
        startActivity(Intent(this, GenericActivity2::class.java))
    }

    /**
     * 泛型指定上界
     */
    fun onTest3(v : View) {
        startActivity(Intent(this, GenericActivity3::class.java))
    }

    /**
     * 实现apply函数一样功能
     */
    fun onTest4(v : View) {
        startActivity(Intent(this, GenericActivity4::class.java))
    }

    /**
     * 泛型实化
     */
    fun onTest5(v : View) {
        startActivity(Intent(this, GenericActivity5::class.java))
    }

    /**
     * 泛型协变
     */
    fun onTest6(v : View) {
        startActivity(Intent(this, GenericActivity6::class.java))
    }

    /**
     * 泛型逆变
     */
    fun onTest7(v : View) {
        startActivity(Intent(this, GenericActivity7::class.java))
    }

    /**
     * 测试Java的extends和super
     */
    fun onTest8(v : View) {
        startActivity(Intent(this, GenericActivity8::class.java))
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