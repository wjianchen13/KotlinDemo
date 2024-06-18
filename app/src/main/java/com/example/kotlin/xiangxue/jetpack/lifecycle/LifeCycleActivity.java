package com.example.kotlin.xiangxue.jetpack.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.example.kotlin.R;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        MyLocationListener myLocationListener = new MyLocationListener(this, new OnLocationChangeListener() {
            @Override
            public void onChanged(double latitude, double longitude) {
                //展示收到的位置信息
            }
        });

        //将观察者与被观察者绑定
        getLifecycle().addObserver(myLocationListener);

    }


    public class MyLocationListener  implements LifecycleObserver {
        public MyLocationListener(Activity context, OnLocationChangeListener listener) {

            //初始化操作
            iniLocationManager();
        }

        private void iniLocationManager() {
        }

        //当Activity执行onResume()方法时，该方法会被自动调用
        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public  void startGetLocation(){
            Log.e("true","onResume"+"被调用了");
        }

        //当Activity执行onPause()方法时，该方法会被自动调用
        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public  void stopGetLocation(){
            Log.e("true","onPause"+"被调用了");
        }

        //当Activity执行onDestroy()方法时，该方法会被自动调用
        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public  void delGetLocation(){
            Log.e("true","onDestroy"+"被调用了");
        }

    }

    //当地理位置发送改变时，通过该接口通知调用者
    public  interface  OnLocationChangeListener{
        void  onChanged(double latitude,double longitude);
    }
}