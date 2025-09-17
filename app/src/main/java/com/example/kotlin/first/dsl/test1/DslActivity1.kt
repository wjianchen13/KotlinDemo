package com.example.kotlin.first.dsl.test1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * 模拟dependencies
 */
class DslActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_dsl1)

    }

    fun onTest(v: View) {
        Dependency().test()
    }


}