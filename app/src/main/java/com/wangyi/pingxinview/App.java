package com.wangyi.pingxinview;

import android.app.Application;
import android.content.Context;
import android.os.Debug;
import android.os.Environment;
import android.util.Log;

import java.io.File;

public class App extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        File file = new File(Environment.getExternalStorageDirectory(), "app.trace");
        Debug.startMethodTracing(file.getAbsolutePath());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("SplashActivity", "App onCreate start");
        init();
        a();
        Log.d("SplashActivity", "App onCreate finish");
    }

    public void init() {
        test();
    }

    private void test() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void a() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
