package com.example.kotlin.delegate

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import kotlin.reflect.jvm.javaField

/**
 * 观察setValue getValue
 */
class TestDelegateActivity13 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 观察setValue getValue"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        val item = Item()
        item.info = "Derry"
        println(item.info)
    }
    
}

// TODO 同学们注意，新增点（观察  setValue 与 getValue）
class Item {
    var info: String by object : ReadWriteProperty<Item, String> {
        override fun getValue(thisRef: Item, property: KProperty<*>): String {
            println("监听到，你在获取值")
            return ""
        }

        override fun setValue(thisRef: Item, property: KProperty<*>, value: String) {
            println("监听到，你在设置值 value:$value")
        }
    }
}




