package com.atu.componentdemo.app;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.atu.baseres.BuildConfig;

/**
 * Created by atu on 2017/12/4.
 */

public class MainApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }

        ARouter.init(this);
    }
}
