package com.example.kotlin.first.coroutines.test2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * runBlocking 创建协程
 */
class CoroutinesFirstActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_coroutines2)
    }

    /**
     * runBlocking函数同样会创建一个协程的作用域，但是它可以保证在协程作用域内的所有代码
     * 和子协程没有全部执行完之前一直阻塞当前线程
     */
    fun onTest1(v : View) {
        runBlocking {
            println("codes run in coroutine scope")
            delay(1500)
            println("codes run in coroutine scope finished")
        }
    }

    /**
     * runBlocking 创建多个协程
     */
    fun onTest2(v : View) {
        runBlocking {
            launch {
                println("launch1")
                delay(1000)
                println("launch1 finished")
            }
            launch {
                println("launch2")
                println("launch2 finished")
            }
        }
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

    suspend fun printDot() {
        println("codes run in coroutine scope")
        delay(1000)
        println("codes run in coroutine scope finished")
    }

    /**
     * 声明挂起函数
     */
    fun onTest4(v : View) {
        runBlocking {
            printDot()
        }
    }

}