package com.example.kotlin.practice.test9

import android.widget.Toast
import com.example.kotlin.BaseApp

//@JvmDefaultWithCompatibility
interface ICallBack {

    fun showToast() {
        Toast.makeText(BaseApp.getInstance(), "default", Toast.LENGTH_SHORT).show()
    }

}