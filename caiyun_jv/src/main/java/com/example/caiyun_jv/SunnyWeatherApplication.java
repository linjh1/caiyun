package com.example.caiyun_jv;

import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {
    private String TOKEN = "3BCNQScPUNuv3Bh8";
    private Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
}
