package com.example.kotlin.normal.standard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.jetpack.JetpackActivity;
import com.example.kotlin.jetpack.livedata.LiveDataActivity;
import com.example.kotlin.jetpack.viewmodel.ViewModelActivity2;
import com.example.kotlin.normal.KotlinActivity;

/**
 * Java 调用Kotlin
 */
public class StandardActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard1);
    }

    /**
     * @JvmStatic调用
     */
    public void onTest1(View v) {
        Util3.doAction2();
    }


    /**
     * 顶层方法调用
     */
    public void onTest2(View v) {
        HelperKt.doSomething();
    }
}
