package com.example.kotlin.coroutines

import android.app.ProgressDialog
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.derry.kt_coroutines.use.api.APIClient
import com.derry.kt_coroutines.use.api.WanAndroidAPI
import com.derry.kt_coroutines.use.entity.LoginRegisterResponse2
import com.derry.kt_coroutines.use.entity.LoginRegisterResponseWrapper2
import com.example.kotlin.R
import kotlinx.android.synthetic.main.activity_coroutines1.*
import kotlinx.coroutines.*

/**
 * Kotlin 协程方式完成异步任务网络加载
 *
 */
class CoroutinesActivity2 : AppCompatActivity(), CoroutineScope by MainScope()  {

    // GlobalScope 全局的，一般不会释放，所以基本不要
    // MainScope 需要自己 取消
    // LifecycleScope 你不需要关心取消，他自动绑定Lifecycle生命周期了
    // ViewModelScope 你不需要关心取消，他自动绑定ViewModel生命周期了
    // val main = MainScope()

    private val TAG = "Derry"
    var mProgressDialog: ProgressDialog? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines1)
        tvTitle?.text = "Kotlin 协程方式完成异步任务网络加载"
    }

    /**
     * 传统方式完成异步任务网络加载 测试
     */
    // 按钮 点击事件
    fun startRequest(view: View) {
        mProgressDialog = ProgressDialog(this)
        mProgressDialog?.setTitle("请求服务器中...")
        mProgressDialog?.show()

        // GlobalScope 全局作用域，一般不用全局的，除非测试的时候，可以用

        // Android中使用的话，他默认是IO线程，所以需要修改成main线程
        /*main.*/launch(Dispatchers.Main) {  // UI 线程
            val result =
                APIClient.instance.instanceRetrofit(WanAndroidAPI::class.java)
                    .loginActionCoroutine("Derry-vip", "123456") // 1.挂起出去执行异步操作  2.操作完成后恢复主线程

            // 更新UI 因为这个括号里面是主线程，当然可以更新UI
            Log.d(TAG, "errorMsg: ${result.data}")
            textView.text = result.data.toString() // 更新控件 UI

            mProgressDialog?.dismiss() // 隐藏加载框
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        /*main.*/cancel()
    }



}



