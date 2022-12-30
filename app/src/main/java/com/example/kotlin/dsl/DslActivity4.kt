package com.example.kotlin.dsl

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin DSL简单例子泛型实现
 */
class DslActivity4 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin DSL简单例子泛型实现"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        val r :Unit = layout {
            // this == Int == Int 都增加 button  text 的 扩展函数

            // 下面的代码，为什么可以点出来， Unit也能点
            button {  }.text {  }.button {  }
            text {  }.button {  }.text {  }

        }.button {  }.text {  }.button {  }

        // Unit也能点
        r.button {  }
        r.text {  }
    }

    fun <T> T.button(action: () -> Unit) : Unit { }
    fun <T> T.text(action: () -> Unit) : Unit { }

    // 给 （任何类型，所有的类型），都增加 button  text 的 扩展函数
    // fun layout(action: Any?.() -> Unit) : Unit { }
    // fun layout(action: Double.() -> Unit) : Unit { }
    fun layout(action: Int.() -> Unit) : Unit { } // Unit （button  text）

}



