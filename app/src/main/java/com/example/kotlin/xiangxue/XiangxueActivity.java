package com.example.kotlin.xiangxue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.xiangxue.coroutines.CoroutinesActivity;
import com.example.kotlin.xiangxue.delegate.DelegateActivity;
import com.example.kotlin.xiangxue.dsl.DslActivity;
import com.example.kotlin.xiangxue.generic.GenericActivity;
import com.example.kotlin.xiangxue.higher.HigherActivity;
import com.example.kotlin.xiangxue.lamda.LamdaActivity;
import com.example.kotlin.xiangxue.structure.StructureActivity;
import com.example.kotlin.xiangxue.ui.UiActivity;

/**
 * 享学教程代码
 * 文档：Kotlin笔记.docx
 */
public class XiangxueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiangxue);
    }

    public void onStructure(View v) {
        startActivity(new Intent(this, StructureActivity.class));
    }

    public void onUi(View v) {
        startActivity(new Intent(this, UiActivity.class));
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
//        TestBean b = null;
//        Test t = new Test();
//        t.test1(b);
    }

}