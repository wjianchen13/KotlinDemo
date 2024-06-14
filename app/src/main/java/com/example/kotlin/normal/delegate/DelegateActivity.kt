package com.example.kotlin.normal.delegate

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.normal.delegate.test1.DelegateActivity1
import com.example.kotlin.normal.delegate.test2.DelegateActivity2
import com.example.kotlin.normal.delegate.test3.DelegateActivity3
import com.example.kotlin.normal.generic.GenericActivity

/**
 * 委托
 */
class DelegateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate)
    }

    /**
     * 类委托
     */
    fun onTest1(v : View) {
        startActivity(Intent(this, DelegateActivity1::class.java))
    }

    /**
     * 属性委托
     */
    fun onTest2(v : View) {
        startActivity(Intent(this, DelegateActivity2::class.java))
    }

    /**
     * 实现一个自定义的Lazy函数
     */
    fun onTest3(v : View) {
        startActivity(Intent(this, DelegateActivity3::class.java))
    }

    /**
     *
     */
    fun onTest4(v : View) {

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