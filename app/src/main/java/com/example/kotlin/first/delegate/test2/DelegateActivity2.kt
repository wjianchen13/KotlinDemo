package com.example.kotlin.first.delegate.test2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 属性模式
 */
class DelegateActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate2)
    }

    /**
     * var属性委托
     */
    fun onTest1(v : View) {
        var myClass = MyClass()
        myClass.p
        myClass.p = "hello"
    }

    /**
     * val属性委托
     */
    fun onTest2(v : View) {
        var myClass = MyClass2()
        myClass.p
    }

    /**
     * var属性委托 泛型
     */
    fun onTest3(v : View) {
        var myClass = MyClass3()
        myClass.p
        myClass.p = "onTest3"
    }


}