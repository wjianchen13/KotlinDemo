package com.example.kotlin.structure

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.R
import com.example.kotlin.structure.viewmodels.MainViewModel
import kotlinx.android.synthetic.main.activity_structure.*
import kotlinx.android.synthetic.main.activity_viewmodel.infoText
import kotlinx.android.synthetic.main.activity_viewmodel.plusOneBtn

/**
 * ViewModel 的生命周期是长于Activity
 * 的，如果把Activity 的实例传给ViewModel ，就很有可能会因为Activity 无法释放而造成内存泄
 * 漏，这是一种非常错误的做法
 */
class StructureActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_structure)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        plusOneBtn.setOnClickListener {
            viewModel.counter++
            refreshCounter()
        }
        refreshCounter()

        viewModel.data.observe(this) { data ->
            tv_test1.text = "name: ${data.name}  age: ${data.age}"
        }

        btn_test1.setOnClickListener {
            viewModel.changeData1()
        }

        btn_test2.setOnClickListener {

        }
    }

    private fun refreshCounter() {
        infoText.text = viewModel.counter.toString()
    }
}