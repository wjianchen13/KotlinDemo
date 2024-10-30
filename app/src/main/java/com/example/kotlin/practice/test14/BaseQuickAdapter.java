package com.example.kotlin.practice.test14;

import android.view.View;

public abstract class BaseQuickAdapter<T, K extends BaseViewHolder> {

    public interface OnItemClickListener<T, K extends BaseViewHolder> {

        void onItemClick(BaseQuickAdapter<T, K> adapter, View view, int position);
    }

}
