package com.example.kotlin.first.coroutines.test5

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlin.coroutines.suspendCoroutine

/**
 * 协程常用的写法
 */
class CoroutinesFirstActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_coroutines5)
    }

    suspend fun request(address: String): String {
        return suspendCoroutine { continuation ->
//            HttpUtil.sendHttpRequest(address, object : HttpCallbackListener {
//                override fun onFinish(response: String) {
//                    continuation.resume(response)
//                }
//                override fun onError(e: Exception) {
//                    continuation.resumeWithException(e)
//                }
//            })
        }
    }

    /**
     *
     */
    fun onTest1(v : View) {
//        HttpUtil.sendHttpRequest(address, object : HttpCallbackListener {
//            override fun onFinish(response: String) {
//            // 得到服务器返回的具体内容
//            }
//            override fun onError(e: Exception) {
//            // 在这里对异常情况进行处理
//            }
//        })


    }

//    val appService = ServiceCreator.create<AppService>()
//    appService.getAppData().enqueue(object : Callback<List<App>> {
//        override fun onResponse(call: Call<List<App>>, response: Response<List<App>>) {
//        // 得到服务器返回的数据
//        }
//        override fun onFailure(call: Call<List<App>>, t: Throwable) {
//        // 在这里对异常情况进行处理
//        }
//    })

    /**
     *
     */
    fun onTest2(v : View) {
//        suspend fun <T> Call<T>.await(): T {
//            return suspendCoroutine { continuation ->
//                enqueue(object : Callback<T> {
//                    override fun onResponse(call: Call<T>, response: Response<T>) {
//                        val body = response.body()
//                        if (body != null) continuation.resume(body)
//                        else continuation.resumeWithException(
//                            RuntimeException("response body is null"))
//                    }
//                    override fun onFailure(call: Call<T>, t: Throwable) {
//                        continuation.resumeWithException(t)
//                    }
//                })
//        }
    }

    /**
     *
     */
    fun onTest3(v : View) {

    }

    /**
     *
     */
    fun onTest4(v : View) {

    }

    /**
     *
     */
    fun onTest5(v : View) {

    }



}