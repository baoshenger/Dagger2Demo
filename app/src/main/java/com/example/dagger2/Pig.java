package com.example.dagger2;


import javax.inject.Inject;


public class Pig {
    public String name;

    @Inject
    public Pig(String name) {
        this.name = name;
    }
}
