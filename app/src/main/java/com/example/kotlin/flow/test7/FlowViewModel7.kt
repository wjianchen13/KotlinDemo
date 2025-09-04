package com.example.kotlin.flow.test7

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FlowViewModel7 : ViewModel() {

    private val _clickCountFlow = MutableStateFlow(0)

    val clickCountFlow = _clickCountFlow.asStateFlow()

    fun increaseClickCount() {
        _clickCountFlow.value += 1
    }

}
