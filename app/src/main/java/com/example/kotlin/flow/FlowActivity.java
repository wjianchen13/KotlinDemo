package com.example.kotlin.flow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.first.coroutines.CoroutinesActivity;
import com.example.kotlin.first.delegate.DelegateActivity;
import com.example.kotlin.first.generic.GenericActivity;
import com.example.kotlin.first.high_function.HighFunctionActivity;
import com.example.kotlin.first.infix.InfixActivity;
import com.example.kotlin.first.jetpack.JetpackActivity;
import com.example.kotlin.first.lambda.LambdaActivity;
import com.example.kotlin.first.late.LateActivity;
import com.example.kotlin.first.logic.LogicActivity;
import com.example.kotlin.first.npe.NpeActivity;
import com.example.kotlin.first.obj.ObjActivity;
import com.example.kotlin.first.standard.StandardActivity;
import com.example.kotlin.first.var1.FunActivity;
import com.example.kotlin.first.var1.VarActivity;
import com.example.kotlin.flow.test1.FlowActivity1;

/**
 * Flow
 * Kotlin Flow响应式编程，基础知识入门
 * https://blog.csdn.net/guolin_blog/article/details/127466982
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

}