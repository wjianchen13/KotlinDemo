package com.example.kotlin.normal.obj.obj9

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.normal.obj.obj7.Student7

/**
 * 父类次构造函数
 */
class ObjActivity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj9)
    }

    /**
     * 父类次构造函数测试
     */
    fun onTest1(v : View) {
        val p = Student9("1002", 3, 1)
        println("name:" + p.name  + "  age: " + p.age + "  sex: " + p.mSex)

        val p1 = Person9() // Person9次参构造方法定义了无参构造方法
    }

}