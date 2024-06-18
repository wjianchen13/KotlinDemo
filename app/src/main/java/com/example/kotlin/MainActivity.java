package com.example.kotlin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.first.KotlinActivity;
import com.example.kotlin.practice.PracticeActivity;
import com.example.kotlin.xiangxue.XiangxueActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 第一行代码里面的例子
     * @param v
     */
    public void onKotlin(View v) {
        startActivity(new Intent(this, KotlinActivity.class));
    }

    /**
     * 享学课堂教程
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, XiangxueActivity.class));
    }

    /**
     * Kotlin实践
     * @param v
     */
    public void onTest3(View v) {
        startActivity(new Intent(this, PracticeActivity.class));
    }


}