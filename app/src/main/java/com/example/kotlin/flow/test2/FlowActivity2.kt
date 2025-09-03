package com.example.kotlin.flow.test2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.kotlin.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * 计时器背压
 */
class FlowActivity2 : AppCompatActivity() {

    private val mainViewModel by viewModels<FlowViewModel2>()

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow2)
        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            lifecycleScope.launch {
                mainViewModel.timeFlow.collectLatest { time ->
                    textView.text = time.toString()
                    delay(3000)
                }
            }
        }
    }
}

