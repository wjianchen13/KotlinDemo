package com.example.kotlin.normal.generic.test3

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 泛型指定上界
 */
class GenericActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic2)
    }

    /**
     * 泛型指定上界测试
     */
    fun onTest1(v : View) {
        val myClass = MyClass3()
        val result = myClass.method<Int>(123)
        println("============> result: $result")

    }

    /**
     * 所有的泛型都是可以指定成可空类型的
     */
    fun onTest2(v : View) {
        val myClass = MyClass3()
        val result = myClass.method1<Any?>(null)
        println("============> result: $result")

    }

    /**
     * 泛型的类型不可为空
     */
    fun onTest3(v : View) {
        val myClass = MyClass3()
        val result = myClass.method2<Any>(123)
        println("============> result: $result")

    }

}