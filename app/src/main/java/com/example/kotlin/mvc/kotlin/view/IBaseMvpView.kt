package com.example.kotlin.mvc.kotlin.view

import android.content.Context

interface IBaseMvpView {
    fun getContext() : Context

    fun showToast(str: String?)
}