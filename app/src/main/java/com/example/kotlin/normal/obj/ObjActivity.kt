package com.example.kotlin.normal.obj

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.normal.obj.obj1.ObjActivity1
import com.example.kotlin.normal.obj.obj2.ObjActivity2
import com.example.kotlin.normal.obj.obj3.ObjActivity3
import com.example.kotlin.normal.obj.obj4.ObjActivity4
import com.example.kotlin.normal.obj.obj5.ObjActivity5
import com.example.kotlin.normal.obj.obj5.Student4
import com.example.kotlin.normal.obj.obj6.ObjActivity6
import com.example.kotlin.normal.obj.obj7.ObjActivity7
import com.example.kotlin.normal.obj.obj8.ObjActivity8
import com.example.kotlin.normal.obj.obj9.ObjActivity9

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


//    /**
//     * 接口
//     */
//    fun onTest7(v : View) {
////        val p = Student6("1003", 3)
////        doStudy(p)
//    }
//
//    fun doStudy(study : Study) {
//        study.readBooks()
//        study.doHomework()
//    }
//
//    /**
//     * 接口默认实现
//     */
//    fun onTest8(v : View) {
//        val p = Student7("1003", 3)
//        doStudy2(p)
//    }
//
//
//    /**
//     * 接口
//     */
//    fun onTest7(v : View) {
////        val p = Student6("1003", 3)
////        doStudy(p)
//    }
//
//    fun doStudy(study : Study) {
//        study.readBooks()
//        study.doHomework()
//    }
//
//    /**
//     * 接口默认实现
//     */
//    fun onTest8(v : View) {
//        val p = Student7("1003", 3)
//        doStudy2(p)
//    }
//
//    fun doStudy2(study : Study2) {
//        study.readBooks()
//        study.doHomework()
//    }
//
//    /**
//     * 数据类
//     */
//    fun onTest9(v : View) {
//        val cellphone1 = Cellphone("Samsung", 1299.99)
//        val cellphone2 = Cellphone("Samsung", 1299.99)
//        println(cellphone1)
//        println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))
//    }
//
//    /**
//     * 单例类
//     */
//    fun onTest10(v : View) {
//        Singleton.singletonTest()
//    }


}