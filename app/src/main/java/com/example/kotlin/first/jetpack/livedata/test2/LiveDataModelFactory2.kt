package com.example.kotlin.first.jetpack.livedata.test2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LiveDataModelFactory2(private val countReserved: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LiveDataViewModel2(countReserved) as T
    }
}