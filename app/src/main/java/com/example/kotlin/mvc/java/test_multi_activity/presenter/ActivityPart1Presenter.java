package com.example.kotlin.mvc.java.test_multi_activity.presenter;


import com.example.kotlin.mvc.java.base.presenter.BaseMultiPartMvpPresenter;
import com.example.kotlin.mvc.java.test_multi_fragment.view.IPart1View;

public class ActivityPart1Presenter extends BaseMultiPartMvpPresenter<IPart1View> {

    public ActivityPart1Presenter(IPart1View view) {
        super(view);
    }

    public String getTestString() {
        return "TestMvpPresenter";
    }

    public void getPart1Text() {
        getView().onGetText("part1");
    }

}