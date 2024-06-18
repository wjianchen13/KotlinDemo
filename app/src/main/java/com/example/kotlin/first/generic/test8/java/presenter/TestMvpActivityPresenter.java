package com.example.kotlin.first.generic.test8.java.presenter;

import com.example.kotlin.first.generic.test8.java.view.ITestMvpActivityView;

/**
 * MVP公共Presenter
 */
public class TestMvpActivityPresenter extends BaseMvpPresenter<ITestMvpActivityView> {

    public TestMvpActivityPresenter(ITestMvpActivityView view) {
        super(view);
    }

    public String getTestString() {
        return "TestMvpPresenter";
    }

    public void onTip() {
        getView().test();
    }

}
