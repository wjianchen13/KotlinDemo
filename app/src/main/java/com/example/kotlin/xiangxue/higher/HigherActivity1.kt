package com.example.kotlin.xiangxue.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 高阶函数测试
 */
class HigherActivity1 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 高阶函数测试1"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        var r : String = show01(99) { /*it: Int ->*/
            "Str it:$it"
        }
        println(r)

        // 三数相乘
        show02(1, 2, 3) { n1, n2, n3 ->
            println(n1 * n2 * n3)
        }

        // 三数相加
        show02(1, 2, 300) { n1, n2, n3 ->
            println(n1 + n2 + n3)
        }

        // 三数相除
        show02(100, 2, 2) { n1, n2, n3 ->
            println(n1 / n2 / n3)
        }
    }
    

}

// show01 返回的是什么类型？ String 因为Lambda是返回String
fun show01(number: Int, lambda : (Int) -> String) : String = lambda.invoke(number)

// 需求：三数相乘  三数相加 三数相除  由用户指定，我只定义规则（高阶函数）
fun show02(number1: Int, number2: Int, number3: Int, lambda: (Int, Int, Int) -> Unit) =
    lambda(number1, number2, number3) // 调用Lambda而已

