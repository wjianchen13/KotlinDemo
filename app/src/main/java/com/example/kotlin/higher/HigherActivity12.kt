package com.example.kotlin.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 简化版本
 */
class HigherActivity12 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 简化版本"
    }

    /**
     * 测试1
     */
    fun onDelegateBase(v : View) {
        create {
            "Derry"
        }.map {
            length
        }.map {
            "内容的长度是:$this"
        }.map {
            "【$this】"
        }.consumer { // 不需要返回，直接消费，就不需要 R，所以是 Unit
            println("消费:$this")
        }
    }

    fun <R> create(action: () -> R) : R = action() // 把 "Derry"保存到R泛型里面去
    fun<T, R> T.map(action: T.() -> R) : R = action(this) // this == "Derry"     R=length 5
    fun<T> T.consumer(action: T.() -> Unit) = action(this) // this == length 5

}

