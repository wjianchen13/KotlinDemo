package com.example.kotlin.practice.test9

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
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
 * Kotin注解
 * @JvmDefault
 * @JvmDefaultWithCompatibility
 */
class PracticeActivity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice9)
    }

    /**
     * @JvmDefault
     */
    fun onTest1(v : View) {
        var callBack : ICallBack =  CallBackImpl()
        callBack.showToast()
    }

    /**
     * @JvmDefaultWithCompatibility
     */
    fun onTest2(v : View) {

    }


}