package com.example.kotlin.first.generic.test4

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 实现apply函数一样功能
 */
class GenericActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic4)
    }

    fun <T> T.build(block: T.() -> Unit): T {
        block()
        return this
    }

    /**
     * 实现apply函数一样功能测试
     */
    fun onTest1(v : View) {
        var str = "hello"
        var result = str.build {
            println("==================> str: $str")
        }
        println("==================> result: $result")
    }


}