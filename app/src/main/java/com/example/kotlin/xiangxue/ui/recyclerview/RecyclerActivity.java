package com.example.kotlin.xiangxue.ui.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;

/**
 * recyclerview
 */
public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
    }

    public void onTest1(View v) {
        startActivity(new Intent(this, RecyclerViewActivity1.class));
    }

}