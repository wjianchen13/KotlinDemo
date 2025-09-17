package com.example.kotlin.first.dsl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.first.dsl.test1.DslActivity1;
import com.example.kotlin.first.dsl.test2.DslActivity2;
import com.example.kotlin.first.jetpack.viewmodel.ViewModelActivity;

/**
 * 使用DSL构建专有的语法结构
 */
public class DslActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_dsl);
    }

    /**
     * 模拟dependencies
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, DslActivity1.class));
    }

    /**
     * Html 标签
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, DslActivity2.class));
    }

}