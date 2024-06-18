package com.example.kotlin.first.obj.obj10

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 接口
 */
class ObjActivity10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj10)
    }

    /**
     * 接口
     */
    fun onTest1(v : View) {
        val p = Student10("1003", 3)
        doStudy(p)
    }

    private fun doStudy(study : Study) {
        study.readBooks()
        study.doHomework()
    }

}