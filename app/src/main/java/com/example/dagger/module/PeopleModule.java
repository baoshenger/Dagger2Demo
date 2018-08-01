package com.example.dagger.module;


import com.example.dagger.model.People;

import dagger.Module;
import dagger.Provides;

@Module
public class PeopleModule {

    @Provides
    People providesPeople(){
       // return   new People("张三","18");
        return   new People("张三","18");
    }
}
