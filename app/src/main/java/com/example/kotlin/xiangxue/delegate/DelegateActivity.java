package com.example.kotlin.xiangxue.delegate;

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

    public void onDelegateBase2(View v) {
        startActivity(new Intent(this, TestDelegateActivity2.class));
    }

    public void onDelegateBase3(View v) {
        startActivity(new Intent(this, TestDelegateActivity3.class));
    }
    
    public void onDelegateBase4(View v) {
        startActivity(new Intent(this, TestDelegateActivity4.class));
    }

    public void onDelegateBase5(View v) {
        startActivity(new Intent(this, TestDelegateActivity5.class));
    }

    public void onDelegateBase6(View v) {
        startActivity(new Intent(this, TestDelegateActivity6.class));
    }

    public void onDelegateBase7(View v) {
        startActivity(new Intent(this, TestDelegateActivity7.class));
    }

    public void onDelegateBase8(View v) {
        startActivity(new Intent(this, TestDelegateActivity8.class));
    }

    public void onDelegateBase9(View v) {
        startActivity(new Intent(this, TestDelegateActivity9.class));
    }
    
    public void onDelegateBase10(View v) {
        startActivity(new Intent(this, TestDelegateActivity10.class));
    }
    
    public void onDelegateBase11(View v) {
        startActivity(new Intent(this, TestDelegateActivity11.class));
    }

    public void onDelegateBase12(View v) {
        startActivity(new Intent(this, TestDelegateActivity12.class));
    }

    public void onDelegateBase13(View v) {
        startActivity(new Intent(this, TestDelegateActivity13.class));
    }

}