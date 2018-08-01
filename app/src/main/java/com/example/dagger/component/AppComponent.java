package com.example.dagger.component;

import com.example.dagger.MainActivity;
import com.example.dagger.module.PeopleModule;
import com.example.dagger.module.UserModule;

import dagger.Component;

@Component(modules = {UserModule.class, PeopleModule.class})
public interface AppComponent {
    void  injectMainActivity(MainActivity mainActivity);
}
