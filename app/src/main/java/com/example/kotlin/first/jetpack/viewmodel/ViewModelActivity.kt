package com.example.kotlin.first.jetpack.viewmodel

import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.R

/**
 * ViewModel 的生命周期是长于Activity
 * 的，如果把Activity 的实例传给ViewModel ，就很有可能会因为Activity 无法释放而造成内存泄
 * 漏，这是一种非常错误的做法
 */
class ViewModelActivity : AppCompatActivity() {

    private lateinit var plusOneBtn : Button
    private lateinit var infoText : TextView

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)
        plusOneBtn = findViewById(R.id.plusOneBtn)
        infoText = findViewById(R.id.infoText)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        plusOneBtn.setOnClickListener {
            viewModel.counter++
            refreshCounter()
        }
        refreshCounter()
    }

    private fun refreshCounter() {
        infoText.text = viewModel.counter.toString()
    }
}