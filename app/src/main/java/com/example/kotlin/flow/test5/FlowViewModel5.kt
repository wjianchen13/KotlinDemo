package com.example.kotlin.flow.test5

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import java.util.Timer
import java.util.TimerTask

class FlowViewModel5 : ViewModel() {

    private val _stateFlow = MutableStateFlow(0)

    val stateFlow = _stateFlow.asStateFlow()

    fun startTimer() {
        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                _stateFlow.value += 1
            }
        }, 0, 1000)
    }
}
