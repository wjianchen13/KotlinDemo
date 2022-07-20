package com.example.kotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kotlin.jetpack.JetpackActivity;
import com.example.kotlin.jetpack.lifecycle.LifeCycleActivity;
import com.example.kotlin.jetpack.livedata.LiveDataActivity;
import com.example.kotlin.jetpack.viewmodel.ViewModelActivity;
import com.example.kotlin.jetpack.viewmodel.ViewModelActivity2;
import com.example.kotlin.normal.KotlinActivity;
import com.example.kotlin.normal.lambda.LambdaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onKotlin(View v) {
        startActivity(new Intent(this, KotlinActivity.class));
    }


    public void onJetpack(View v) {
        startActivity(new Intent(this, JetpackActivity.class));
    }



    public void onViewModel2(View v) {
        startActivity(new Intent(this, ViewModelActivity2.class));
    }

    public void onLiveData(View v) {
        startActivity(new Intent(this, LiveDataActivity.class));
    }
}