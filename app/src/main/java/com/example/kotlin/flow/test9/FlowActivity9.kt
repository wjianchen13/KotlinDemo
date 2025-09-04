package com.example.kotlin.flow.test9

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.kotlin.R
import kotlinx.coroutines.launch

/**
 * SharedFlow
 */
class FlowActivity9 : AppCompatActivity() {

    private val mainViewModel by viewModels<FlowViewModel9>()

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow9)
        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            mainViewModel.startLogin()
        }
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                mainViewModel.loginFlow.collect {
                    if (it.isNotBlank()) {
                        Toast.makeText(this@FlowActivity9, it, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

}






