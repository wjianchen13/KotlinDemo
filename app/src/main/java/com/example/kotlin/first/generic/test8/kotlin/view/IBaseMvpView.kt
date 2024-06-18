package com.example.kotlin.first.generic.test8.kotlin.view

import android.content.Context

interface IBaseMvpView {
    fun getContext() : Context

    fun showToast(str: String?)
}