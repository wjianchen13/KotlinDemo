package com.example.kotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kotlin.lifecycle.LifeCycleActivity;
import com.example.kotlin.livedata.LiveDataActivity;
import com.example.kotlin.viewmodel.ViewModelActivity;
import com.example.kotlin.viewmodel.ViewModelActivity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLifeCycle(View v) {
        startActivity(new Intent(this, LifeCycleActivity.class));
    }

    public void onViewModel(View v) {
        startActivity(new Intent(this, ViewModelActivity.class));
    }

    public void onViewModel2(View v) {
        startActivity(new Intent(this, ViewModelActivity2.class));
    }

    public void onLiveData(View v) {
        startActivity(new Intent(this, LiveDataActivity.class));
    }
}