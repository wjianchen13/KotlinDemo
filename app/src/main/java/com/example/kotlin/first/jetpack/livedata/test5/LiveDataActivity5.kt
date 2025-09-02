package com.example.kotlin.first.jetpack.livedata.test5

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.R

/**
 * LiveData switchMap
 */
class LiveDataActivity5 : AppCompatActivity() {

    private lateinit var tv_test : TextView
    private lateinit var tv_test1 : TextView

    lateinit var viewModel: LiveDataViewModel5
    lateinit var sp: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata5)
        tv_test = findViewById(R.id.tv_test)
        tv_test1 = findViewById(R.id.tv_test1)

        sp = getPreferences(Context.MODE_PRIVATE)
        val countReserved = sp.getInt("count_reserved", 0)
        viewModel = ViewModelProvider(this, LiveDataModelFactory5(countReserved))
                .get(LiveDataViewModel5::class.java)

        viewModel.user.observe(this) { user ->
            tv_test.text = "firstName: ${user.firstName} lastName: ${user.lastName}"
        }

        tv_test1.setOnClickListener {
            val userId = (0..10000).random().toString()
            viewModel.getUser(userId)
        }
    }

    override fun onPause() {
        super.onPause()
        var e  = sp?.edit()
//        e?.putInt("count_reserved", viewModel.counter.value ?: 0)
        e?.commit()
    }


}