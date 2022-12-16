package com.example.kotlin.delegate

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Kotlin 自定义委托
 */
class TestDelegateActivity6 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 自定义委托"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        val o = Owner()
        o.text = "DERRY"
        println(o.text)

        o.text2 = "AAAA"
        println(o.text2)
    }
    
}

class Owner {

    // var （自定义委托中，必须有 set get）
    // String （自定义委托中，get返回String，set传入String）
    // get/set方法 第一个参数 必须包含 本类Owner或Owner父类
    var text: String by Simple07()

    var text2 : String by StringDelegate()
}

class Simple07 {

    private var str: String = "Default"

    operator fun getValue(owner: Owner, property: KProperty<*>) : String {
        println("getValue执行啦")
        return str
    }

    operator fun setValue(owner: Owner, property: KProperty<*>, value : String) {
        println("setValue执行啦")
        str = value
    }
}

class StringDelegate() : ReadWriteProperty<Owner, String> {

    private var str: String = "Default"

    override fun getValue(thisRef: Owner, property: KProperty<*>): String {
        println("ReadWriteProperty getValue执行啦")
        return str
    }

    override fun setValue(thisRef: Owner, property: KProperty<*>, value: String) {
        println("ReadWriteProperty setValue执行啦")
        str = value
    }

}


