package com.example.kotlin.normal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.normal.logic.LogicActivity;
import com.example.kotlin.normal.obj.ObjActivity;
import com.example.kotlin.normal.var1.FunActivity;
import com.example.kotlin.normal.var1.VarActivity;

public class KotlinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);
    }

    public void onVar(View v) {
        startActivity(new Intent(this, VarActivity.class));
    }

    public void onFun(View v) {
        startActivity(new Intent(this, FunActivity.class));
    }

    public void onLogic(View v) {
        startActivity(new Intent(this, LogicActivity.class));
    }

    public void onObj(View v) {
        startActivity(new Intent(this, ObjActivity.class));
    }
}