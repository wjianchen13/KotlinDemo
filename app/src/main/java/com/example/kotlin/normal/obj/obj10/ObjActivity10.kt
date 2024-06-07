package com.example.kotlin.normal.obj.obj10

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.normal.obj.obj7.Student7

/**
 * val或者var的参数将自动成为该类的字段
 */
class ObjActivity10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj10)
    }

    /**
     * val或者var的参数将自动成为该类的字段
     */
    fun onTest1(v : View) {
        val p = Student7("1002", 3)
        println("name:" + p.name  + "  age: " + p.age)
    }

}