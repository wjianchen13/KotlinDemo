package com.example.kotlin.normal.generic.test5

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 泛型实化
 */
class GenericActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic5)
    }

//    inline fun <reified T> getGenericType() {
//    }

    inline fun <reified T> getGenericType() = T::class.java

    /**
     * 泛型实化 测试
     */
    fun onTest1(v : View) {
        val result1 = getGenericType<String>()
        val result2 = getGenericType<Int>()
        println("result1 is $result1")
        println("result2 is $result2")
    }

    /**
     * 泛型实化 应用
     */
    fun onTest2(v : View) {
        startActivity<GenericActivity5>(this)
    }

    /**
     * 泛型实化 应用
     */
    fun onTest3(v : View) {
        startActivity<GenericActivity5>(this) {
            putExtra("param1", "data")
            putExtra("param2", 123)
        }
    }

}