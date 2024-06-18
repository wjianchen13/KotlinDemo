package com.example.kotlin.xiangxue.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 高阶函数总结
 */
class HigherActivity17 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 高阶函数总结"
    }

    /**
     * 测试1
     */
    fun onDelegateBase(v : View) {
        println(study01()("Derry", 99))

        study02()  ({n1, n2 ->
            "两数相加结果:${n1 + n2}"
        }, "李元霸")

        study04() ("张三丰", 88, {
            println("第一个lambda的参数是:$it")
        }) {
            println("第二个lambda的参数是:$it")
        }

        println()

        // 第一组： 输入为String， 输出为Int    // 第二组： 输入为Int， 输出为String     RxJava map 变换操作符
        study05<String, Int, Int, String>() ("王五", 99, {
            // 变换操作：把String变换成Int
            "值OK:$it".length
        }) {
            // 变换操作：把Int变换成String
            "第二个lambda是:$it"
        }
    }

    // study01函数返回是什么类型？ (String, Int) -> String
    fun study01() : (String, Int) -> String = {name: String, age:Int ->
        true
        name
        age
        "我的姓名是:$name, 我的年龄是:$age" // 最后一行作为返回值 String
    }

    // 函数返回函数，这个函数其实就是高阶函数
    // study02函数返回是什么类型？ ((Int, Int) -> String, String) -> Unit
    fun  study02() : ((Int, Int) -> String, String) -> Unit = { lambdaAction: (Int, Int) -> String, studyInfo: String ->
        false
        '男'
        val lambdaAction = lambdaAction(10, 20)
        println("最后我组装的值是:$lambdaAction + $studyInfo") // 最后一行作为返回值 Unit
    }

    // study033函数返回是什么类型？ (String, Int) -> Boolean
    fun study033() : (String, Int) -> Boolean = {str: String, num: Int ->
        true // 最后一行作为返回值，因为属于lambda范畴
    }

    // study04函数返回是什么类型？ (String, Int, (String) -> Unit, (Int) -> Unit) -> Unit
    fun study04() : (String, Int, (String) -> Unit, (Int) -> Unit) -> Unit = {str: String, num:Int, lambda1: (String) -> Unit, lambda2: (Int) -> Unit ->
        lambda1(str)
        lambda2(num)
    }

    // study05函数返回是什么类型？(T1, T2, (T1) -> R1, (T2) -> R2) -> Unit
    fun <T1, T2, R1, R2> study05() : (T1, T2, (T1) -> R1, (T2) -> R2) -> Unit = {str: T1, num: T2, lambda1 : (T1) -> R1, lambda2 : (T2) -> R2 ->
        println("第一个lambda:${lambda1(str)} ${if (lambda1(str) is Int ) "你变换后是Int 值:${lambda1(str)}" else "你变换后不是Int"}")
        println("第一个lambda:${lambda2(num)}")
    }

    // study06函数返回是什么类型？ (String, Int, (Int) -> Unit) -> Boolean
    fun study06() : (String, Int, (Int) -> Unit ) -> Boolean  = fun(str: String, num: Int, lambda : (Int) -> Unit) : Boolean {
        str
        num
        return true // fun{} 此{} 是函数体，不是我们前面学习的那种lambda体， fun {} 是函数本身，不会以 最后一行变化二变化， 必须明确指定类型，否则默认就是 Unit
    }

    // study06s函数返回是什么类型？ (String, Int, (Int) -> Int) -> Int
    fun study06s() = { str: String, num: Int, lambda:(Int) -> Int -> // -> 等价于理解 fun   fun【1.明确指定类型替换默认隐式Unit，2.return 99】
        str
        num
        99 // 最后一行作为返回值，因为属于lambda范畴
    }


}

