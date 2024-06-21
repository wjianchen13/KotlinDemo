package com.example.kotlin.mvc.kotlin.test_activity.presenter

import com.example.kotlin.mvc.kotlin.base.presenter.BaseMvpPresenter
import com.example.kotlin.mvc.kotlin.test_activity.view.ITestMvpActivityView

/**
 * MVP公共Presenter
 */
class TestMvpActivityPresenter(view: ITestMvpActivityView?) :
    BaseMvpPresenter<ITestMvpActivityView?>(view) {
    val testString: String
        get() = "TestMvpPresenter"

    fun onTip() {
        view!!.test()
    }
}