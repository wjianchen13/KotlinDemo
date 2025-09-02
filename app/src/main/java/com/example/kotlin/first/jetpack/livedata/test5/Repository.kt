package com.example.kotlin.first.jetpack.livedata.test5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object Repository {

    fun getUser(userId: String): LiveData<User5> {
        val liveData = MutableLiveData<User5>()
        liveData.value = User5(userId, userId, 0)
        return liveData
    }

}