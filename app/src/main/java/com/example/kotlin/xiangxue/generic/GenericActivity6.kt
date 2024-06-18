package com.example.kotlin.xiangxue.generic

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 泛型限定
 */
class GenericActivity6 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 泛型限定"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        // myInvoke1(Any()) // 报错，操作限定的范围
        myInvoke1(Person())
        myInvoke1(Teacher())
        myInvoke1(Student())
        // myInvoke1(Dog()) // 报错，操作限定的范围

        println()

        myInvoke2(Dog()::show1)

        println()

        myInvoke3(Dog()::show2)

        println()

        // 错误：他需要 Function1<String, Unit>   但是 你给他传了 Function<Unit>  对不上标   (产生了二义性)
        /*myInvoke4(Dog()::show1) // 报错：无法确定到底是那个函数， 编译器不够智能
        myInvoke4(Dog()::show2) // 报错：无法确定到底是那个函数， 编译器不够智能*/
    }

    open class Person {
        override fun toString(): String {
            return "Person ..."
        }
    }

    class Student : Person() {
        override fun toString(): String {
            return "Student..."
        }
    }

    class Teacher : Person() {
        override fun toString(): String {
            return "Teacher..."
        }
    }

    // Dog不参与任何继承关系，他是其他类
    class Dog {
        fun show1() = println("Dog show1 run ...") // () -> Unit
        fun show2(str: String) = println("show2 run str:$str") // (String) -> Unit
    }

    // 非常强大的invoke  只能是 Person 与 Person的子类
    fun <T : /*extends*/ Person> myInvoke1(item: T) = println(item)
    fun <T : () -> Unit> myInvoke2(item: T) = item.invoke()
    fun <T : (String) -> Unit> myInvoke3(item: T) = item.invoke("Derry Successful")
    fun <T> myInvoke4(item: T) where T :() -> Unit, T:(String) -> Unit = {item.invoke() ; item.invoke("D") }



}



