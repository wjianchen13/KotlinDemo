package com.example.kotlin.normal.obj.obj2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 类的继承
 */
class ObjActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj2)
    }

    /**
     * 类的继承
     */
    fun onTest1(v : View) {
        val p = Student1()
        p.name = "Jack"
        p.age = 19
        p.grade=2
        p.sno="1000"
        p.info()
    }

}