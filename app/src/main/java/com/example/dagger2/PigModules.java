package com.example.dagger2;


import dagger.Module;
import dagger.Provides;

@Module
public  class PigModules {






    @Provides
    Pig getpig(String name){
        return  new Pig("小猪");
    }



}
