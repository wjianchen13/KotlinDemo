package com.example.kotlin.practice.test8;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;

public class PracticeActivity8J extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice8);
        Test8 test8 = new Test8();
        test8.getParam1();

    }

}


