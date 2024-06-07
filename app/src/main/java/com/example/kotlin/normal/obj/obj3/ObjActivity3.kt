package com.example.kotlin.normal.obj.obj3

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 类的构造函数
 */
class ObjActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj3)
    }

    /**
     * 类的构造函数测试
     */
    fun onTest1(v : View) {
        val p = Student2("1000", 3)
        p.name = "Jack"
        p.age = 19
        p.info()
    }

}