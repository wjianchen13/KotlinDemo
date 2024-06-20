package com.example.kotlin.practice.test7

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.JUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.runBlocking
import java.lang.Thread.sleep
import java.util.concurrent.Callable
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CountDownLatch
import java.util.concurrent.CyclicBarrier
import java.util.concurrent.Executors
import java.util.concurrent.FutureTask
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.locks.ReentrantLock

/**
 * 泛型测试，通配符使用
 */
class PracticeActivity7 : AppCompatActivity(), IBaseView2{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice7)
    }

    override fun test1() {
        JUtils.log("onTest1")
    }

    override fun test2() {
        JUtils.log("onTest2")
    }

    /**
     * Thread.join
     */
    fun onTest1(v : View) {
        var baseTest = BaseTest2<PracticeActivity7>(this)
        baseTest.test1()
        baseTest.test2()
    }

    /**
     * Synchronized
     */
    fun onTest2(v : View) {

    }


}