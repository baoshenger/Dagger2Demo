package com.example.dagger;

import android.app.Application;

import com.example.dagger.component.AppComponent;
import com.example.dagger.component.DaggerAppComponent;

public class App extends Application {

    public static AppComponent getComponent() {
        return component;
    }

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();

    }


}
