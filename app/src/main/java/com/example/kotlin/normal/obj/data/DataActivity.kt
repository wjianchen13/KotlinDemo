package com.example.kotlin.normal.obj.data

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 数据类
 */
class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
    }

    /**
     * 数据类测试
     */
    fun onTest1(v : View) {
        val cellphone1 = Cellphone("Samsung", 1299.99)
        val cellphone2 = Cellphone("Samsung", 1299.99)
        println(cellphone1)
        println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))
    }

}