package com.example.kotlin.mvc.kotlin.base.view

import android.content.Context

/**
 * MVP公共接口
 */
interface IBaseMvpView {

    fun getContext(): Context?
    fun showToast(str: String?)

}