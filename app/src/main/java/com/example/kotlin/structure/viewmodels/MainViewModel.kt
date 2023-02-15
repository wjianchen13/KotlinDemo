package com.example.kotlin.structure.viewmodels;

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin.structure.beans.EventData

class MainViewModel : ViewModel() {

    var data = MutableLiveData<EventData>()

    var mViewModels = mutableListOf<BaseViewModel>()

    var counter = 0

    init {
        mViewModels.add(ViewModel1())
        mViewModels.add(ViewModel2())
    }

    fun changeData1() {
        data.value = EventData("aaa", 18)
    }

    override fun onCleared() {
        super.onCleared()
        for(i in mViewModels?.indices) {
            mViewModels[i]?.onClear()
        }
    }
}