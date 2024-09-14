package com.example.kotlin.first.obj.obj12

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 类的构造函数
 * 如果一个类定义的无参主构造函数，那么次构造函数就不能定义成无参的了
 * 同一个参数类型的构造函数（例如都是无参），主构造函数和次构造函数只能定义一个
 * 当继承一个类时， 在第二构造函数调用了父类的构造函数，那继承类可以不实现主构造函数，并且继承的那个类也不需要写()
 */
class ObjActivity12 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obj12)
    }

    /**
     * 类的构造函数测试
     */
    fun onTest1(v : View) {
        val p = Student12("1000", 3)
        p.name = "Jack"
        p.age = 19
        p.info()
    }

    fun onTest2(v : View) {
        var p = Person12()
    }

}