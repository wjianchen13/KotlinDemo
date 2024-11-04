package com.example.kotlin.practice.test16

import android.content.Context
import android.widget.Toast

class Test3 {

    fun showToast(context: Context, str: String) {
        context?.let {
            Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
        }
    }

}