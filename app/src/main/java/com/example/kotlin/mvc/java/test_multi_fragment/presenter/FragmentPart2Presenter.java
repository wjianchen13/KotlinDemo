package com.example.kotlin.mvc.java.test_multi_fragment.presenter;


import com.example.kotlin.mvc.java.base.presenter.BaseMultiPartMvpPresenter;
import com.example.kotlin.mvc.java.test_multi_fragment.view.IPart2View;

public class FragmentPart2Presenter extends BaseMultiPartMvpPresenter<IPart2View, FragmentPart2Presenter> {

    public FragmentPart2Presenter(IPart2View view) {
        super(view);
    }

    public String getTestString() {
        return "TestMvpPresenter";
    }

    public void getPart2Text() {
        getView().onGetText2("part2");
    }

}