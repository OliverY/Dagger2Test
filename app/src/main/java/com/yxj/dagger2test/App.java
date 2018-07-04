package com.yxj.dagger2test;

import android.app.Application;
import android.util.Log;

import com.yxj.dagger2test.component.ApplicationComponent;
import com.yxj.dagger2test.component.DaggerApplicationComponent;
import com.yxj.dagger2test.data.DataManager;
import com.yxj.dagger2test.module.ApplicationModule;

import javax.inject.Inject;

/**
 * Author:  Yxj
 * Time:    2018/7/4 上午11:01
 * -----------------------------------------
 * Description:
 */
public class App extends Application {

    @Inject
    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        ApplicationComponent applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);

        Log.e("yxj","dataManager::"+dataManager.toString());

    }
}
