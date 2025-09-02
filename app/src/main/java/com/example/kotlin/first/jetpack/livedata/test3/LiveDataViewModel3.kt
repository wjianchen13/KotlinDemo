package com.example.kotlin.first.jetpack.livedata.test3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class LiveDataViewModel3(countReserved: Int) : ViewModel() {

    private val userLiveData =  MutableLiveData<User3>()

    val userName: LiveData<String> = userLiveData.map {
            user-> "${user.firstName} ${user.lastName}"
    }

    fun change() {
        var u = User3("test1", "test2", 18)
        userLiveData.postValue(u)
    }
}