package com.example.kotlin.higher

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 自定义forEach循环
 */
class HigherActivity15 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 自定义forEach循环"
    }

    /**
     * 测试1
     */
    fun onDelegateBase(v : View) {
        // TODO 官方的
        listOf("AAA", "BBB", "CCC")
            .forEach {
                println(it)
                true // 无返回
            }

        println()

        // TODO 我们的
        listOf("AAA", "BBB", "CCC")
            .mForEach {
                println(it)
                true // 无返回
            }

        println()

        listOf("AAA", "BBB", "CCC")
            .mForEach2 {
                println(it)
                true // 无返回
            }

        println()

        listOf(111, 222, 333)
            .mForEach3 {
                println(this)
                true // 无返回
            }

        println()

        listOf(555, 666, 777)
            .mForEach4 {
                println(this)
                true // 无返回
            }

    }

    // Set List Map .... 父类 Iterable<E>
    private inline fun<E> Iterable<E>.mForEach(lambda: (E) -> Unit) {
        // this == Iterable<E> == 调用者本身 List Set Map
        for(item: E in this) lambda(item)
    }

    // run 就是执行你的逻辑  run{你的逻辑}
    private inline fun<T> Iterable<T>.mForEach2(lambda: (T) -> Unit) = run { for(item in this) lambda(item) }

    private inline fun<T> Iterable<T>.mForEach3(lambda: T.() -> Unit) = run { for(item in this) lambda(item) }

    private inline fun<T> Iterable<T>.mForEach4(lambda: T.() -> Unit) = r { for(item in this) lambda(item) }

    private inline fun<T> Iterable<T>.mForEach5(lambda: T.() -> Unit) =
        r { for(item in this) lambda(item) }

    private inline fun <R> r(lambda : () -> R) = lambda()

}

