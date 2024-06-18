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
     *
     */
    fun onTest8(v : View) {

    }

    /**
     *
     */
    fun onTest9(v : View) {
        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
        val newList = list.map { it.toUpperCase() } // 全部转换成大写
        for (fruit in newList) {
            println(fruit)
        }
    }

    /**
     *
     */
    fun onTest10(v : View) {

    }

    /**
     *
     */
    fun onTest11(v : View) {

    }

    /**
     *
     */
    fun onTest12(v : View) {

    }

    /**
     *
     */
    fun onTest13(v : View) {

    }

}