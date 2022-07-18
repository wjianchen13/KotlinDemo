package com.example.kotlin.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LifeCycleActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(MyObserver())
    }
}