package com.example.kotlin.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.first.coroutines.CoroutinesActivity;
import com.example.kotlin.first.delegate.DelegateActivity;
import com.example.kotlin.first.dsl.DslActivity;
import com.example.kotlin.first.expand.ExpandActivity;
import com.example.kotlin.first.generic.GenericActivity;
import com.example.kotlin.first.high_function.HighFunctionActivity;
import com.example.kotlin.first.infix.InfixActivity;
import com.example.kotlin.first.lambda.LambdaActivity;
import com.example.kotlin.first.late.LateActivity;
import com.example.kotlin.first.logic.LogicActivity;
import com.example.kotlin.first.npe.NpeActivity;
import com.example.kotlin.first.obj.ObjActivity;
import com.example.kotlin.first.standard.StandardActivity;
import com.example.kotlin.first.var1.FunActivity;
import com.example.kotlin.first.var1.VarActivity;
import com.example.kotlin.first.jetpack.JetpackActivity;

/**
 * android 第一行代码
 */
public class KotlinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);
    }

    public void onVar(View v) {
        startActivity(new Intent(this, VarActivity.class));
    }

    public void onFun(View v) {
        startActivity(new Intent(this, FunActivity.class));
    }

    public void onLogic(View v) {
        startActivity(new Intent(this, LogicActivity.class));
    }

    public void onObj(View v) {
        startActivity(new Intent(this, ObjActivity.class));
    }

    public void onLambda(View v) {
        startActivity(new Intent(this, LambdaActivity.class));
    }

    public void onNpe(View v) {
        startActivity(new Intent(this, NpeActivity.class));
    }

    public void onStandard(View v) {
        startActivity(new Intent(this, StandardActivity.class));
    }

    public void onLate(View v) {
        startActivity(new Intent(this, LateActivity.class));
    }

    /**
     * 扩展函数和运算符重载
     * @param v
     */
    public void onTest9(View v) {
        startActivity(new Intent(this, ExpandActivity.class));
    }

    /**
     * 高阶函数详解
     * @param v
     */
    public void onTest10(View v) {
        startActivity(new Intent(this, HighFunctionActivity.class));
    }

    /**
     * 泛型
     * @param v
     */
    public void onTest11(View v) {
        startActivity(new Intent(this, GenericActivity.class));
    }

    /**
     * 委托
     * @param v
     */
    public void onTest12(View v) {
        startActivity(new Intent(this, DelegateActivity.class));
    }

    /**
     * 中缀函数
     * @param v
     */
    public void onTest13(View v) {
        startActivity(new Intent(this, InfixActivity.class));
    }

    /**
     *  Kotlin 协程
     * @param v
     */
    public void onTest14(View v) {
        startActivity(new Intent(this, CoroutinesActivity.class));
    }

    /**
     * Jetpack
     * @param v
     */
    public void onTest15(View v) {
        startActivity(new Intent(this, JetpackActivity.class));
    }


    /**
     * 使用DS L构建专有的语法结构
     */
    public void onTest16(View v) {
        startActivity(new Intent(this, DslActivity.class));
    }


}