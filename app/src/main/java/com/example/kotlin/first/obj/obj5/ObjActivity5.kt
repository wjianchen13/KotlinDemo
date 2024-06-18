package com.example.kotlin.first.obj.obj5

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 次构造函数
 */
class ObjActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj5)
    }

    /**
     * 次构造函数测试
     */
    fun onTest1(v : View) {
        val p = Student4("1002", 3)
        p.info()
    }

}