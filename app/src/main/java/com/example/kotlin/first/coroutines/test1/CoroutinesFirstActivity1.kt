package com.example.kotlin.first.coroutines.test1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * GlobalScope.launch
 */
class CoroutinesFirstActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_coroutines1)
    }

    /**
     * GlobalScope.launch 不阻塞
     * GlobalScope.launch创建的都是一个顶层协程，这种协程当应用程序运行结束
     * 时也会跟着一起结束。刚才的日志之所以无法打印出来，就是因为代码块中的代码还没来得及
     * 运行，应用程序就结束了
     * 测试的时候看到是可以输出的，不知道是不是协程版本的问题
     */
    fun onTest1(v : View) {
        GlobalScope.launch {
            println("codes run in coroutine scope")
        }
    }

    /**
     * GlobalScope.launch 阻塞
     * 主线程阻塞1 秒钟，现在重新运行程序，你会发现日志可以
     * 正常打印出来了
     */
    fun onTest2(v : View) {
        GlobalScope.launch {
            println("codes run in coroutine scope")
        }
        Thread.sleep(1000)
    }

    /**
     * GlobalScope.launch 运行时间超过阻塞时间
     */
    fun onTest3(v : View) {
        GlobalScope.launch {
            println("codes run in coroutine scope")
            delay(1500)
            println("codes run in coroutine scope finished")
        }
        Thread.sleep(1000)
    }

}