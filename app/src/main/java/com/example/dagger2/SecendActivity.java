package com.example.dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.BaseActivity;
import com.example.dagger.R;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;


public class SecendActivity extends DaggerAppCompatActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private TextView tv_name;
    private TextView tv_pepple;
    private FloatingActionButton fab;


    @Inject
    Pig pig;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_pepple = (TextView) findViewById(R.id.tv_pepple);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:

                if (pig!=null){
                    tv_name.setText(pig.name);
                }else {
                    tv_name.setText("猪");
                }

                break;
        }
    }
}
