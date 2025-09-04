package com.example.kotlin.flow.test7

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
 * StateFlow的粘性特性
 */
class FlowActivity7 : AppCompatActivity() {

    private val mainViewModel by viewModels<FlowViewModel7>()

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow7)
        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            mainViewModel.increaseClickCount()
        }
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                mainViewModel.clickCountFlow.collect { time ->
                    textView.text = time.toString()
                }
            }
        }
    }

}







