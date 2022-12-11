package com.example.kotlin.delegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;

public class DelegateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegate);
    }

    public void onDelegateBase(View v) {
        startActivity(new Intent(this, TestDelegateActivity1.class));
    }

    public void onUi(View v) {

    }

    public void onJetpack(View v) {

    }
    
    public void onViewModel2(View v) {

    }

    public void onLiveData(View v) {

    }
}