package com.example.kotlin.mvc.kotlin.base.presenter;

import com.example.kotlin.mvc.kotlin.base.presenter.BaseMvpPresenter;
import com.example.kotlin.mvc.kotlin.base.view.IBaseMvpView;

/**
 * MVP公共Presenter
 */
public class BaseMultiPartMvpPresenter<V extends IBaseMvpView> extends BaseMvpPresenter<V> {

    private static final String TAG = BaseMultiPartMvpPresenter.class.getSimpleName();

    public BaseMultiPartMvpPresenter(V view) {
        super(view);
    }

}
