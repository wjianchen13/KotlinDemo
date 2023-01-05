package com.example.kotlin.coroutines

import android.app.ProgressDialog
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlinx.android.synthetic.main.activity_coroutines1.*
import kotlinx.coroutines.*

/**
 * Kotlin 模拟多个访问请求串行访问（协程实现）
 */
class CoroutinesActivity4 : AppCompatActivity(), CoroutineScope by MainScope()  {

    private val TAG = "Derry"
    var mProgressDialog: ProgressDialog? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines1)
        tvTitle?.text = "模拟多个访问请求串行访问（协程实现）"
    }

    /**
     * 传统方式完成异步任务网络加载 测试
     */
    fun startRequest(view: View) {
        mProgressDialog = ProgressDialog(this)
        mProgressDialog?.setTitle("请求服务器中...")
        mProgressDialog?.show()

        // Dispatchers.Main 包裹一层 Handler切换主线程
        // Dispatchers.IO 包裹一层
        GlobalScope.launch(Dispatchers.Main) {
            // TODO 先执行 异步请求1
            var serverResponseInfo = requestLoadUser()
            textView.text = serverResponseInfo // 更新UI
            textView.setTextColor(Color.GREEN) // 更新UI

            // TODO 更新UI完成后，再去执行 异步请求2
            serverResponseInfo = requestLoadUserAssets()
            textView?.text = serverResponseInfo // 更新UI
            textView?.setTextColor(Color.BLUE) // 更新UI

            // TODO 更新UI完成后，再去执行 异步请求3
            serverResponseInfo = requestLoadUserAssetsDetails()
            textView?.text = serverResponseInfo // 更新UI
            mProgressDialog?.dismiss() // 更新UI
            textView?.setTextColor(Color.RED) // 更新UI
        }
    }

}

/**
 * 请求加载[用户数据]
 * suspend 就是一个提醒作用，提醒用户 当前的函数，是挂起函数，可能会执行异常操作，你注意下
 */
private suspend fun requestLoadUser() : String {
    val isLoadSuccess = true // 加载成功，和，加载失败，的标记

    // 此协程能够保证在异步执行而已
    withContext(Dispatchers.IO) {
        delay(3000L)  // 模拟请求服务器 所造成的耗时
    }

    if (isLoadSuccess) {
        return "加载到[用户数据]信息集"
    } else {
        return "加载[用户数据],加载失败,服务器宕机了"
    }
}

/**
 * 请求加载[用户资产数据]
 */
private suspend fun requestLoadUserAssets(): String {
    val isLoadSuccess = true // 加载成功，和，加载失败，的标记

    // 开启异步线程，去请求加载服务器的数据集
    withContext(Dispatchers.IO) {
        delay(3000L) // 模拟请求服务器 所造成的耗时
    }
    if (isLoadSuccess) {
        return "加载到[用户资产数据]信息集"
    } else {
        return "加载[用户资产数据],加载失败,服务器宕机了"
    }
}

/**
 * 请求加载[用户资产详情数据]
 */
private suspend fun requestLoadUserAssetsDetails() : String {
    val isLoadSuccess = true // 加载成功，和，加载失败，的标记

    // 开启异步线程，去请求加载服务器的数据集
    withContext(Dispatchers.IO) {
        delay(3000L) // 模拟请求服务器 所造成的耗时
    }

    if (isLoadSuccess) {
        return "加载到[用户资产详情数据]信息集"
    } else {
        return "加载[用户资产详情数据],加载失败,服务器宕机了"
    }
}




