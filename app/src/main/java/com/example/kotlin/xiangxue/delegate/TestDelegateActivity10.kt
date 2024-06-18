package com.example.kotlin.xiangxue.delegate

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlin.reflect.KProperty

/**
 * 属性委托
 */
class TestDelegateActivity10 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_9)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 属性委托"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        name2 = "三分归元气"

        println("name1:$name1")
        println("name2:$name2")

        println()

        userName = "AAA"
        println(userName)
    }

    private var userName : String by UserNameDelegate()

    class UserNameDelegate {
        private var realUserName = "真实姓名"
        operator fun getValue(thisRef : Any? , property : KProperty<*>) : String {
            println("委托了属性获取")
            return realUserName
        }

        operator fun setValue(thisRef : Any?, property : KProperty<*>, value : String) {
            println("委托了属性设置")
            realUserName = value
        }
    }

    var name1: String = "九阳神功"
    var name2: String by ::name1
}



