package com.example.kotlin.xiangxue.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 高阶函数和扩展函数
 */
class HigherActivity4 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_higher4)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 高阶函数和扩展函数"
    }

    /**************************************************************************************************
     * 给泛型增加匿名扩展函数
     **************************************************************************************************/
    fun commonOK() = /*println("我是通用函数")*/ 88

    /**
     * 给泛型增加匿名扩展函数 测试
     */
    fun onTest1(v : View) {
        nameS.myRunOK {
            true
        }
        ageS.myRunOK {
            false
        }
        commonOK().myRunOK {
            true
        }

        val r : Unit = commonOK().myRunOK {
            println(this)
            println(it)
            true
        }
        println(r)

        "Derry".myRunOK {
            // this == T本身 == 调用者本身 ==  "Derry"
            println("我是:$this")
            false
        }
    }

    companion object {
        const val nameS : String = "Derry"
        const val ageS : Int = 99
    }

    /**************************************************************************************************
     * 给泛型增加具名扩展函数
     **************************************************************************************************/
    /**
     * 给泛型增加具名扩展函数 测试
     */
    fun onTest2(v : View) {
        777.abc() // abc我是:777
        commonOK().abc() // abc我是:88
        436.564f.abc() // abc我是:436.564
        "sfdasf".abc() // abc我是:sfdasf
    }

    /**************************************************************************************************
     * 泛型拓展函数，lamda表示式参数
     **************************************************************************************************/
    /**
     * 泛型拓展函数，lamda表示式参数 测试
     */
    fun onTest3(v : View) {
        "AAAA".derry {

        }
    }

    /**************************************************************************************************
     * 泛型拓展函数，lamda表示式有参数
     **************************************************************************************************/
    /**
     * 泛型拓展函数，lamda表示式有参数 测试
     */
    fun onTest4(v : View) {
        "AAAA".derry2 {
            // it == Double == 547546.56
            println("derry2 it: $it")
        }
    }

    /**************************************************************************************************
     * 泛型拓展函数，lamda表示式匿名拓展String函数参数
     **************************************************************************************************/
    /**
     * 泛型拓展函数，lamda表示式匿名拓展String函数参数 测试
     */
    fun onTest5(v : View) {
        "AAAA".derry3 {
            // 匿名函数扩展  { 持有this == String == "李元霸" }
            /*this == "李元霸"
            it == 547546.56*/
        }
    }

    /**************************************************************************************************
     * 泛型拓展函数，lamda表示式匿名拓展泛型T函数参数
     **************************************************************************************************/
    /**
     * 泛型拓展函数，lamda表示式匿名拓展泛型T函数参数 测试
     */
    fun onTest6(v : View) {
        123.derry4 {
            // this == 123本身
            println("derry4 我是 :$this")
        }
    }

    /**************************************************************************************************
     * 泛型拓展函数，lamda表示式，添加T参数
     **************************************************************************************************/
    /**
     * 泛型拓展函数，lamda表示式，添加T参数 测试
     */
    fun onTest7(v : View) {
        456.derry5 {
            // it == 456本身
            println("derry5 我是 :$it")
        }
    }

}

/**************************************************************************************************
 * 给泛型增加匿名扩展函数
 **************************************************************************************************/
// 给泛型增加匿名扩展函数  【我对T扩展，T本身就等于==this】
// 我对T扩展，T本身就等于==this
fun <T> T.myRunOK(mm: T.(Float) -> Boolean) {
    // this == T本身 == 调用者本身 ==  "Derry"

    mm(346.56f) // 调用Lambda
}

/**************************************************************************************************
 * 给泛型增加具名扩展函数
 **************************************************************************************************/
// 增加时候的反编译类型是public static，该函数全局可以访问
// 给泛型增加 具名abc扩展函数 【我对T扩展，T本身就等于==this】
fun <T> T.abc() {
    // this == T本身 == 调用者本身 ==  "Derry"
    println("abc我是:$this")
}

/**************************************************************************************************
 * 泛型拓展函数，lamda表示式参数
 **************************************************************************************************/
// 循序渐进
fun <T> T.derry(mm: () -> Unit) {
    mm()
}

/**************************************************************************************************
 * 泛型拓展函数，lamda表示式有参数
 **************************************************************************************************/
fun <T> T.derry2(mm: (Double) -> Unit) {
    mm(547546.56)
}

/**************************************************************************************************
 * 泛型拓展函数，lamda表示式匿名拓展String函数参数
 **************************************************************************************************/
// 匿名函数扩展  { 持有this == String == "李元霸" }
fun <T> T.derry3(mm: String.(Double) -> Unit) {
    "李元霸".mm(547546.56)
}

/**************************************************************************************************
 * 泛型拓展函数，lamda表示式匿名拓展泛型T函数参数
 **************************************************************************************************/
fun <T> T.derry4(mm: T.(Double) -> Unit) {
    // this == T本身 == this 123/A

    // this.mm(547546.56) // 这个才是他的真身
    mm(547546.56)
}

/**************************************************************************************************
 * 泛型拓展函数，lamda表示式，添加T参数
 **************************************************************************************************/
fun <T> T.derry5(mm: (T) -> Unit) {
    // this == T本身 == this 调用者
    mm(this)
}

fun <T> T.run1(mm : T.() -> Unit) = this.mm()
fun <T> T.run2(mm : (T) -> Unit) = mm(this)