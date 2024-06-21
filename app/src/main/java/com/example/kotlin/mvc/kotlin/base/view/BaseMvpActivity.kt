package com.example.kotlin.mvc.kotlin.base.view

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.mvc.kotlin.base.presenter.BaseMvpPresenter

/**
 * MVP公共父类
 * 最开始这样写有问题
 * P extends BaseMvpPresenter<IBaseMvpView>
 * 因为子类需要使用BaseMvpPresenter<ITestMvpView>
 * 而父类限定了IBaseMvpView，所以类型不匹配，正确是是使用V extends IBaseMvpView
</ITestMvpView></IBaseMvpView> */
abstract class BaseMvpActivity<V : IBaseMvpView?, P : BaseMvpPresenter<V>?> : AppCompatActivity(),
    IBaseMvpView {
    protected var mPresenter: P? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = initPresenter()
    }

    protected abstract fun initPresenter(): P
    val presenter: P?
        get() {
            if (mPresenter == null) mPresenter = initPresenter()
            return mPresenter
        }

    override fun getContext(): Context? {
        return this
    }

    override fun showToast(str: String?) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        if (mPresenter != null) mPresenter!!.onStart()
    }

    override fun onRestart() {
        super.onRestart()
        if (mPresenter != null) mPresenter!!.onRestart()
    }

    override fun onPostResume() {
        super.onPostResume()
        if (mPresenter != null) mPresenter!!.onPostResume()
    }

    override fun onResume() {
        super.onResume()
        if (mPresenter != null) mPresenter!!.onResume()
    }

    override fun onPause() {
        super.onPause()
        if (mPresenter != null) mPresenter!!.onPause()
    }

    override fun onStop() {
        super.onStop()
        if (mPresenter != null) mPresenter!!.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (mPresenter != null) mPresenter!!.onDestroy()
    }
}