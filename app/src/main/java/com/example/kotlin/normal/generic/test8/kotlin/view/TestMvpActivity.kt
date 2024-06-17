package com.example.kotlin.normal.generic.test8.kotlin.view

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.kotlin.R
import com.example.kotlin.normal.generic.test8.kotlin.presenter.TestMvpActivityPresenter
import com.example.kotlin.normal.generic.test8.kotlin.utils.Utils.i

/**
 * 测试Java的extends和super 转kotlin
 */
class TestMvpActivity : BaseMvpActivity<ITestMvpActivityView?, TestMvpActivityPresenter?>(), ITestMvpActivityView {
    private var tvTip1: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp_activity)
        tvTip1 = findViewById<TextView>(R.id.tv_tip1)
    }

    override fun initPresenter(): TestMvpActivityPresenter {
        return TestMvpActivityPresenter(this)
    }

    fun onToast(v: View?) {
        mPresenter!!.showToast("kotlin toast")
    }

    fun onTest(v: View?) {
        val str = mPresenter!!.testString
        i(
            TAG,
            "str: $str"
        )
    }

    fun onContext(v: View?) {
        val context = mPresenter!!.getContext()
        i(
            TAG,
            "context: $context"
        )
    }
    fun onTip(v: View?) {
        mPresenter!!.onTip()
    }

    override fun test() {
        tvTip1!!.visibility = View.VISIBLE
    }

    companion object {
        private val TAG = TestMvpActivity::class.java.simpleName
    }
}