package com.example.kotlin.dsl

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin DSL简单例子
 */
class DslActivity1 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin DSL简单例子"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        layout {
            button {

            }

            text {

            }
        }
    }

    class Helper // 中转站
    fun Helper.button(action: () -> Unit) { }
    fun Helper.text(action: () -> Unit) { }


    // 思路一：一旦你看到{} 这个就属于 lambda体，我们就需要为lambda实现体 定义lambda的规则
    // 思路二：{}里面有 button，text 我们需要让此lambda持有一个this==中转站，此this能够直接拿到 中转站（button， text）
    fun layout(action: Helper.() -> Unit) { }

}



