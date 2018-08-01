package com.example;

import com.example.dagger.component.DaggerMyAppComponent;
import com.example.dagger.component.MyAppComponent;
import com.example.dagger2.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class App extends DaggerApplication {

    public static MyAppComponent getComponent() {
        return component;
    }
    private static MyAppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerMyAppComponent.create();

    }


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
