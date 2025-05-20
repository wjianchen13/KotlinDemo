package com.example.kotlin.first.jetpack.livedata.test1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel(countReserved: Int) : ViewModel() {

    var user = MutableLiveData<User>()

    val counter = MutableLiveData<Int>()
    init {
        counter.value = countReserved
    }
    fun plusOne() {
        val count = counter.value ?: 0
        counter.value = count + 1
    }
    fun clear() {
        counter.value = 0
    }

    fun change() {
        var u = User("hello", 18)
        user.postValue(u)
    }
}