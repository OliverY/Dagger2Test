package com.yxj.dagger2test.component;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.yxj.dagger2test.App;
import com.yxj.dagger2test.customer.ApplicationContext;
import com.yxj.dagger2test.data.DbHelper;
import com.yxj.dagger2test.data.SharedPrefsHelper;
import com.yxj.dagger2test.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;

/**
 * Author:  Yxj
 * Time:    2018/7/4 上午11:20
 * -----------------------------------------
 * Description:
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App app);

    @ApplicationContext
    Context provideContext();

    Application provideApplication();

    DbHelper provideDbHelper();

    SharedPrefsHelper provideSharedPrefsHelper();

}
