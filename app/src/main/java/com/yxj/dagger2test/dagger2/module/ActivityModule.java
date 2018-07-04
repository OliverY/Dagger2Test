package com.yxj.dagger2test.dagger2.module;

import android.app.Activity;
import android.content.Context;

import com.yxj.dagger2test.dagger2.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Author:  Yxj
 * Time:    2018/7/4 上午11:58
 * -----------------------------------------
 * Description:
 */

@Module
public class ActivityModule {

    Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    Activity provideActivity(){
        return activity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return activity;
    }

}
