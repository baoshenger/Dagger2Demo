package com.example.dagger.module;

import com.example.dagger.model.User;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    User providesUser(){
        return  new User();
    }




}
