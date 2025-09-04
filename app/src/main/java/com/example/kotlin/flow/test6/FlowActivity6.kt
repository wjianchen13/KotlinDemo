package com.example.kotlin.flow.test6

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.kotlin.R
import kotlinx.coroutines.launch

/**
 * StateFlow的高级用法
 */
class FlowActivity6 : AppCompatActivity() {

    private val mainViewModel by viewModels<FlowViewModel6>()

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow6)
        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button)
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                mainViewModel.stateFlow.collect { time ->
                    textView.text = time.toString()
                }
            }
        }
    }

}





