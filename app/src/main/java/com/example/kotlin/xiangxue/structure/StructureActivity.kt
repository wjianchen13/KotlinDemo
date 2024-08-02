package com.example.kotlin.xiangxue.structure

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.R
import com.example.kotlin.xiangxue.structure.viewmodels.MainViewModel

/**
 * ViewModel 的生命周期是长于Activity
 * 的，如果把Activity 的实例传给ViewModel ，就很有可能会因为Activity 无法释放而造成内存泄
 * 漏，这是一种非常错误的做法
 */
class StructureActivity : BaseActivity() {

    private lateinit var plusOneBtn : Button
    private lateinit var infoText : TextView
    private lateinit var tv_test1 : TextView
    private lateinit var btn_test1 : TextView
    private lateinit var btn_test2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_structure)
        plusOneBtn = findViewById(R.id.plusOneBtn)
        infoText = findViewById(R.id.infoText)
        tv_test1 = findViewById(R.id.tv_test1)
        btn_test1 = findViewById(R.id.btn_test1)
        btn_test2 = findViewById(R.id.btn_test2)
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