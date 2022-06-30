package com.example.jetpack.viewmodel;

import androidx.lifecycle.ViewModel

class MainViewModel2(countReserved: Int) : ViewModel() {
    var counter = countReserved
}