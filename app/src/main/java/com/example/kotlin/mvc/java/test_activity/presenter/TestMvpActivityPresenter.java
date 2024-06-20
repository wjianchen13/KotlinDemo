package com.example.kotlin.mvc.java.test_activity.presenter;

import com.example.kotlin.mvc.java.base.presenter.BaseMvpPresenter;
import com.example.kotlin.mvc.java.test_activity.view.ITestMvpActivityView;

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
