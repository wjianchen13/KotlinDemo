package com.example.kotlin.mvc.kotlin.presenter

import com.example.kotlin.mvc.kotlin.view.ITestMvpActivityView
import com.example.kotlin.mvc.kotlin.view.TestMvpActivity

class TestMvpActivityPresenter(view: TestMvpActivity) : BaseMvpPresenter<ITestMvpActivityView?>(view) {

    val testString: String
        get() = "TestMvpPresenter"

    fun onTip() {
        view?.test()
    }
}
