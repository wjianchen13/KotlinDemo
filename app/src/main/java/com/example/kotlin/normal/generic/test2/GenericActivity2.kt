package com.example.kotlin.normal.generic.test2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 泛型方法
 */
class GenericActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic3)
    }

    /**
     * 泛型方法测试
     */
    fun onTest1(v : View) {
        val myClass = MyClass2()
        val result = myClass.method<Int>(123)
        println("============> result: $result")

    }

}