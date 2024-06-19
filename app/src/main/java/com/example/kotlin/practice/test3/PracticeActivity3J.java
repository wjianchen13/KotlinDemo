package com.example.kotlin.practice.test3;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.practice.JUtils;

/**
 * 线程
 */
public class PracticeActivity3J extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice3);
    }

    /**
     * 线程测试
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

}