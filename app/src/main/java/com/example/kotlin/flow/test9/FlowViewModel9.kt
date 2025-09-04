package com.example.kotlin.flow.test9

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class FlowViewModel9 : ViewModel() {

    private val _loginFlow = MutableSharedFlow<String>()

    val loginFlow = _loginFlow.asSharedFlow()

    fun startLogin() {
        // Handle login logic here.
        viewModelScope.launch {
            _loginFlow.emit("Login Success")
        }
    }

}


