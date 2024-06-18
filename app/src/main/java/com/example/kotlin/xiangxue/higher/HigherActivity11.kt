package com.example.kotlin.xiangxue.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 简化版本
 */
class HigherActivity11 : AppCompatActivity() {

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
        }.consumer {
            println("消费:$this")
        }
    }

    class Helper<T>(var item: T)
    fun<T, R> Helper<T>.map(action: T.() -> R) = Helper(action(item))
    fun<T> Helper<T>.consumer(action: T.() -> Unit) = action(item)
    fun <R> create(action: () -> R) = Helper(action())

}

