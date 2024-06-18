package com.example.kotlin.first.generic.test8.kotlin.presenter

import com.example.kotlin.first.generic.test8.kotlin.view.ITestMvpActivityView
import com.example.kotlin.first.generic.test8.kotlin.view.TestMvpActivity

class TestMvpActivityPresenter(view: TestMvpActivity) : BaseMvpPresenter<ITestMvpActivityView?>(view) {

    val testString: String
        get() = "TestMvpPresenter"

    fun onTip() {
        view?.test()
    }
}
