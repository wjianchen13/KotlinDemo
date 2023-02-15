package com.example.kotlin.structure

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.R
import com.example.kotlin.structure.viewmodels.BaseViewModel
import com.example.kotlin.structure.viewmodels.MainViewModel
import com.example.kotlin.structure.viewmodels.ViewModel1
import com.example.kotlin.structure.viewmodels.ViewModel2
import com.example.kotlin.structure.views.BaseView
import com.example.kotlin.structure.views.View1
import com.example.kotlin.structure.views.View2
import kotlinx.android.synthetic.main.activity_viewmodel.*

/**
 * ViewModel 的生命周期是长于Activity
 * 的，如果把Activity 的实例传给ViewModel ，就很有可能会因为Activity 无法释放而造成内存泄
 * 漏，这是一种非常错误的做法
 */
open class BaseActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    var mViews = mutableListOf<BaseView>()

    init {
        mViews.add(View1())
        mViews.add(View2())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}