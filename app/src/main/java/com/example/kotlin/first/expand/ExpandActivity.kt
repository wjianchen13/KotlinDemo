package com.example.kotlin.first.expand

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 扩展函数和运算符重载
 */
class ExpandActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expand)
    }

    /**
     * 统计某个字符串中的字母数量
     */
    fun onTest1(v : View) {
        val str = "ABC123xyz!@#"
        val count = StringUtil.lettersCount(str)
    }

    /**
     * 可变list
     */
    fun onTest2(v : View) {
        val count = "ABC123xyz!@#".lettersCount()
    }

    /**
     * 运算符重载
     */
    fun onTest3(v : View) {
        val money1 = Money(5)
        val money2 = Money(10)
        val money3 = money1 + money2
        println(money3.value)
    }

    /**
     * 运算符重载
     */
    fun onTest4(v : View) {
        val money1 = Money(5)
        val money2 = Money(10)
        val money3 = money1 + money2
        val money4 = money3 + 20
        println(money4.value)
    }

    /**
     * 运算符重载
     */
    fun onTest5(v : View) {
        val str = "abc" * 3
        println(str)
    }

}