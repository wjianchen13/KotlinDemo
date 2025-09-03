package com.example.kotlin.flow.test1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.kotlin.R
import kotlinx.coroutines.launch

/**
 * 计时器
 */
class FlowActivity1 : AppCompatActivity() {

    private val mainViewModel by viewModels<FlowViewModel1>()

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow1)
        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            lifecycleScope.launch {
                mainViewModel.timeFlow.collect { time ->
                    textView.text = time.toString()
                }
            }
        }
    }
}

