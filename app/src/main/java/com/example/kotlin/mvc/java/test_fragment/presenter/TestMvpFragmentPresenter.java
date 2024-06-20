package com.example.kotlin.mvc.java.test_fragment.presenter;

import com.example.kotlin.mvc.java.base.presenter.BaseMvpPresenter;
import com.example.kotlin.mvc.java.test_fragment.view.ITestMvpFragmentView;

public class TestMvpFragmentPresenter extends BaseMvpPresenter<ITestMvpFragmentView> {

    public TestMvpFragmentPresenter(ITestMvpFragmentView view) {
        super(view);
    }

    public String getTestString() {
        return "TestMvpPresenter";
    }

    public void onTip() {
        getView().test();
    }

}