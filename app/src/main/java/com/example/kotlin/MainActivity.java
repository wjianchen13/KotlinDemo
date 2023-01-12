package com.example.kotlin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.coroutines.CoroutinesActivity;
import com.example.kotlin.delegate.DelegateActivity;
import com.example.kotlin.dsl.DslActivity;
import com.example.kotlin.generic.GenericActivity;
import com.example.kotlin.higher.HigherActivity;
import com.example.kotlin.jetpack.JetpackActivity;
import com.example.kotlin.lamda.LamdaActivity;
import com.example.kotlin.normal.KotlinActivity;
import com.example.kotlin.ui.UiActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onKotlin(View v) {
        startActivity(new Intent(this, KotlinActivity.class));
    }

    public void onUi(View v) {
        startActivity(new Intent(this, UiActivity.class));
    }

    public void onJetpack(View v) {
        startActivity(new Intent(this, JetpackActivity.class));
    }

    public void onDelegate(View v) {
        startActivity(new Intent(this, DelegateActivity.class));
    }

    public void onLamda(View v) {
        startActivity(new Intent(this, LamdaActivity.class));
    }

    public void onHigher(View v) {
        startActivity(new Intent(this, HigherActivity.class));
    }

    public void onDsl(View v) {
        startActivity(new Intent(this, DslActivity.class));
    }

    public void onCoroutines(View v) {
        startActivity(new Intent(this, CoroutinesActivity.class));
    }

    public void onGeneric(View v) {
        startActivity(new Intent(this, GenericActivity.class));
    }

}