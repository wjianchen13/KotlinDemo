package com.example.kotlin.normal.generic.test7

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 泛型逆变
 */
class GenericActivity7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic7)
    }

    private fun handleTransformer(trans: Transformer<Student>) {
        val student = Student("Tom", 19)
        val result = trans.transform(student)
    }

    /**
     * 泛型逆变 问题引出
     */
    fun onTest1(v : View) {
//        val trans = object : Transformer<Person> {
//            override fun transform(t: Person): String {
//                return "${t.name} ${t.age}"
//            }
//        }
//        handleTransformer(trans) // 这行代码会报错
    }

    /**
     * 泛型逆变 测试
     */
    fun onTest2(v : View) {
        val trans = object : Transformer1<Person> {
            override fun transform(t: Person): String {
                return "${t.name} ${t.age}"
            }
        }
        var str = handleTransformer1(trans)
        println("===========> str: $str")
    }

    // ? super T
    private fun handleTransformer1(trans: Transformer1<Student>) : String{
        val student = Student("Tom", 19)
        val result = trans.transform(student)
        return result
    }

    /**
     * 泛型逆变 原因
     * 为什么逆变的时候泛型T不能出现在out 位置上
     */
    fun onTest3(v : View) {
        val trans = object : Transformer2<Person> {
            override fun transform(name: String, age: Int): Person {
                return Teacher(name, age)
            }
        }
        handleTransformer2(trans)
    }

    private fun handleTransformer2(trans: Transformer2<Student>) {
        val result = trans.transform("Tom", 19)
    }

}