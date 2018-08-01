package com.example.dagger2;

import android.app.Application;

import com.example.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {PigModules.class,AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<App>{






    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(Application application);
        AppComponent build();
    }
}

