package com.example.kotlin.xiangxue.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin inline内联
 */
class HigherActivity16 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin inline内联"
    }

    /**
     * 测试1
     */
    fun onDelegateBase(v : View) {
        // 不加inline的效果
        // show((Function0)null.INSTANCE);  对象开辟的浪费

        // 加inline的效果
        /*String var2 = "AAA";
        System.out.println(var2);*/

        show {
            println("AAA")
        }

        // 相当于 C++ 宏替换 文本替换  inline会做优化，不需要你开辟空间浪费
    }

    // 高阶函数，尽量加inline
    inline fun show(lambda: () -> Unit) {
        lambda()
    }

}

