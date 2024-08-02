package com.example.kotlin.xiangxue.coroutines

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

/**
 * Kotlin 传统方式完成异步任务网络加载
 */
class CoroutinesActivity1 : AppCompatActivity() {

    private var textView : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines1)
        textView = findViewById(R.id.textView)
    }

    // TODO 第二大步骤：主线程 更新UI（注意：本次所有代码 是Kotlin的简写，如果是Java代码量更多）
    val mHandler = Handler(Looper.getMainLooper()) {
        // as xx 转换成xx类型

        val result =  it.obj as LoginRegisterResponseWrapper2<LoginRegisterResponse2>
        Log.d(TAG, "errorMsg: ${result.data}")
        textView?.text = result.data.toString() // 更新控件 UI

        mProgressDialog?.dismiss() // 隐藏加载框

        false
    }

    private val TAG = "Derry"
    var mProgressDialog: ProgressDialog? = null

    /**
     * 传统方式完成异步任务网络加载 测试
     */
    // 按钮 点击事件
    fun startRequest(view: View) {
        mProgressDialog = ProgressDialog(this)
        mProgressDialog?.setTitle("请求服务器中...")
        mProgressDialog?.show()

        // TODO 第一打步骤：异步线程开启 请求服务器
        object: Thread() {
            override fun run() {
                super.run()

                Thread.sleep(2000)

                val loginResult =
                    APIClient.instance.instanceRetrofit(WanAndroidAPI::class.java)
                        .loginAction("Derry-vip", "123456")

                val result : LoginRegisterResponseWrapper2<LoginRegisterResponse2>? = loginResult.execute().body()


                // 切换android 主线程，更新UI  把最终登录成功的JavaBean（KT数据类） 发送给  Handler
                val msg = mHandler.obtainMessage()
                msg.obj = result
                mHandler.sendMessage(msg)
            }
        }.start()
    }



}



