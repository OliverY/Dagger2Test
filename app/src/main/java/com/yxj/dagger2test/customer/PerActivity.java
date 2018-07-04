package com.yxj.dagger2test.customer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

/**
 * Author:  Yxj
 * Time:    2018/7/4 上午10:40
 * -----------------------------------------
 * Description:
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
