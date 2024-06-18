package com.example.kotlin.first.var1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import java.lang.Integer.max

/**
 * 不少刚接触编程的人对于函数和方法这两个概念有些混淆，不明白它们有什么区别。其实，函
 * 数和方法就是同一个概念，这两种叫法都是从英文翻译过来的，函数翻译自function ，方法翻
 * 译自method ，它们并没有什么区别，只是不同语言的叫法习惯不一样而已。
 * 语法规则如下：
    fun methodName(param1: Int, param2: Int): Int {
        return 0
    }
 */
class FunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun)
    }

    /**
     * 测试函数
     */
    fun onTest1(v : View) {
        val a = 37
        val b = 40
        val value = largerNumber(a, b)
        println("larger number is " + value)
    }

    fun largerNumber(num1: Int, num2: Int): Int {
        return max(num1, num2)
    }

    /**
     * 测试函数
     */
    fun onTest2(v : View) {
        val a = 37
        val b = 40
        val value = largerNumber1(a, b)
        println("larger number is " + value)
    }

    /**
     * 当一个函数中只有一行代码时，Kotlin允许我们不必编写函数体，可以直接将唯一的一行代码写
     * 在函数定义的尾部，中间用等号连接即可。
     */
    fun largerNumber1(num1: Int, num2: Int): Int = max(num1, num2)

    /**
     * 测试函数
     */
    fun onTest3(v : View) {
        val a = 37
        val b = 40
        val value = largerNumber2(a, b)
        println("larger number is " + value)
    }

    /**
     * Kotlin类型推导机制，在这里它也可以发挥重要的作用。由于max()函数返回的是一个
     * Int值，而我们在largerNumber()函数的尾部又使用等号连接了max()函数，因此Kotlin可
     * 以推导出largerNumber()函数返回的必然也是一个Int值，这样就不用再显式地声明返回值
     * 类型了，
     */
    fun largerNumber2(num1: Int, num2: Int) = max(num1, num2)

}