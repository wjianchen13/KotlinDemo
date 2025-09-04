package com.example.kotlin.flow.test5

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
 * StateFlow的基本用法
 */
class FlowActivity5 : AppCompatActivity() {

    private val mainViewModel by viewModels<FlowViewModel5>()

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow5)
        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            mainViewModel.startTimer()
        }
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                mainViewModel.stateFlow.collect {
                    textView.text = it.toString()
                }
            }
        }
    }
}





