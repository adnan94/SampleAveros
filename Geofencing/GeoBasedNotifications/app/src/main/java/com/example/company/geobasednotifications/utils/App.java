package com.example.company.geobasednotifications.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class App extends Application {

    @SuppressLint ("StaticFieldLeak")
    private static Context context;

    public void onCreate() {
        super.onCreate();
        App.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return App.context;
    }
}
