package com.example.kotlin.first.coroutines.test3

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * coroutineScope 创建协程
 */
class CoroutinesFirstActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_coroutines3)
    }

    private suspend fun printDot() = coroutineScope {
        launch {
            println("codes run in coroutineScope")
            delay(1000)
            println("codes run in coroutineScope finished")
        }
    }

    /**
     * runBlocking函数同样会创建一个协程的作用域，但是它可以保证在协程作用域内的所有代码
     * 和子协程没有全部执行完之前一直阻塞当前线程
     */
    fun onTest1(v : View) {
        runBlocking {
            printDot()
        }
    }

    /**
     * 使用coroutineScope挂起外部协程
     * coroutineScope函数确实是将外部协程挂起了，只有当它作用域内的所有代码和
     * 子协程都执行完毕之后， coroutineScope函数之后的代码才能得到运行
     */
    fun onTest2(v : View) {
        runBlocking {
            coroutineScope {
                launch {
                    for (i in 1..10) {
                        println(i)
                        delay(1000)
                    }
                }
            }
            println("coroutineScope finished")
        }
        println("runBlocking finished")
    }

    /**
     * 协程执行效率测试
     */
    fun onTest3(v : View) {
        val start = System.currentTimeMillis()
        runBlocking {
            repeat(100000) {
                launch {
                    println(".")
                }
            }
        }
        val end = System.currentTimeMillis()
        println(end - start)
    }



    /**
     * 声明挂起函数
     */
    fun onTest4(v : View) {

    }

}