package com.example.kotlin.xiangxue.lamda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;

public class LamdaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamda);
    }

    public void onLamda(View v) {
        startActivity(new Intent(this, TestLamdaActivity1.class));
    }

    public void onFunction(View v) {
        startActivity(new Intent(this, TestLamdaActivity2.class));
    }
    
}