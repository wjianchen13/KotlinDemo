package com.example.kotlin.xiangxue.jetpack.viewmodel

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.R

class ViewModelActivity2 : AppCompatActivity() {

    private lateinit var plusOneBtn : Button
    private lateinit var clearBtn : Button
    private lateinit var infoText : TextView

    lateinit var viewModel: MainViewModel2
    lateinit var sp: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel2)
        plusOneBtn = findViewById(R.id.plusOneBtn)
        clearBtn = findViewById(R.id.clearBtn)
        infoText = findViewById(R.id.infoText)

        sp = getPreferences(Context.MODE_PRIVATE)
        val countReserved = sp.getInt("count_reserved", 0)

        viewModel = ViewModelProvider(this, MainViewModelFactory(countReserved))
                .get(MainViewModel2::class.java)
        plusOneBtn.setOnClickListener {
            viewModel.counter++
            refreshCounter()
        }
        clearBtn.setOnClickListener {
            viewModel.counter = 0
            refreshCounter()
        }
        refreshCounter()
    }

    override fun onPause() {
        super.onPause()
        var e  = sp?.edit()
        e?.putInt("count_reserved", viewModel.counter)
        e?.commit()
    }

    private fun refreshCounter() {
        infoText.text = viewModel.counter.toString()
    }

}