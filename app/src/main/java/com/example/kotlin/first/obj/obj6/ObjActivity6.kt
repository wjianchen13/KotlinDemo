package com.example.kotlin.first.obj.obj6

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 无主构造函数
 */
class ObjActivity6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj6)
    }

    /**
     * 无主构造函数 测试
     */
    fun onTest1(v : View) {
        val p = Student5("1002", 3)
        p.info()
    }

}