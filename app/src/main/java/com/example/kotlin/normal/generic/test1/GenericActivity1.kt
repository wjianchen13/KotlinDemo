package com.example.kotlin.normal.generic.test1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 泛型类
 */
class GenericActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic1)
    }

    /**
     * 泛型类测试
     */
    fun onTest1(v : View) {
        val myClass = MyClass1<Int>()
        val result = myClass.method(123)
    }

}