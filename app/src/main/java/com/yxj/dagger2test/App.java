package com.yxj.dagger2test;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.yxj.dagger2test.dagger2.component.ApplicationComponent;
import com.yxj.dagger2test.dagger2.component.DaggerApplicationComponent;
import com.yxj.dagger2test.data.DataManager;
import com.yxj.dagger2test.dagger2.module.ApplicationModule;

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
    private ApplicationComponent applicationComponent;

    public static App get(Context context){
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);

        Log.e("yxj","dataManager::"+dataManager.toString());

    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
