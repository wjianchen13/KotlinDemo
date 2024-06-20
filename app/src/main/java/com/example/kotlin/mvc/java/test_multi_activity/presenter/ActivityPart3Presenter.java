package com.example.kotlin.mvc.java.test_multi_activity.presenter;

import com.example.kotlin.mvc.java.base.presenter.BaseMultiPartMvpPresenter;
import com.example.kotlin.mvc.java.test_multi_fragment.view.IPart3View;

public class ActivityPart3Presenter extends BaseMultiPartMvpPresenter<IPart3View> {

    public ActivityPart3Presenter(IPart3View view) {
        super(view);
    }

    public String getTestString() {
        return "TestMvpPresenter";
    }

    public void getPart3Text() {
        getView().onGetText3("part3");
    }

}