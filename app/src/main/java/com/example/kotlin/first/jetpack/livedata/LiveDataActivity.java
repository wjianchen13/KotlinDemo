package com.example.kotlin.first.jetpack.livedata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.first.jetpack.livedata.test1.LiveDataActivity1;
import com.example.kotlin.first.jetpack.livedata.test2.LiveDataActivity2;
import com.example.kotlin.first.jetpack.livedata.test3.LiveDataActivity3;
import com.example.kotlin.first.jetpack.livedata.test4.LiveDataActivity4;
import com.example.kotlin.first.jetpack.livedata.test5.LiveDataActivity5;

public class LiveDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livedata);
    }

    /**
     * LiveData 基础使用
     * @param v
     */
    public void onLiveData1(View v) {
        startActivity(new Intent(this, LiveDataActivity1.class));
    }

    /**
     * LiveData 基础使用，不对外开放
     * @param v
     */
    public void onLiveData2(View v) {
        startActivity(new Intent(this, LiveDataActivity2.class));
    }

    /**
     * LiveData map
     * @param v
     */
    public void onLiveData3(View v) {
        startActivity(new Intent(this, LiveDataActivity3.class));
    }

    /**
     * LiveData map 不对外开放
     * @param v
     */
    public void onLiveData4(View v) {
        startActivity(new Intent(this, LiveDataActivity4.class));
    }

    /**
     * LiveData switchMap
     * @param v
     */
    public void onLiveData5(View v) {
        startActivity(new Intent(this, LiveDataActivity5.class));
    }



}