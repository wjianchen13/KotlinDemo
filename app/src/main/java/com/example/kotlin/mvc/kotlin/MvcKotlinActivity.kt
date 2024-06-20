package com.example.kotlin.mvc.kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.mvc.kotlin.test_activity.view.TestMvpActivity
import com.example.kotlin.mvc.kotlin.test_fragment.view.TestFragmentActivity1
import com.example.kotlin.mvc.kotlin.test_multi_activity.view.TestMultiPartyActivity
import com.example.kotlin.mvc.kotlin.test_multi_fragment.view.TestMultiPartyFragmentActivity

/**
 * 框架
 */
class MvcKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc_kotlin)
    }

    /**
     * 测试Activity
     * @param v
     */
    fun onTest1(v: View?) {
        startActivity(Intent(this, TestMvpActivity::class.java))
    }

    /**
     * 测试Fragment
     * @param v
     */
    fun onTest2(v: View?) {
        startActivity(Intent(this, TestFragmentActivity1::class.java))
    }

    /**
     * 测试Fragment
     * @param v
     */
    fun onTest3(v: View?) {
        startActivity(Intent(this, TestMultiPartyFragmentActivity::class.java))
    }

    /**
     * 测试多部分 Activity
     * @param v
     */
    fun onTest4(v: View?) {
        startActivity(Intent(this, TestMultiPartyActivity::class.java))
    }

}