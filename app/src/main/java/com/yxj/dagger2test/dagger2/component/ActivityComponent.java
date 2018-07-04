package com.yxj.dagger2test.dagger2.component;

import com.yxj.dagger2test.MainActivity;
import com.yxj.dagger2test.dagger2.PerActivity;
import com.yxj.dagger2test.dagger2.module.ActivityModule;

import dagger.Component;

/**
 * Author:  Yxj
 * Time:    2018/7/4 下午12:01
 * -----------------------------------------
 * Description:
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
