package com.example.kotlin.mvc.kotlin2.view

import android.content.Context

interface IBaseMvpView {
    fun getContext() : Context

    fun showToast(str: String?)
}