package com.example.kotlin.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 高阶函数的演化过程
 */
class HigherActivity5 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_higher5)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 高阶函数的演化过程"
    }

    /**
     * 测试1
     */
    fun onTest1(v : View) {
        // TODO 2 历史演化过程： 1 2 3 4
        show("Zhangsan", lambda = {
            println("输出:$it")
        })

        show("Zhangsan", {
            println("输出:$it")
        })

        show("Zhangsan") {
            println("输出:$it")
        }

        show {
            println("输出:$it")
        }
    }

    /**
     * 测试2
     */
    fun onTest2(v : View) {
        // TODO 4 多个Lambda 历史演化过程： 1 2 3 4  并且 顺序可以随意互换
        show2(lamba1 = {
            println("lamba1输出:$it")
        }, lamba2 = {
            println("lamba2输出:$it")
        })

        show2({
            println("lamba1输出:$it")
        }, {
            println("lamba2输出:$it")
        })

        show2({
            println("lamba1输出:$it")
        }) {
            println("lamba2输出:$it")
        }

        // 明确的指定，能不能顺序调换
        show2(lamba2 = {
            println("lamba2输出:$it")
        }, lamba1 = {
            println("lamba1输出:$it")
        })
    }

    /**
     * 测试3
     */
    fun onTest3(v : View) {
        // TODO 6 演示具体指定参数的好处 (KT 一切都要透明化)
        show3(sex = '女', sex_ = '男', sxe = '女', age = 99, name = "Derry")
    }

    // TODO 1 历史演化过程： 1 2 3 4 【参数一:有默认参数，参数二:lambda输入是参数一】
    fun show(name: String = "Derry", lambda: (String) -> Unit) = lambda(name)

    // TODO 3 多个Lambda 历史演化过程： 1 2 3 4 【参数一、二，是不同的lambda，输入为Int】
    fun show2(lamba1: (Int) -> Unit, lamba2: (Int) -> Unit) {
        lamba1(100)
        lamba2(200)
    }

    // TODO 5 写一个函数 name，age，sex，sex_，_age，sxe: Char
    fun show3(name: String, age: Int, sex: Char, sex_ : Char, sxe: Char) {}
}

