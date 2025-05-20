package com.example.kotlin.first.jetpack.livedata.test2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class LiveDataViewModel2(countReserved: Int) : ViewModel() {

//    //    永远只暴露不可变的LiveData给外界
//    private val userLiveData : LiveData<User2>
//        get() = _userLiveData
//
//    private val _userLiveData =  MutableLiveData<User2>()
//
//    val userName: LiveData<String> = userLiveData.map {
//            user-> "${user.firstName} ${user.lastName}"
//    }

    private val userLiveData =  MutableLiveData<User3>()

    val userName: LiveData<String> = userLiveData.map {
            user-> "${user.firstName} ${user.lastName}"
    }

    fun change() {
        var u = User3("test1", "test2", 18)
        user.postValue(u)
    }
}