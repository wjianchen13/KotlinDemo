package com.example.jetpack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jetpack.lifecycle.LifeCycleActivity;
import com.example.jetpack.livedata.LiveDataActivity;
import com.example.jetpack.viewmodel.ViewModelActivity;
import com.example.jetpack.viewmodel.ViewModelActivity2;

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