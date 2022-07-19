package com.example.kotlin.normal.obj

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

class ObjActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj)
    }

    /**
     *
     */
    fun onTest1(v : View) {
        val p = Person()
        p.name = "Jack"
        p.age = 19
        p.eat()
    }

    fun onVar1(v : View) {
        var a: Int = 10
        a = a * 10
        println("a = " + a)

    }


}