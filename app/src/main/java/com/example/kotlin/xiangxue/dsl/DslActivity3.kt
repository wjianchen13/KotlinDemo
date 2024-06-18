package com.example.kotlin.xiangxue.dsl

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin DSL简单例子泛型实现
 */
class DslActivity3 : AppCompatActivity() {

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
        // 1.{ 持有this ==  泛型T （button， text） }  难题(T 持有到 button， text) ？ 攻克了难题
        val r: String ? = layout<String> {
            // 3.由于你增加了一个泛型具体类型 String     给String增加了  两个函数  button  text
            this.button {  }
            this.button {  }
            // 省略this的写法
            button {}
            text {}
        }

        r.button {  }
        r.text {  }

        // TODO ==============

        layout<Double> {
            // this == Double == Double  给Double增加了  两个函数  button  text
            this.button {  }
            this.text {  }
        }
    }

    fun<T> T.button(action: () -> Unit) { }
    fun <T> T.text(action: () -> Unit) { }
    // 2.此时 T 就已经 被扩展出来 两个函数  button  text，意味着 这个T泛型 里面有 button text
    fun<T> layout(action: T.() -> Unit) : T ? { return null}

}



