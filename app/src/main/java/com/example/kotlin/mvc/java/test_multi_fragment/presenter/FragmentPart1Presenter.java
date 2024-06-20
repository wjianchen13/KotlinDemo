package com.example.kotlin.mvc.java.test_multi_fragment.presenter;

import com.example.kotlin.mvc.java.base.presenter.BaseMultiPartMvpPresenter;
import com.example.kotlin.mvc.java.test_multi_fragment.view.IPart1View;

public class FragmentPart1Presenter extends BaseMultiPartMvpPresenter<IPart1View> {

    public FragmentPart1Presenter(IPart1View view) {
        super(view);
    }

    public String getTestString() {
        return "TestMvpPresenter";
    }

    public void getPart1Text() {
        getView().onGetText("part1");
    }

}