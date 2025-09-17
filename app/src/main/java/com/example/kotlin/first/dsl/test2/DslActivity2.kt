package com.example.kotlin.first.dsl.test2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Html 标签
 */
class DslActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_dsl2)

    }

    fun onTest(v: View) {
        val html = table {
            tr {
                td { "Apple" }
                td { "Grape" }
                td { "Orange" }
            }
            tr {
                td { "Pear" }
                td { "Banana" }
                td { "Watermelon" }
            }
        }
        println(html)
    }
}