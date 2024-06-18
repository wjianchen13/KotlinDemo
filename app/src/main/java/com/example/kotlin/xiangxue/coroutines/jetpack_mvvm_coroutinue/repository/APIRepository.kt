package com.derry.kt_coroutines.use2.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.derry.kt_coroutines.use2.api.APIClient
import com.derry.kt_coroutines.use2.api.WanAndroidAPI
import com.derry.kt_coroutines.use2.entity.LoginRegisterResponse2
import com.derry.kt_coroutines.use2.entity.LoginRegisterResponseWrapper2

// 职责：负责数据的提供，暴露数据
class APIRepository {

    suspend fun reqeustLogin(username: String, userpwd: String)
        : LoginRegisterResponseWrapper2<LoginRegisterResponse2> {

        if (username.isEmpty() || userpwd.isEmpty()) {
            Log.d("Derry", "username.isEmpty() || userpwd.isEmpty()")
        }
        // TODO 可以做很多校验工作的，......
        // TODO ...

        return APIClient.instance.instanceRetrofit(WanAndroidAPI::class.java)
            .loginActionCoroutine(username, userpwd)
    }

}