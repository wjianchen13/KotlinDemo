package com.example.kotlin.mvc.java.base.presenter;

import com.example.kotlin.mvc.java.base.view.IBaseMvpView;

/**
 * MVP公共Presenter
 */
public class BaseMultiPartMvpPresenter<V extends IBaseMvpView, P extends BaseMvpPresenter> extends BaseMvpPresenter<V> {

    private static final String TAG = BaseMultiPartMvpPresenter.class.getSimpleName();

    protected P mParentPresenter = null;

    public BaseMultiPartMvpPresenter(V view) {
        super(view);
    }

}
