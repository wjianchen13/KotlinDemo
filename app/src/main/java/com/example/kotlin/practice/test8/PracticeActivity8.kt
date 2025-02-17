package com.example.kotlin.practice.test8

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
 * Kotlin 定义变量，Java可以直接通过getXXX()进行访问
 * 在Kotlin中，当你定义一个属性时，可以使用get()方法来定义属性的访问器。在你的例子中，你定义了一个只读的属性param1，
 * 并提供了get()方法来获取属性的值。
 * 在Kotlin中，属性的访问方式取决于属性的定义方式。当你在Kotlin文件中访问一个属性时，Kotlin会自动识别属性的访问器，
 * 并允许你直接通过属性名来访问。
 * 但是，在Java中，由于Java并不支持Kotlin中的属性访问器的概念，因此你需要显式地调用getParam1()方法来获取属性的值。
 * 这种差异是由于Kotlin和Java在处理属性访问方式上的设计不同所致。在Kotlin中，属性访问器的概念更为直接和简洁，
 * 而Java仍然沿用了传统的Getter和Setter方法的方式。
 *
 */
class PracticeActivity8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice8)
    }

    /**
     *
     */
    fun onTest1(v : View) {
        var test8 = Test8()
        test8.param1
    }

    /**
     *
     */
    fun onTest2(v : View) {

    }


}