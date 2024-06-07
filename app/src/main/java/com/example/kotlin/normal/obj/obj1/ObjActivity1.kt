package com.example.kotlin.normal.obj.obj1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 类的简单定义
 */
class ObjActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj1)
    }

    /**
     * 类的简单创建
     */
    fun onTest1(v : View) {
        val p = Person()
        p.name = "Jack"
        p.age = 19
        p.eat()
    }

}