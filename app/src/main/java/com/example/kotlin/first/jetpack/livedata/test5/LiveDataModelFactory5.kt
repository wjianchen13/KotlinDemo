package com.example.kotlin.first.jetpack.livedata.test5

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LiveDataModelFactory5(private val countReserved: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LiveDataViewModel5(countReserved) as T
    }
}