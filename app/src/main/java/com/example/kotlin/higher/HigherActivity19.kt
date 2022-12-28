package com.example.kotlin.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 手写内置函数repeat
 */
class HigherActivity19 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 手写内置函数repeat"
    }

    /**
     * repeat的意思重复执行n次闭包内的代码
     */
    fun onDelegateBase(v : View) {
        // TODO 官方的：
        repeat(10) {
            print("下标是:$it ")
        }

        println()

        // TODO 我们自己手写
        mRepeat(10) {
            print("下标是:$it ")
        }

        println()

        // 我们自己扩展的，比官方的强大
        10.mRepeat2 {
            print("下标是:$it ")
        }
    }

    private inline fun mRepeat(count: Int, action: (Int) -> Unit) {
        for (item: Int in 0 until count) action(item)
    }

    private inline fun Int.mRepeat2(action: (Int) -> Unit) {
        for (item: Int in 0 until this) action(item)
    }

}

