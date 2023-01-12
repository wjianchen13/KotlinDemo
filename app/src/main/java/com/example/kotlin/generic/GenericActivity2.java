package com.example.kotlin.generic;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型协变，逆变和不变
 */
public class GenericActivity2 extends AppCompatActivity {

    private TextView tvTitle  = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegate_test);
        tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText("Kotlin 泛型协变，逆变和不变");
    }

    public void onDelegateBase(View v) {
        // TODO ================= 协变
        // Object[] = String[] 数组默认开启协变
        // 之所以可以，是因为继承关系，    因为 默认的子父类继承关系，默认开启协变
        String str = "";
        Object obj;
        obj = str; // fu = zi = 协变

        List<Object> list1;
        List<String> list2 = new ArrayList<String>();
        // list1 = list2; // 因为List<Object> 不是 List<String>的父类，   因为这种情况下，默认禁止协变

        // list1 = list2 假设是可以的，会有什么问题？
        // list1.add(new Date());  我存入进去的是Date Object类型
        // String str = list2.get(0);  我取出来是 String 就会 出现类型转换不合理

        List<? extends Object> lists1; // 【? extends】 能够  List<Object> 接收  List<String>， 手动开启协变
        List<String> lists2 = new ArrayList<String>();
        lists1 = lists2;

        // 父类的引用List<父类>     接收     子类的对象List<子类> = 协变
        // 父类 接收 子类  合理   == 协作的变化    协变
        // 子类 接收 父类  不合理 == 逆行开车 逆向  逆变

        // TODO ================= 逆变
        List<Object> list3 = new ArrayList<Object>();
        // List<String> list2 = list1; // List<String>  无法接收 无法接纳  List<Object>，    默认禁止逆变

        List<? super String> list4 = list3; // 【? super 】 能够让我们 List<String>子引用 接收  List<Object>父类型
        // 逆变   Kotlin in
    }

    interface List1<E> {
        void addAll(List1<E> items);
    }

    void copyAll(List1<Object> to, List1<String> from) {
        // to = from; // 编译不通过： 因为 List1<String> 并不是 List1<Object> 的子类型
    }

    void copyAll2(List1<? extends Object> to, List1<String> from) { // ? extends 手动开启协变
        to = from;
    }

}