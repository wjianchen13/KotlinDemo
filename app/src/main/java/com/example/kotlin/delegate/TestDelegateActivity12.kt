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
 * 监听新旧值
 */
class TestDelegateActivity12 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 监听新旧值"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        val simple1 = Simple1()
        simple1.name = "Update1"
        simple1.name = "Update2"
    }
    
}

// TODO 同学们注意，新增点（观察 新值 旧值）
class Simple1 {
    var name: String by Delegates.observable("Test") {
            prop, old, new ->
        println("旧值：$old -> 新值：$new")
    }
}


