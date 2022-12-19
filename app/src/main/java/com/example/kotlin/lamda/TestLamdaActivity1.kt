package com.example.kotlin.lamda

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin Lamda
 */
class TestLamdaActivity1 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin Lamda表达式"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        // k01返回的是什么类型? 答：  函数返回一个函数   (Int) -> Unit
        fun k01() = {n1: Int -> println("你输入的类型是int?${if (n1 is Int) "你是Int类型 $n1" else "你不是Int类型"}")}
        k01()(89)

        // k02返回的是什么类型? 答：(Int, Int) -> Char
        fun k02() : (Int, Int) -> Char  = { n1: Int, n2:Int -> println("两数相加:${n1+n2}")
            true
            'A'
        }// 划重点，想写多行直接敲回车，为什么要换行：为了编译器检查

        // TODO 第二节课直播讲的内容，继续Lambda （以上节课基础 为根基的）
        val methodX1 : (String) -> Int = fun(str) : Int {
            return str.length // 不是我们之前学习的Lambda体{}, 这个是方法体了，需要写return
        }
        // 一般开发不会用 fun关键字 + 声明处

        val methodX2 = {str: String -> str.length}
        val methodX2s : (String) -> Int = { it.length }
        // 哪种写法比较通用点? = {str : String -> str.length} 因为可以偷懒

        // Function1<String, Int>  等价于  (String) -> Int
        val methodX3 : Function1<String, Int> = {str: String -> str.length}
        println(methodX3("Derry"))

        val methodX4 : Function2<Boolean, String, Unit> = {isOK: Boolean, str: String -> println("isOK:$isOK")}
        methodX4(true, "DerryOK")

        // 一般是 Lambda + 函数 == 高阶函数

        // fun aa{} 与 var aa2={}有啥区别?
        fun aa() {}
        val aa2 = {}
        // aa就是一个函数，实打实的函数
        // aa2是接收一个匿名函数的变量而已，这个变量 可以执行这个匿名函数
        // 共同点：他们的现象是一样的，所以有同学就纠结了
        val aa3 = aa2 // 都属于函数引用的概念
        val aa4 = ::aa // ::的含义 就是把这个实打实的函数，变成 函数引用 所以可以赋值传递 给另外一个变量

        // 前面为什么用val方法不应该是fun吗？
        // 我们一直在写匿名函数，把匿名函数给 val method01 变量
        // KT函数是一等公民

        // 全栈语言： 服务器，iOS，Android，Windows，JS，Gradle Groovy  build.gradle.kts ...
        // native层

        // 函数中的函数，就是高阶函数，   函数如果有Lambda就属于高阶函数

        // KT中的 基本上都是表达式 包括 if  可以灵活返回
        // Java中，基本上都是 语句 包括 if  执行体 不可以返回

        var a = if (true) 111 else 222
        
    }
    

}

