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
     * 类的简单定义
     */
    fun onTest1(v : View) {
        val p = Person()
        p.name = "Jack"
        p.age = 19
        p.eat()
    }

    /**
     * 类的继承
     */
    fun onTest2(v : View) {
        val p = Student1()
        p.name = "Jack"
        p.age = 19
        p.grade=2
        p.sno="1000"
        p.info()

    }

    /**
     * 类的构造函数
     */
    fun onTest3(v : View) {
        val p = Student2("1000", 3)
        p.name = "Jack"
        p.age = 19
        p.info()

    }

    /**
     * 主构造函数
     */
    fun onTest4(v : View) {
        val p = Student3("1000", 3, "hello", 20)
        p.info()
    }

    /**
     * 次构造函数
     */
    fun onTest5(v : View) {
        val p = Student4("1002", 3)
        p.info()
    }

    /**
     * 无主构造函数
     */
    fun onTest6(v : View) {
        val p = Student5("1002", 3)
        p.info()
    }

    /**
     * 接口
     */
    fun onTest7(v : View) {
        val p = Student6("1003", 3)
        doStudy(p)
    }

    fun doStudy(study : Study) {
        study.readBooks()
        study.doHomework()
    }

    /**
     * 接口默认实现
     */
    fun onTest8(v : View) {
        val p = Student7("1003", 3)
        doStudy2(p)
    }

    fun doStudy2(study : Study2) {
        study.readBooks()
        study.doHomework()
    }

    /**
     * 数据类
     */
    fun onTest9(v : View) {
        val cellphone1 = Cellphone("Samsung", 1299.99)
        val cellphone2 = Cellphone("Samsung", 1299.99)
        println(cellphone1)
        println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))
    }

    /**
     * 单例类
     */
    fun onTest10(v : View) {
        Singleton.singletonTest()
    }
}