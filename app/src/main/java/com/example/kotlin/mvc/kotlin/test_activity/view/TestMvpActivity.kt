package com.example.kotlin.mvc.kotlin.test_activity.view

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.kotlin.R
import com.example.kotlin.mvc.kotlin.base.view.BaseMvpActivity
import com.example.kotlin.mvc.kotlin.test_activity.presenter.TestMvpActivityPresenter
import com.example.kotlin.mvc.kotlin.utils.Utils

class TestMvpActivity : BaseMvpActivity<ITestMvpActivityView?, TestMvpActivityPresenter?>(),
    ITestMvpActivityView {
    private var tvTip1: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp_activity)
        tvTip1 = findViewById(R.id.tv_tip1)
    }

    override fun initPresenter(): TestMvpActivityPresenter {
        return TestMvpActivityPresenter(this)
    }

    fun onToast(v: View?) {
        mPresenter!!.showToast("toast")
    }

    fun onTest(v: View?) {
        val str = mPresenter!!.testString
        Utils.i(TAG, "str: $str")
    }

    fun onContext(v: View?) {
        val context = mPresenter!!.context
        Utils.i(TAG, "context: $context")
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