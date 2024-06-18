package com.example.kotlin.first.coroutines.test4

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/**
 * 协程常用的写法
 */
class CoroutinesFirstActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_coroutines4)
    }

    /**
     * Job 取消协程
     */
    fun onTest1(v : View) {
        val job = Job()
        val scope = CoroutineScope(job)
        scope.launch {
            println("codes run in coroutineScope Job")
        }
        job.cancel()
    }

    /**
     * 获取返回结果
     * 在async函数的代码块中进行了一个简单的数学运算，然后调用await()方法获取运
     * 算结果，最终将结果打印出来
     */
    fun onTest2(v : View) {
        runBlocking {
            val result = async {
                5 + 5
            }.await()
            println(result)
        }
    }

    /**
     * async函数
     */
    fun onTest3(v : View) {
        runBlocking {
            val start = System.currentTimeMillis()
            val result1 = async {
                delay(1000)
                5 + 5
            }.await()
            val result2 = async {
                delay(1000)
                4 + 6
            }.await()
            println("result is ${result1 + result2}.")
            val end = System.currentTimeMillis()
            println("cost ${end - start} ms.")
        }
    }

    /**
     * async函数 一起获取结果
     */
    fun onTest4(v : View) {
        runBlocking {
            val start = System.currentTimeMillis()
            val deferred1 = async {
                delay(1000)
                5 + 5
            }
            val deferred2 = async {
                delay(1000)
                4 + 6
            }
            println("result is ${deferred1.await() + deferred2.await()}.")
            val end = System.currentTimeMillis()
            println("cost ${end - start} milliseconds.")
        }
    }

    /**
     * withContext()函数
     */
    fun onTest5(v : View) {
        runBlocking {
            val result = withContext(Dispatchers.Default) {
                5 + 5
            }
            println(result)
        }
    }



}