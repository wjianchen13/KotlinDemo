package com.example.kotlin.structure.viewmodels;

abstract class BaseViewModel {

    var name : String = ""

    abstract fun onCreate()
    abstract fun onStart()
    abstract fun onResume()
    abstract fun onPause()
    abstract fun onStop()
    abstract fun onDestroy()
    abstract fun onRestart()
    abstract fun onClear()

}