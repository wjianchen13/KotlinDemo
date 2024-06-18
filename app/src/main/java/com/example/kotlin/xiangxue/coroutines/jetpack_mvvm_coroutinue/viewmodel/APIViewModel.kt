package com.derry.kt_coroutines.use2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.derry.kt_coroutines.use2.entity.LoginRegisterResponse2
import com.derry.kt_coroutines.use2.entity.LoginRegisterResponseWrapper2
import com.derry.kt_coroutines.use2.repository.APIRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// 职责：只做一件事情，管理所有的LiveData数据的状态的稳定性
class APIViewModel : ViewModel() {

    var userLiveData = MutableLiveData<LoginRegisterResponseWrapper2<LoginRegisterResponse2>>()

    fun requestLogin(userName:String, userPwd: String) {
        // GlobalScope 全局作用域 默认是异步线程
        // viewModelScope.launch 默认是主线程，所以写不写Dispatchers.Main，都是主线程
        viewModelScope.launch/*(Dispatchers.Main)*/ {
            // 左边的是：主线程                    右边：异步线程
            userLiveData.value      =           APIRepository().reqeustLogin(userName, userPwd)
            // handler{放心更新UI}                开启线程池 执行 { reqeustLogin }
        }
    }
}