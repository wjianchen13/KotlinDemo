package com.example.kotlin.first.obj.obj11

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 接口默认实现
 */
class ObjActivity11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj11)
    }

    /**
     * 接口默认实现
     */
    fun onTest1(v : View) {
        val p = Student11("1003", 3)
        doStudy2(p)
    }

    private fun doStudy2(study : Study2) {
        study.readBooks()
        study.doHomework()
    }

}