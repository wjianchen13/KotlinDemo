package com.example.kotlin.practice.test5

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
 * 线程同步
 *
 * Kotlin 线程同步的方法
 * https://www.jianshu.com/p/2e3df38bb209
 *
 * 线程同步方式
 * Thread.join 如果一个线程A执行了thread.join()语句，其含义是：当前线程A等待thread线程终止之后才从thread.join()返回。
 * Synchronized
 * ReentrantLock
 * BlockingQueue
 * CountDownLatch
 * CyclicBarrier
 * CAS
 * Future
 * CompletableFuture
 * Rxjava
 * Coroutine
 * Flow
 *
 */
class PracticeActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5)
    }

    val task1: () -> String = {
        sleep(2000)
        "Hello".also { println("task1 finished: $it") }
    }

    val task2: () -> String = {
        sleep(2000)
        "World".also { println("task2 finished: $it") }
    }

    val task3: (String, String) -> String = { p1, p2 ->
        sleep(2000)
        "$p1 $p2".also { println("task3 finished: $it") }
    }

    /**
     * Thread.join
     */
    fun onTest1(v : View) {
        lateinit var s1: String
        lateinit var s2: String
        val t1 = Thread {
            s1 = task1()
        }
        val t2 = Thread {
            s2 = task2()
        }
        t1.start()
        t2.start()
        t1.join()
        t2.join()
        task3(s1, s2)
    }

    /**
     * Synchronized
     */
    fun onTest2(v : View) {
        lateinit var s1: String
        lateinit var s2: String
        Thread {
            synchronized(Unit) {
                s1 = task1()
            }
        }.start()
        s2 = task2()

        synchronized(Unit) {
            task3(s1, s2)
        }
    }

    /**
     * ReentrantLock
     */
    fun onTest3(v : View) {
        lateinit var s1: String
        lateinit var s2: String

        val lock = ReentrantLock()
        Thread {
            lock.lock()
            s1 = task1()
            lock.unlock()
        }.start()
        s2 = task2()

        lock.lock()
        task3(s1, s2)
        lock.unlock()
    }

    /**
     * BlockingQueue
     */
    fun onTest4(v : View) {
        lateinit var s1: String
        lateinit var s2: String

        val queue = SynchronousQueue<Unit>()

        Thread {
            s1 = task1()
            queue.put(Unit)
        }.start()

        s2 = task2()

        queue.take()
        task3(s1, s2)
    }

    /**
     * CountDownLatch
     */
    fun onTest5(v : View) {
        lateinit var s1: String
        lateinit var s2: String
        val cd = CountDownLatch(2)
        Thread() {
            s1 = task1()
            cd.countDown()
        }.start()

        Thread() {
            s2 = task2()
            cd.countDown()
        }.start()

        cd.await()
        task3(s1, s2)
    }

    /**
     * CyclicBarrier
     */
    fun onTest6(v : View) {
        lateinit var s1: String
        lateinit var s2: String
        val cb = CyclicBarrier(3)

        Thread {
            s1 = task1()
            cb.await()
        }.start()

        Thread() {
            s2 = task1()
            cb.await()
        }.start()

        cb.await()
        task3(s1, s2)

    }

    /**
     * CAS
     */
    fun onTest7(v : View) {
        lateinit var s1: String
        lateinit var s2: String

        val cas = AtomicInteger(2)

        Thread {
            s1 = task1()
            cas.getAndDecrement()
        }.start()

        Thread {
            s2 = task2()
            cas.getAndDecrement()
        }.start()

        while (cas.get() != 0) {}

        task3(s1, s2)
    }

    /**
     * Future
     */
    fun onTest8(v : View) {
        val future1 = FutureTask(Callable(task1))
        val future2 = FutureTask(Callable(task2))
        Executors.newCachedThreadPool().execute(future1)
        Executors.newCachedThreadPool().execute(future2)
        task3(future1.get(), future2.get())
    }

    /**
     * CompletableFuture
     */
    fun onTest9(v : View) {
        CompletableFuture.supplyAsync(task1)
            .thenCombine(CompletableFuture.supplyAsync(task2)) { p1, p2 ->
                task3(p1, p2)
            }.join()
    }

    /**
     * Rxjava
     */
    fun onTest10(v : View) {
//        Observable.zip(
//            Observable.fromCallable(Callable(task1))
//                .subscribeOn(Schedulers.newThread()),
//            Observable.fromCallable(Callable(task2))
//                .subscribeOn(Schedulers.newThread()),
//            BiFunction(task3)
//        ).test().awaitTerminalEvent()
    }

    /**
     * Coroutine
     */
    fun onTest11(v : View) {
        runBlocking {
            val c1 = async(Dispatchers.IO) {
                task1()
            }

            val c2 = async(Dispatchers.IO) {
                task2()
            }

            task3(c1.await(), c2.await())
        }
    }

    /**
     * Flow
     */
    fun onTest12(v : View) {
//        val flow1 = flow<String> { emit(task1()) }
//        val flow2 = flow<String> { emit(task2()) }
//
//        runBlocking {
//            flow1.zip(flow2) { t1, t2 ->
//                task3(t1, t2)
//            }.flowOn(Dispatchers.IO)
//                .collect()
//
//        }
    }


}