package com.example.kotlin.first.jetpack.livedata.test1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LiveDataModelFactory1(private val countReserved: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LiveDataViewModel1(countReserved) as T
    }
}