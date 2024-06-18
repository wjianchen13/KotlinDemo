package com.example.kotlin.first.late

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 延时初始化和密封类
 */
class LateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_late)
    }

    /**
     * 延迟初始化
     */
    fun onTest1(v : View) {
        t = Test() // 对一个全局变量使用了lateinit关键字时，请一定要确保它在被任何地方调用之前 已经完成了初始化工作
        test()
    }

    private lateinit var t : Test

    fun test() {
        t.doAction1()
    }

    /**
     * 延迟初始化
     */
    fun onTest2(v : View) {
        test2()
    }

    private lateinit var t2 : Test

    fun test2() {
        if(!::t2.isInitialized) {
            t2 = Test()
        }

        t2.doAction1()
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


    /**
     *
     */
    fun onTest6(v : View) {

    }

    /**
     *
     */
    fun onTest7(v : View) {

    }

    /**
     * 函数默认参数
     */
    fun onTest8(v : View) {

    }


    /**
     *
     */
    fun onTest9(v : View) {

    }

    /**
     *
     */
    fun onTest10(v : View) {

    }

}