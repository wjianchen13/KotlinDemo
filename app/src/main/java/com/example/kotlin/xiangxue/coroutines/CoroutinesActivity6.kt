package com.example.kotlin.xiangxue.coroutines

import android.app.ProgressDialog
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlinx.android.synthetic.main.activity_coroutines1.*
import kotlinx.coroutines.*

/**
 * Kotlin 协程的挂起与恢复流程
 */
class CoroutinesActivity6 : AppCompatActivity(), CoroutineScope by MainScope()  {

    private val TAG = "Derry"
    var mProgressDialog: ProgressDialog? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines1)
        tvTitle?.text = "协程的挂起与恢复流程"
    }

    /**
     * 传统方式完成异步任务网络加载 测试
     */
    fun startRequest(view: View) {
        mProgressDialog = ProgressDialog(this)
        mProgressDialog?.setTitle("请求服务器中...")
        mProgressDialog?.show()

        // TODO >>>>>>>>>>>>>>>>>> 4.2：挂起到IO线程执行，恢复到Main线程显示 的流程分析 >>>>>>>>>>>>>>>>
        GlobalScope.launch(Dispatchers.Main) { // 默认是Default异步
            // 1.从当前协程体作用域Dispatchers.Main 协程依附的线程 到 挂起点 挂起函数 到 执行 请求耗时操作 而 切换到 IO异步线程
            // 2.IO异步线程执行完成后，开始恢复，当前作用域Dispatchers.Main，执行89行的左边代码，保证了 左边代码恢复到 UI线程
//            var serverResponseInfo0 = requestLoadUser()



            // { Dispatchers.Main 全部都是主线程 }

            // TODO 先执行 异步请求1
            var serverResponseInfo = requestLoadUser()
            textView?.text = serverResponseInfo // 更新UI
            textView?.setTextColor(Color.GREEN) // 更新UI

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

// TODO >>>>>>>>>>>>>>>>>>>>>>>>>> 4.1：使用协程的要点 >>>>>>>>>>>>>>>>>>>>>> start
/*【挂起函数 大概做了什么事情，画图描述清楚】 ↓ 切换 ↑
 * 请求加载[用户数据]
 */
private suspend fun requestLoadUser() : String {
    val isLoadSuccess = true // 加载成功，和，加载失败，的标记

    // 开启异步线程，去请求加载服务器的数据集
    withContext(Dispatchers.IO) {
        delay(3000L) // 模拟请求服务器 所造成的耗时
    }

    if (isLoadSuccess) {
        return "加载到[用户数据]信息集"
    } else {
        return "加载[用户数据],加载失败,服务器宕机了"
    }
}

/*【挂起函数 大概做了什么事情，画图描述清楚】 ↓ 切换 ↑
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

/*【挂起函数 大概做了什么事情，画图描述清楚】 ↓ 切换 ↑
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




