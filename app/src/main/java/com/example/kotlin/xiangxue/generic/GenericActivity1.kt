package com.example.kotlin.xiangxue.generic

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 泛型快速入门
 */
class GenericActivity1 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 泛型快速入门"
    }

    /**
     * 泛型快速入门
     */
    fun onDelegateBase(v : View) {
        // 1.完整写法
        val myStudy : MyStudy<String> = MyStudy<String>("Derry is OK")
        println(myStudy.item)

        val myStudy2 : MyStudy<Boolean> = MyStudy<Boolean>(false)
        println(myStudy2.item)

        // 2.泛型 的 类型推断
        val myStudy3  = MyStudy("Derry is OK")  // 把T推断成 String
        println(myStudy3.item)

        val myStudy4  = MyStudy(true) // 把T推断成 Boolean
        println(myStudy4.item)
    }

    // T? 可以传null，标准的写法
    class MyStudy<T>(type: T) {
        var item: T = type
    }

}



