package com.example.kotlin.normal.obj.obj7

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.normal.obj.obj6.Student5

/**
 * 测试父类和子类的init代码块
 */
class ObjActivity7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj7)
    }

    /**
     * 测试
     */
    fun onTest1(v : View) {
        val p = Student7("1002", 3)
        p.info()
    }

}