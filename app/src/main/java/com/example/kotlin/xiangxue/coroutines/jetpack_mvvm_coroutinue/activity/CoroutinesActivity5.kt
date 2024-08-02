package com.example.kotlin.xiangxue.coroutines.jetpack_mvvm_coroutinue.activity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.derry.kt_coroutines.use2.viewmodel.APIViewModel
import com.example.kotlin.R
import com.example.kotlin.databinding.ActivityConroutines5Binding

/**
 * JetPack MVVM 协程案例实战
 */
class CoroutinesActivity5 : AppCompatActivity() {

    private lateinit var bt : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // DataBinding必须是AndroidX的环境  ComponentActivity LifecycleOwner

        // 绑定DataBinding
        val binding = DataBindingUtil.setContentView<ActivityConroutines5Binding>(this, R.layout.activity_conroutines5)
        binding.lifecycleOwner = this
        bt = findViewById(R.id.bt)
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            APIViewModel::class.java)

        binding.vm = viewModel

        // 请求网络 点击事件
        bt?.setOnClickListener { viewModel.requestLogin("Derry-vip", "123456") }
    }

}