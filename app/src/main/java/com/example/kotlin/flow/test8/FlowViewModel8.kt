package com.example.kotlin.flow.test8

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FlowViewModel8 : ViewModel() {

    private val _loginFlow = MutableStateFlow("")

    val loginFlow = _loginFlow.asStateFlow()

    fun startLogin() {
        // Handle login logic here.
        _loginFlow.value = "Login Success"
    }

}

