package com.example.kotlin.practice.test10;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.practice.JUtils;

/**
 * 测试java接口实现default，kotlin类继承提示override onthing的问题
 */
public class PracticeActivity10J extends AppCompatActivity implements ITest10{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice10);
    }

    /**
     *
     */
    public void onTest1(View v) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                JUtils.log("Thread test");
            }
        });
        t.start();
    }

    /**
     *
     */
    public void onTest2(View v) {

    }

    @Override
    public void test1() {

    }
}