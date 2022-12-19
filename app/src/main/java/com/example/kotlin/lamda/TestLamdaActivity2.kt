package com.example.kotlin.lamda

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 返回函数的函数
 */
class TestLamdaActivity2 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 返回函数的函数"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        // （int，int）->String这个应该是返回值类型声明吧
        // 考试：函数返回一个函数
        val fun4 = fun(n1aaa: Int, n2aaa: Int)  // fun4函数本身

                : (Int, Int) -> String // fun4函数的函数 以返回值返回了这个函数

                = {n1, n2 -> "两个数相加:${n1 + n2}  n1aaa:$n1aaa" } // fun4函数的函数 以返回值返回了这个函数 的 实现

        println(fun4(100, 100)(1000, 1000))

        // 考试：你掌握了，你的lambda基本上每一对手了
        val k01 : (String) -> (String) -> (Boolean) -> (Int) -> (String) -> Int =
            { it: String ->
                { it: String ->
                    { it: Boolean ->
                        { it: Int ->
                            { it: String ->
                                99
                            }
                        }
                    }
                }
            }
        println(k01("AAA")("BBB")(true)(888)("Derry"))
        
    }
    

}

