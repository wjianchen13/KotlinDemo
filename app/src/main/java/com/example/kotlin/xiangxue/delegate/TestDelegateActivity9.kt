package com.example.kotlin.xiangxue.delegate

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * 控件委托
 */
class TestDelegateActivity9 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_9)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 控件委托"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        // 对控件自定义委托（DataBinding）

        var textView : TextView = findViewById(R.id.tv_title)

        var message : String? by textView

        textView.text = "Derry修改了布局"

        println("message:$message") // 布局 --> 数据message 一向

        message = "数据发送改变"

        println("textView:${textView.text}") // 数据 --> 布局 一向    = 双向绑定
    }

    // 自定义委托，提供者委托，可以更加直接的写法
    operator fun TextView.provideDelegate(value : Any?, property: KProperty<*>) =
        object: ReadWriteProperty<Any?, String?> {
            override fun getValue(thisRef: Any?, property: KProperty<*>): String? = text as String?

            override fun setValue(thisRef: Any?, property: KProperty<*>, value: String?) {
                text = value
            }
        }
    
}



