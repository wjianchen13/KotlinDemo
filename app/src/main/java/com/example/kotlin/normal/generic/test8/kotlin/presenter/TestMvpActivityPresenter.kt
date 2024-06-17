package com.example.kotlin.normal.generic.test8.kotlin.presenter

import com.example.kotlin.normal.generic.test8.kotlin.presenter.BaseMvpPresenter
import com.example.kotlin.normal.generic.test8.kotlin.view.ITestMvpActivityView
import com.example.kotlin.normal.generic.test8.kotlin.view.TestMvpActivity

class TestMvpActivityPresenter(view: TestMvpActivity) : BaseMvpPresenter<ITestMvpActivityView?>(view) {

    val testString: String
        get() = "TestMvpPresenter"

    fun onTip() {
        view?.test()
    }
}
