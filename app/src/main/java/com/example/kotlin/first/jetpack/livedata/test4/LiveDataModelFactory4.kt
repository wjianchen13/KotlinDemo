package com.example.kotlin.first.jetpack.livedata.test4

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LiveDataModelFactory4(private val countReserved: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LiveDataViewModel4(countReserved) as T
    }
}