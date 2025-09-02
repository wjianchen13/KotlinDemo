package com.example.kotlin.first.jetpack.livedata.test5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap

class LiveDataViewModel5(countReserved: Int) : ViewModel() {

    private val userIdLiveData = MutableLiveData<String>()

    val user: LiveData<User5> = userIdLiveData.switchMap{ userId ->
        Repository.getUser(userId)
    }

    fun getUser(userId: String) {
        userIdLiveData.value = userId
    }

}

