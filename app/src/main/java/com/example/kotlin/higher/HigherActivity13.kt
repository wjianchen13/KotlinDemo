package com.example.kotlin.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 实现apply方法
 */
class HigherActivity13 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 实现apply方法"
    }

    /**
     * 测试1
     */
    fun onDelegateBase(v : View) {
        // TODO 我们自己写的
        "Derry".mApply {
            ""
            true
            9
            println(this)
        }.mApply {  }.mApply {  }.mApply {  }

        val r1s : String  = "Derry".mApply {

        }.mApply {

        }.mApply {

        }

        val r2s: Int = 123.mApply {

        }

        val r3: Boolean = true.mApply {

        }.mApply {

        }
    }

    private inline fun <I> I.mApply(lambda: I.() -> Unit) : I {
        // lambda(this) // 他的真身
        lambda() // 调用lambda  // this可以省略的

        return this // this == I == 调用者本身
    }

}

