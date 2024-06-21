package com.example.kotlin.mvc.java.test_multi_activity.presenter;

import com.example.kotlin.mvc.java.base.presenter.BaseMultiPartMvpPresenter;
import com.example.kotlin.mvc.java.test_multi_fragment.view.IPart2View;

public class ActivityPart2Presenter extends BaseMultiPartMvpPresenter<IPart2View, ActivityPart2Presenter> {

    public ActivityPart2Presenter(IPart2View view) {
        super(view);
    }

    public String getTestString() {
        return "TestMvpPresenter";
    }

    public void getPart2Text() {
        getView().onGetText2("part2");
    }

}