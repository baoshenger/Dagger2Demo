package com.example.dagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.dagger.model.People;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    @Inject
    public People people;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }
}
