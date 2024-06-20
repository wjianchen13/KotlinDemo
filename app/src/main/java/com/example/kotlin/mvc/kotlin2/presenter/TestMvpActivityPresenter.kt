package com.example.kotlin.mvc.kotlin2.presenter

import com.example.kotlin.mvc.kotlin2.view.ITestMvpActivityView
import com.example.kotlin.mvc.kotlin2.view.TestMvpActivity

class TestMvpActivityPresenter(view: TestMvpActivity) : BaseMvpPresenter<ITestMvpActivityView?>(view) {

    val testString: String
        get() = "TestMvpPresenter"

    fun onTip() {
        view?.test()
    }
}
