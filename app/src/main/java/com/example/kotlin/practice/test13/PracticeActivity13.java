package com.example.kotlin.practice.test13;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;

public class PracticeActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice13);
    }

    public void onTest1(View v) {
        TestBean13 t13 = new TestBean13("11");
    }

}


