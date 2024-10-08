package com.example.kotlin.first.obj

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.first.obj.data.DataActivity
import com.example.kotlin.first.obj.obj1.ObjActivity1
import com.example.kotlin.first.obj.obj10.ObjActivity10
import com.example.kotlin.first.obj.obj11.ObjActivity11
import com.example.kotlin.first.obj.obj12.ObjActivity12
import com.example.kotlin.first.obj.obj2.ObjActivity2
import com.example.kotlin.first.obj.obj3.ObjActivity3
import com.example.kotlin.first.obj.obj4.ObjActivity4
import com.example.kotlin.first.obj.obj5.ObjActivity5
import com.example.kotlin.first.obj.obj6.ObjActivity6
import com.example.kotlin.first.obj.obj7.ObjActivity7
import com.example.kotlin.first.obj.obj8.ObjActivity8
import com.example.kotlin.first.obj.obj9.ObjActivity9
import com.example.kotlin.first.obj.singleton.SingletonActivity

class ObjActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj)
    }

    /**
     * 类的简单定义
     */
    fun onTest1(v : View) {
        startActivity(Intent(this, ObjActivity1::class.java))
    }

    /**
     * 类的继承
     */
    fun onTest2(v : View) {
        startActivity(Intent(this, ObjActivity2::class.java))

    }

    /**
     * 类的构造函数
     */
    fun onTest3(v : View) {
        startActivity(Intent(this, ObjActivity3::class.java))
    }

    /**
     * 主构造函数
     */
    fun onTest4(v : View) {
        startActivity(Intent(this, ObjActivity4::class.java))
    }

    /**
     * 次构造函数
     */
    fun onTest5(v : View) {
        startActivity(Intent(this, ObjActivity5::class.java))
    }

    /**
     * 无主构造函数
     */
    fun onTest6(v : View) {
        startActivity(Intent(this, ObjActivity6::class.java))
    }

    /**
     * 测试父类和子类的init代码块
     */
    fun onTest7(v : View) {
        startActivity(Intent(this, ObjActivity7::class.java))
    }

    /**
     * val或者var的参数将自动成为该类的字段
     */
    fun onTest8(v : View) {
        startActivity(Intent(this, ObjActivity8::class.java))
    }

    /**
     * 父类次构造函数
     */
    fun onTest9(v : View) {
        startActivity(Intent(this, ObjActivity9::class.java))
    }

    /**
     * 接口
     */
    fun onTest10(v : View) {
        startActivity(Intent(this, ObjActivity10::class.java))
    }

    /**
     * 接口默认实现
     */
    fun onTest11(v : View) {
        startActivity(Intent(this, ObjActivity11::class.java))
    }

    /**
     * 数据类
     */
    fun onTest12(v : View) {
        startActivity(Intent(this, DataActivity::class.java))
    }

    /**
     * 单例类
     */
    fun onTest13(v : View) {
        startActivity(Intent(this, SingletonActivity::class.java))
    }

    /**
     * 没有主构造函数的情况
     */
    fun onTest14(v : View) {
        startActivity(Intent(this, ObjActivity12::class.java))
    }


}