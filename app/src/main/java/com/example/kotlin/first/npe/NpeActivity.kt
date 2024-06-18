package com.example.kotlin.first.npe

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 空指针
 */
class NpeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_npe)
    }

    /**
     *
     */
    fun onTest1(v : View) {
//        doStudy(null) // 报错 Kotlin默认所有的参数和变量都不可为空
        doStudy2(null)
        doStudy2(null)
    }

    fun doStudy(study: Study) {
        study.readBooks()
        study.doHomework()
    }

    fun doStudy2(study: Study?) {
        if(study != null) {
            study.readBooks()
            study.doHomework()
        }
    }

    fun doStudy3(study: Study?) {
        study?.readBooks()
        study?.doHomework()
    }

    /**
     * ?:操作符。这个操作符的左右两边都接收一个表达式，
     * 如果左边表达式的结果不为空就返回左边表达式的结果，否则就返回右边表达式的结果
     */
    fun onTest2(v : View) {
        var a = true
        var b = false
        val c = a ?: b
        println("==========> c: " + c)
    }

    /**
     * 获取文本长度
     */
    fun onTest3(v : View) {
        println("==========> length: " + getTextLength("hello"))
    }

    fun getTextLength(text: String?) = text?.length ?: 0

    /**
     * 如果我们想要强行通过编译，可以使用非空断言工具，写法是在对象的后面加上!!
     */
    fun onTest4(v : View) {
        if (content != null) {
            printUpperCase()
        }
    }

    var content: String? = "hello"

    fun printUpperCase() {
        val upperCase = content!!.toUpperCase()
        println(upperCase)
    }

    /**
     * let 函数 提供了函数式API的编程接口，并将原始调用对象作为参数传递到Lambda 表达式中、
     * obj.let { obj2 ->
     * // 编写具体的业务逻辑
     * }
     * 这里调用了obj对象的let函数，然后Lambda 表达式中的代码就会立即执行，并且
     * 这个obj对象本身还会作为参数传递到Lambda 表达式中
     */
    fun onTest5(v : View) {
        var s = Student("hello", 19)
        doStudy4(s)
    }

    fun doStudy4(study: Study?) {
        study?.let { stu ->
            stu.readBooks()
            stu.doHomework()
        }
    }

    /**
     * 当Lambda 表达式的参数列表中只有一个参数时，可以不用声明参数名，直接使用it关键字来代替即可
     */
    fun doStudy5(study: Study?) {
        study?.let {
            it.readBooks()
            it.doHomework()
        }
    }

    /**
     * let 处理全局变量判空问题
     */
    fun onTest6(v : View) {
        study = Student("hello11", 29)
        doStudy7()
    }

    var study : Study? = null

    /**
     * 报错  if语句不可以处理全局变量的判空问题的
     */
    fun doStudy6() {
//        if(study != null) {
//            study.readBooks()
//            study.doHomework()
//        }
    }

    /**
     * let函数可以处理全局变量的判空问题的
     */
    fun doStudy7() {
        study?.let {
            it.readBooks()
            it.doHomework()
        }
    }

    /**
     * 内嵌表达式
     *  Kotlin允许我们在字符串里嵌入${}这种语法结构的表达式，并在运行时使用表达式
     * 执行的结果替代这一部分内容。
     * 另外，当表达式中仅有一个变量的时候，还可以将两边的大括号省略
     */
    fun onTest7(v : View) {
        var t = 123
        println("hello, $t. nice to meet you!")
        println("hello, ${2 + 3}. nice to meet you!")
    }

    /**
     * 函数默认参数
     */
    fun onTest8(v : View) {
        printParams(2)
    }

    fun printParams(num: Int, str: String = "hello") {
        println("num is $num , str is $str")
    }


    /**
     * 函数默认参数 指定变量名
     */
    fun onTest9(v : View) {
        printParams1(str = "world", num = 123)
    }

    fun printParams1(num: Int = 100, str: String) {
        println("num is $num , str is $str")
    }

    /**
     * 函数默认参数 省略参数
     */
    fun onTest10(v : View) {
        printParams2(str = "world")
    }

    fun printParams2(num: Int = 100, str: String) {
        println("num is $num , str is $str")
    }


}