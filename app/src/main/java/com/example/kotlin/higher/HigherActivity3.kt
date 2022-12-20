package com.example.kotlin.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 高阶函数测试
 */
class HigherActivity3 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 高阶函数测试3"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        // 站在用户角度上
        loginEngine("Derry 23", "123456") {
            if (it) println("最终登录的结果是：登录成功") else println("最终登录的结果是：登录失败!!")
        }
    }
}

private fun loginEngine(userName: String, userPwd: String, responseResult: (Boolean) -> Unit) {
    if (userName == "Derry" && userPwd == "123456") {
        responseResult(true)
    } else {
        responseResult(false)
    }
}




