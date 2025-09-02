package com.example.kotlin.first.jetpack.livedata.test4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class LiveDataViewModel4(countReserved: Int) : ViewModel() {

    //    永远只暴露不可变的LiveData给外界
    private val userLiveData : LiveData<User4>
        get() = _userLiveData

    private val _userLiveData =  MutableLiveData<User4>()

    val userName: LiveData<String> = userLiveData.map {
            user-> "${user.firstName} ${user.lastName}"
    }

    fun change() {
        var u = User4("test1", "test2", 18)
        _userLiveData.postValue(u)
    }
}