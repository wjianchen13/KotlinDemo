package com.example.kotlin.xiangxue.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlin.concurrent.thread

/**
 * Kotlin 手写内置函数thread
 */
class HigherActivity21 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 手写内置函数thread"
    }

    /**
     * thread 启动一个线程
     */
    fun onDelegateBase(v : View) {
        // TODO 官方的：
        val r : Thread = thread(start = false) {
            println("我是异步线程 ${Thread.currentThread().name}")
        }
        // 等会儿在启动，返回Thread的目的是为了下面这个
        r.start()

        // TODO 自己的
        mThread {
            println("我是异步线程 ${Thread.currentThread().name}")
        }
    }

    private /*inline*/ fun mThread(
        start: Boolean = true,
        name: String ? = null,
        /*crossinline*/ runAction: () -> Unit // crossinline 你的这个lambda不要给我内联 优化
    ) : Thread {
        val thread = object: Thread() {
            override fun run() {
                super.run()
                runAction() // 在子线程里面调用lambda
            }
        }

        if (start) thread.start()

        // if (name != null) thread.name = name // 你还停留在Java的思维上
        name ?. let { thread.name = it } // KT的写法

        return thread
    }
}

