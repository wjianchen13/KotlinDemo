package com.example.kotlin.normal.generic

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.normal.generic.test1.GenericActivity1
import com.example.kotlin.normal.generic.test2.GenericActivity2
import com.example.kotlin.normal.generic.test3.GenericActivity3
import com.example.kotlin.normal.generic.test4.GenericActivity4
import com.example.kotlin.normal.obj.obj11.ObjActivity11

/**
 * 泛型
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
     *
     */
    fun onTest5(v : View) {

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