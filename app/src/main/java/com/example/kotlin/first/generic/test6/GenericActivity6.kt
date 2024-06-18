package com.example.kotlin.first.generic.test6

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 泛型协变
 */
class GenericActivity6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic6)
    }

    fun handleSimpleData(data: SimpleData<Person>) {
        val teacher = Teacher("Jack", 35)
        data.set(teacher)
    }

    /**
     * 泛型 不合法
     */
    fun onTest1(v : View) {
//        val student = Student("Tom", 19)
//        val data = SimpleData<Student>()
//        data.set(student)
//        handleSimpleData(data) // 实际上这行代码会报错，这里假设它能编译通过
//        val studentData = data.get()
    }

    fun handleMyData(data: SimpleData1<Person>) {
        val personData = data.get()
    }

    /**
     * 泛型实化 应用
     */
    fun onTest2(v : View) {
        val student = Student("Tom", 19)
        val data = SimpleData1<Student>(student)
        handleMyData(data)
        val studentData = data.get()
    }

    /**
     * 泛型实化 应用
     */
    fun onTest3(v : View) {

    }

}