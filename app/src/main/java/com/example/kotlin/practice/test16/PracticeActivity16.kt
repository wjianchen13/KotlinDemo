package com.example.kotlin.practice.test16

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.practice.test16.ITest16
import com.example.kotlin.practice.test16.Test3

/**
 * 测试Kotlin接口属性获取不会调用括号内容的问题
 */
class PracticeActivity16 : AppCompatActivity() {

    private var test3: Test3? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice16)
    }

    /**
     * 测试
     */
    fun onTest1(v : View) {
        val test3 = (getITest().jsInterfaceObject as Test3)
        test3.showToast(this, "test1")
    }

    private fun getITest(): ITest16 {
        return object : ITest16 {

            override val jsInterfaceName: String?
                get() = "jsInterfaceName"

            override val jsInterfaceObject: Any?
                get() {
                    if(test3 == null)
                        test3 = Test3()
                    return test3
                }

            // 这里返回的是一个lambda表达式
//            override val jsInterfaceObject: Any?
//                get() = {
//                    if(test3 == null)
//                        test3 = Test3()
//                    test3
//                }

            override fun clear() {

            }
        }
    }


}