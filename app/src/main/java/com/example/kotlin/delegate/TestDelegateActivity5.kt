package com.example.kotlin.delegate

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 懒加载
 */
class TestDelegateActivity5 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 懒加载"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        println("准备工作中...")
        Thread.sleep(3000L)

        println("开始请求中")
        println(responseData) // responseData如果没有值，只有在用responseData的时候，才会加载，这就是懒加载
        println(responseData) // responseData如果有值了，会直接返回
        println(responseData) // responseData如果有值了，会直接返回
    }

    fun requestDownload() : String {
        println("requestDownload run 》》》》》》")
        Thread.sleep(2000L) // 模拟下载延时了
        return "恭喜你，下载完成了"
    }

    val responseData : String by lazy { requestDownload() }
    
}


