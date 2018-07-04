package com.yxj.dagger2test.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.yxj.dagger2test.customer.ApplicationContext;
import com.yxj.dagger2test.data.DbHelper;
import com.yxj.dagger2test.data.SharedPrefsHelper;

import dagger.Module;
import dagger.Provides;

/**
 * Author:  Yxj
 * Time:    2018/7/4 上午11:12
 * -----------------------------------------
 * Description:
 */
@Module
public class ApplicationModule {

    /*
    1.提供Context
    2.提供DbHelper
    3.提供SharedPrefsHelper
     */

    Application application;

    public ApplicationModule(Application context) {
        this.application = context;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return application;
    }

    @Provides
    Application provideApplication(){
        return application;
    }

    @Provides
    DbHelper provideDbHelper(){
        return new DbHelper(application,"demo-dagger.db",1);
    }

    @Provides
    SharedPrefsHelper provideSharedPrefsHelper(){
        SharedPreferences sp = application.getSharedPreferences("demo-prefs",Context.MODE_PRIVATE);
        return new SharedPrefsHelper(sp);
    }


}
