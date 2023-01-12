package com.example.kotlin.generic

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 反射
 */
class GenericActivity8 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 反射"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {

    }

    /** 注解构造函数所运行的参数类型
     *
     *  与Java原生类型所对应的类型（例如： String, Int, Long 等等）
     *  classes (DerryClass::class)
     *  枚举：enums
     *  其他的注解
     *  上面所有类型的数据类型
     */
// Kotlin的注解参数是不允许为可空类型的，因为JVM是不支持null存储注解值的
// 如果某个注解被作用其他的注解参数，那么就不需要@字符来定义

    annotation class Annotation2(val name : String) // 注解有构造的含义，你可以传入参数给注解

    @Annotation2("Derry")
    class Teacher

    annotation class Annotation3(val str : String, val myAnnotation : Annotation2)

    @Annotation3("DDD", Annotation2("Zhangsan"))
    class Student

    // TODO 注解也可以有自己的构造方法， 并且构造方法可以接收参数
    fun main() {}

// KT的反射，几乎目前不用，直接用KT的语法，调用Java的反射来玩
// KT的反射，我个人认为，还不是很成熟，还不适合使用
// Kotlin的反射：
// 1.第一次加载 比 Java慢， 第二次 第二N此，才勉强达到Java反射性能
// 2.而外导入Kotlin反射包， xxxMB
// 3.学习成本高，全新一套内容

}



