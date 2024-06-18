package com.example.kotlin.xiangxue.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 高阶函数测试
 */
class HigherActivity2 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 高阶函数测试2"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        loginEngine("Derry", "123456")
    }
}

// 登录功能 高阶函数完成
private fun loginEngine(userName: String, userPwd: String) {
    // 使用高阶函数
    loginCheck(userName, userPwd) { name, pwd ->
        // 例如：服务器发起 request
        if (name == "Derry" && pwd == "123456") {
            println("恭喜${name}登录成功")
        } else {
            println("不恭喜${name}登录失败")
        }
    }
}

// 高阶函数 规则
private fun loginCheck(userName: String, userPwd: String, checkResult: (String, String) -> Unit) {
    if (userName.isEmpty() || userPwd.isEmpty()) {
        return
    }

    if (userName == null || userPwd == null) {
        return
    }

    // 做 name pwd 校验工作的
    // ...
    // 省略了 几万行代码

    // 检查通过了，用户名 与 密码 OK
    checkResult(userName, userPwd)
}


