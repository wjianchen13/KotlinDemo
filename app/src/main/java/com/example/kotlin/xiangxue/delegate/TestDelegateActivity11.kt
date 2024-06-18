package com.example.kotlin.xiangxue.delegate

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlin.reflect.KProperty
import kotlin.reflect.jvm.javaField

/**
 * 属性委托，反射修改
 */
class TestDelegateActivity11 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_9)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 属性委托，反射修改"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        val item = Item()
        println(item.version222)

        println("item.version222:${item.version222}  item.version111:${item.version111}")
        item.version222 = "TTTTTT"
        println("item.version222:${item.version222}  item.version111:${item.version111}")
    }



    class Item {
        var version111 : String = "Version1 data"
        var version222 : String by version111
    }
    
}

private operator fun String.setValue(item: TestDelegateActivity11.Item, property: KProperty<*>, value : String) {
    // this = value

    println(property) // var com.derry.lib_delegate.simple4.Item.version222: kotlin.String【能够动态得到，所以可以反射】

    // Kotlin的反射才能做到了【反射：修改 version222变量的值 为 value】
    property.javaField?.isAccessible = true
    property.javaField?.set(item, value)

    // 只能修改 version222变量的值，   不能修改 version111变量的值
}

// getValue最容易的
private operator fun String.getValue(item: TestDelegateActivity11.Item, property: KProperty<*>)
        = this + "自定义getValue" // == String本身 == "Version1 data"

