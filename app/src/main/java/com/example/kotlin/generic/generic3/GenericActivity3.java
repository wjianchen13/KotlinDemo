package com.example.kotlin.generic.generic3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.derry.asdelegate.dsl_update.generic.simple3.obj.FuClass;
import com.derry.asdelegate.dsl_update.generic.simple3.obj.ZiClass;
import com.example.kotlin.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Kotlin 泛型协变和逆变
 */
public class GenericActivity3 extends AppCompatActivity {

    private TextView tvTitle  = null;

    FuClass fuClass = new FuClass();
    ZiClass ziClass = new ZiClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegate_test);
        tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText("Kotlin Kotlin 泛型协变和逆变");
    }

    public void onDelegateBase(View v) {
        // 开启协变后 作用一：可以接收更多的类型
        List<? extends FuClass> list = new ArrayList<ZiClass>(); // 协变解决

        // 由于是【生产者】

        // 只能获取 == 生产者
        FuClass fuClass = list.get(0);

        // 不能修改 == 不能消费
        /*list.add(fuClass);
        list.add(ziClass);*/


        // TODO =================================


        // 作用一：可以接收更多的类型
        List<? super ZiClass> list2 = new ArrayList<FuClass>(); // 逆变解决

        // 由于是 【消费者】

        // 不能获取 == 不能生产
        // ZiClass zi = list2.get(0);

        // 能修改 == 消费者
        list2.add(ziClass);
    }

    // TODO  ===================  协变
    private void insertToDataBase(List<? extends FuClass> lists) {
        // 协变：只能读取（能生产者）， 不能修改（不能消费）

        // 只能读取
        for (FuClass list : lists) {}
        FuClass fu = lists.get(0);

        // 你就不能修改人家，不能破坏人家传递进来的数据了
        /*lists.add(fuClass);
        lists.add(ziClass);*/
    }

    void test02() {
        List<ZiClass> ziClasses = new ArrayList<ZiClass>();
        insertToDataBase(ziClasses);
    }



    // TODO  ===================  逆变
    private void updateData(List<? super ZiClass> lists) {
        // 逆变：不能读取（不能生产者）， 能修改（能消费）

        // 只能读取
        /*for (ZiClass list : lists) {}
        ZiClass zi = lists.get(0);*/
        Object obj = lists.get(0); // 这个是不对的，特殊情况

        // 我可以修改你 能修改（能消费）
        lists.add(ziClass);
    }

    void test03() {
        List<FuClass> fuClasses = new ArrayList<FuClass>();
        updateData(fuClasses);
    }

}