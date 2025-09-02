package com.example.kotlin.first.jetpack.livedata.test2

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.R

/**
 * LiveData 基础使用，不对外开放
 */
class LiveDataActivity2 : AppCompatActivity() {

    private lateinit var plusOneBtn : Button
    private lateinit var clearBtn : Button
    private lateinit var infoText : TextView

    lateinit var viewModel: LiveDataViewModel2
    lateinit var sp: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata2)
        plusOneBtn = findViewById(R.id.plusOneBtn)
        clearBtn = findViewById(R.id.clearBtn)
        infoText = findViewById(R.id.infoText)

        sp = getPreferences(Context.MODE_PRIVATE)
        val countReserved = sp.getInt("count_reserved", 0)
        viewModel = ViewModelProvider(this, LiveDataModelFactory2(countReserved))
                .get(LiveDataViewModel2::class.java)
        plusOneBtn.setOnClickListener {
            viewModel.plusOne()
        }
        clearBtn.setOnClickListener {
            viewModel.clear()
        }
        viewModel.counter.observe(this, Observer { count ->
            infoText.text = count.toString()
        })

    }

    override fun onPause() {
        super.onPause()
        var e  = sp?.edit()
        e?.putInt("count_reserved", viewModel.counter.value ?: 0)
        e?.commit()
    }


}