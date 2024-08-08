package com.example.kotlin;

import android.app.Application;
import android.content.Context;

public class BaseApp extends Application {

    protected static BaseApp INSTANCE = null;

    public static BaseApp getInstance() {
        return INSTANCE;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        INSTANCE = this;
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        INSTANCE = this;
        super.onCreate();
    }
}