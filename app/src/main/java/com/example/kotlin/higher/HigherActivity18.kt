package com.example.kotlin.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 手写内置函数let
 */
class HigherActivity18 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 手写内置函数let"
    }

    /**
     * let函数默认当前对象作为闭包的it参数，并以最后一行代码作为返回值
     */
    fun onDelegateBase(v : View) {
        // TODO 官方的：
        val r : Float = "Derry".let {
            it // it == 调用者本身 == "Derry"   输入

            ""
            true
            9
            4354.545f // lambda最后一行作为返回值 Float  输出
        }
        println(r)

        // 我们自己写一套
        val r2 : Boolean = "Derry".mLet {
            println("我的值是：$it")  // 输入

            false // lambda最后一行作为返回值 Boolean 输出
        }
        println(r2)
    }

    // 特点： let 与 run 区别只有一点    let"(I)" {持有 it}     run"I.()"  {持有 this}
    // 1. I.mLet 万能类型.mLet  所有类型都可以调用 mLet函数
    // 2. -> O lambda里面最后一行是true，那么就是Boolean的返回
    // 3. (I) 让lambda持有it
    private inline fun <I, O> I.mLet(lambda: (I) -> O) : O = lambda(this) // I.xxx  {  this == I本身 }


}

