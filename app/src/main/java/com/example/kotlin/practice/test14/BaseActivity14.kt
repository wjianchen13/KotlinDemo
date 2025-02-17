package com.example.kotlin.practice.test14

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Java activity 继承Kotlin 父类Activity 父类Activity重写了接口方法，但是在子类缺提示没有覆写方法的问题
 * 需要指定泛型BaseQuickAdapter.OnItemClickListener<T, K>
 */
abstract class BaseActivity14<T, K : BaseViewHolder> : AppCompatActivity(), ITest14, BaseQuickAdapter.OnItemClickListener<T, K>{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun test(a: String?, b: Int) {

    }

    //    override fun onItemClick(adapter: BaseQuickAdapter<*, *>?, view: View?, position: Int) {
//
//    }
    override fun onItemClick(adapter: BaseQuickAdapter<T, K>?, view: View?, position: Int) {

    }
}