package com.example.kotlin.viewmodel;

import androidx.lifecycle.ViewModel

class MainViewModel2(countReserved: Int) : ViewModel() {
    var counter = countReserved
}