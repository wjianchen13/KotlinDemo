package com.example.kotlin.first.delegate.test3

import android.content.UriMatcher
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 实现一个自定义的Lazy函数
 */
class DelegateActivity3 : AppCompatActivity() {

    val p by later {
        println("==============> run codes inside later block")
        "test later"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate3)
    }

    /**
     * 实现一个自定义的Lazy函数 测试
     */
    fun onTest1(v : View) {
        var authority = "hello"
        val uriMatcher by later {
            val matcher = UriMatcher(UriMatcher.NO_MATCH)
            matcher.addURI(authority, "book", 1)
            matcher.addURI(authority, "book/#", 2)
            matcher.addURI(authority, "category", 3)
            matcher.addURI(authority, "category/#", 4)
            matcher
        }
    }

    /**
     * 延迟加载测试
     */
    fun onTest2(v : View) {
        println("==============> p: $p")
    }

}