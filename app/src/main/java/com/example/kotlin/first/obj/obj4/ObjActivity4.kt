package com.example.kotlin.first.obj.obj4

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 主构造函数
 */
class ObjActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj4)
    }

    /**
     * 主构造函数 测试
     */
    fun onTest1(v : View) {
        val p = Student3("1000", 3, "hello", 20)
        p.info()
    }

}