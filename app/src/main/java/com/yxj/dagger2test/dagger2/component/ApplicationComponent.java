package com.yxj.dagger2test.dagger2.component;

import android.app.Application;
import android.content.Context;

import com.yxj.dagger2test.App;
import com.yxj.dagger2test.dagger2.ApplicationContext;
import com.yxj.dagger2test.dagger2.module.ApplicationModule;
import com.yxj.dagger2test.data.DataManager;
import com.yxj.dagger2test.data.DbHelper;
import com.yxj.dagger2test.data.SharedPrefsHelper;

import javax.inject.Singleton;

import dagger.Component;

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

//    @ApplicationContext
//    Context provideContext();
//
//    Application provideApplication();
//
//    DbHelper provideDbHelper();
//
//    SharedPrefsHelper provideSharedPrefsHelper();

    DataManager getDataManager();

}
