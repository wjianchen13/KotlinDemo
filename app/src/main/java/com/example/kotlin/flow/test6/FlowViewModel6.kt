package com.example.kotlin.flow.test6

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import java.util.Timer
import java.util.TimerTask

class FlowViewModel6 : ViewModel() {

    private val timeFlow = flow {
        var time = 0
        while (true) {
            emit(time)
            delay(1000)
            time++
        }
    }

    val stateFlow =
        timeFlow.stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            0
        )

}
