package com.example.kotlin.mvc.kotlin.base.presenter;

import com.example.kotlin.mvc.kotlin.base.presenter.BaseMvpPresenter;
import com.example.kotlin.mvc.kotlin.base.view.IBaseMvpView;

/**
 * MVP公共Presenter
 */
public class BaseMultiPartMvpPresenter<V extends IBaseMvpView, P extends BaseMvpPresenter> extends BaseMvpPresenter<V> {

    /**
     * 子present的父presenter引用
     */
    protected P mParentPresenter = null;

    private static final String TAG = BaseMultiPartMvpPresenter.class.getSimpleName();

    public BaseMultiPartMvpPresenter(V view) {
        super(view);
    }

}
