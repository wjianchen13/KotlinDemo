package com.example.kotlin.practice.test18;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;

/**
 * @JvmOverloads 的用法
 */
public class PracticeActivity18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice18);
    }

    public void onTest1(View v) {
        TestBean18 t13 = new TestBean18("11");
    }

}


