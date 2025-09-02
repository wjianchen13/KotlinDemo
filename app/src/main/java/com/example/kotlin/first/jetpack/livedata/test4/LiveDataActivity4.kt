package com.example.kotlin.first.jetpack.livedata.test4

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.R

/**
 * LiveData map 不对外开放
 */
class LiveDataActivity4 : AppCompatActivity() {

    private lateinit var tv_test : TextView
    private lateinit var tv_test1 : TextView

    lateinit var viewModel: LiveDataViewModel4
    lateinit var sp: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata4)
        tv_test = findViewById(R.id.tv_test)
        tv_test1 = findViewById(R.id.tv_test1)

        sp = getPreferences(Context.MODE_PRIVATE)
        val countReserved = sp.getInt("count_reserved", 0)
        viewModel = ViewModelProvider(this, LiveDataModelFactory4(countReserved))
                .get(LiveDataViewModel4::class.java)

        viewModel.userName.observe(this) { userName ->
            tv_test.text = userName
        }

        tv_test1.setOnClickListener {
            viewModel.change()
        }
    }

    override fun onPause() {
        super.onPause()
        var e  = sp?.edit()
//        e?.putInt("count_reserved", viewModel.counter.value ?: 0)
        e?.commit()
    }


}