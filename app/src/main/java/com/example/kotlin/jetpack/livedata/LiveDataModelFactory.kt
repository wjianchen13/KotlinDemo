package com.example.kotlin.jetpack.livedata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LiveDataModelFactory(private val countReserved: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LiveDataViewModel(countReserved) as T
    }
}