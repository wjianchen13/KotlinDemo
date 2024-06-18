package com.example.kotlin.first.generic.test8.java.view;

import android.content.Context;

/**
 * MVP公共接口
 */
public interface IBaseMvpView {

    Context getContext();
    void showToast(String str);

}
