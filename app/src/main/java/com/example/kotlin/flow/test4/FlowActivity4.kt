package com.example.kotlin.flow.test4

import android.os.Bundle
import android.util.Log
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
 * Flow的生命周期管理
 */
class FlowActivity4 : AppCompatActivity() {

    private val mainViewModel by viewModels<FlowViewModel4>()

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow4)
        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            lifecycleScope.launch {
//                lifecycleScope.launchWhenStarted {
                repeatOnLifecycle(Lifecycle.State.STARTED) {
                        mainViewModel.timeFlow.collect { time ->
                            textView.text = time.toString()
                            Log.d("FlowTest", "Update time $time in UI.")
                        }
                    }
                }
        }
    }
}



