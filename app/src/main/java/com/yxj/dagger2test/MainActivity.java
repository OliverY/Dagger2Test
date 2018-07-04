package com.yxj.dagger2test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.yxj.dagger2test.dagger2.component.ActivityComponent;
import com.yxj.dagger2test.dagger2.component.DaggerActivityComponent;
import com.yxj.dagger2test.dagger2.module.ActivityModule;
import com.yxj.dagger2test.data.DataManager;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DataManager dataManager;
    private ActivityComponent activityComponent;

    public ActivityComponent getActivityComponent() {
        if(activityComponent == null){
            activityComponent = DaggerActivityComponent
                    .builder()
                    .applicationComponent(App.get(this).getComponent())
                    .activityModule(new ActivityModule(this))
                    .build();
        }
        return activityComponent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(dataManager != null){
            Log.e("yxj","main:: not empty");
        }

        getActivityComponent().inject(this);
        Log.e("yxj","main::"+dataManager.toString());


    }

//    public ActivityComponent getActivityComponent(){
//
//    }


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}
