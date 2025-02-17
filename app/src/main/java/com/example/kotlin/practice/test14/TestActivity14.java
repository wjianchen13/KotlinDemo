package com.example.kotlin.practice.test14;


import android.os.Bundle;
import android.view.View;

import com.example.kotlin.R;

/**
 * Java activity 继承Kotlin 父类Activity 父类Activity重写了接口方法，但是在子类缺提示没有覆写方法的问题
 */
public class TestActivity14 extends BaseActivity14 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice14);
    }

    /**
     * 测试
     */
    public void onTest1(View v) {

    }


}

