package com.example.kotlin.flow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.flow.test1.FlowActivity1;
import com.example.kotlin.flow.test4.FlowActivity4;
import com.example.kotlin.flow.test5.FlowActivity5;
import com.example.kotlin.flow.test6.FlowActivity6;
import com.example.kotlin.flow.test7.FlowActivity7;
import com.example.kotlin.flow.test8.FlowActivity8;
import com.example.kotlin.flow.test9.FlowActivity9;

/**
 * Flow
 * Kotlin Flow响应式编程，基础知识入门
 * https://blog.csdn.net/guolin_blog/article/details/127466982
 *
 * Kotlin Flow响应式编程，StateFlow和SharedFlow
 * https://blog.csdn.net/guolin_blog/article/details/128591076
 *
 */
public class FlowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow);
    }

    /**
     * 计时器
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, FlowActivity1.class));
    }


    /**
     * 计时器背压
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, FlowActivity1.class));
    }

    /**
     * Flow的生命周期管理
     * @param v
     */
    public void onTest4(View v) {
        startActivity(new Intent(this, FlowActivity4.class));
    }

    /**
     * StateFlow的基本用法
     * @param v
     */
    public void onTest5(View v) {
        startActivity(new Intent(this, FlowActivity5.class));
    }

    /**
     * StateFlow的高级用法
     * @param v
     */
    public void onTest6(View v) {
        startActivity(new Intent(this, FlowActivity6.class));
    }


    /**
     * StateFlow的粘性特性
     * @param v
     */
    public void onTest7(View v) {
        startActivity(new Intent(this, FlowActivity7.class));
    }

    /**
     * StateFlow的粘性导致问题
     * @param v
     */
    public void onTest8(View v) {
        startActivity(new Intent(this, FlowActivity8.class));
    }

    /**
     * SharedFlow
     * @param v
     */
    public void onTest9(View v) {
        startActivity(new Intent(this, FlowActivity9.class));
    }


}