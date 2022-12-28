package com.example.kotlin.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 手写内置函数takeIf
 */
class HigherActivity20 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 手写内置函数takeIf"
    }

    /**
     * 如果takeIf里面返回true，则返回调用者自身this，否则返回null
     */
    fun onDelegateBase(v : View) {
        // TODO 官方的： true 返回 Derry，  false会返回一个null
        val r = "Derry".takeIf {
            it // it == 调用者本身 == "Derry"   输入

            false // false会返回一个null
            true // true 返回 Derry 调用者本身
        }
        println(r)

        // TODO 我们自己写一套
        val r2 = "DDD".mTakeIf {
            true // it == 调用者本身 == "DDD"   输入
            false
            true
        }
        println(r2)
    }

    // I.xxx { this == I == 调用者本身 }
    // mTakeIf函数返回什么类型？ I ?
    private inline fun <I> I.mTakeIf(action: (I) -> Boolean) =
        if (action(this)) this else null

}

