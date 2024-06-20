package com.example.kotlin.mvc.java.test_multi_activity.modules;

import android.view.View;
import android.widget.TextView;

import com.example.kotlin.R;
import com.example.kotlin.mvc.java.base.module.BaseModule;
import com.example.kotlin.mvc.java.test_multi_activity.presenter.TestMultiPartMvpActivityPresenter;
import com.example.kotlin.mvc.java.test_multi_activity.view.TestMultiPartyActivity;
import com.example.kotlin.mvc.java.test_multi_fragment.view.IPart2View;

public class ActivityPart2Module extends BaseModule<TestMultiPartyActivity, TestMultiPartMvpActivityPresenter> implements IPart2View {

    private TextView tvPart2;

    public ActivityPart2Module(View parent) {
        super(parent);
    }

    public ActivityPart2Module(TestMultiPartyActivity activity, TestMultiPartMvpActivityPresenter presenter, View parent) {
        super(activity, presenter, parent);
    }

    @Override
    public void setVisible(int animEnum) {
        super.setVisible(animEnum);
    }

    @Override
    protected void lazyInitView() {
        super.lazyInitView();
        tvPart2 = mRootLayout.findViewById(R.id.tv_part2);
    }

    @Override
    public void onGetText2(String str) {
        tvPart2.setText(str);
    }
}
