package com.example.kotlin.jetpack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.jetpack.lifecycle.LifeCycleActivity;
import com.example.kotlin.jetpack.livedata.LiveDataActivity;
import com.example.kotlin.jetpack.viewmodel.ViewModelActivity;
import com.example.kotlin.jetpack.viewmodel.ViewModelActivity2;

public class JetpackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jetpack);
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