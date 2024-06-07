package com.example.kotlin.normal.var1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

class VarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_var)
    }

    /**
     * val（value 的简写）用来声明一个不可变的变量，这种变量在初始赋值之后就再也不能重新赋
     * 值，对应Java 中的final变量。
     * var（variable 的简写）用来声明一个可变的变量，这种变量在初始赋值之后仍然可以再被重新
     * 赋值，对应Java 中的非final变量。
     */
    fun onVar(v : View) {
        val a = 10
        println("a = $a")
    }

    fun onVar1(v : View) {
        var a: Int = 10
        a = a * 10
        println("a = $a")

        // 如果开始没有指定类型，变量会自动推倒成赋值之后的类型，后面就不能改变类型了
        var b = "10"
        b = "str"
        println("a = $a")
    }


}