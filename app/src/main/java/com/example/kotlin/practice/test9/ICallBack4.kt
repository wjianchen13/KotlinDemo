package com.example.kotlin.practice.test9

import android.widget.Toast
import com.example.kotlin.BaseApp

interface ICallBack4 {

    fun showToast() {
        Toast.makeText(BaseApp.getInstance(), "default", Toast.LENGTH_SHORT).show()
    }
    
}