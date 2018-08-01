package com.example.dagger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dagger.model.User;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    private Toolbar toolbar;
    private TextView tv_name;
    private FloatingActionButton fab;
    private TextView tv_pepple;

    @Inject
    User user;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        App.getComponent().injectMainActivity(this);


    }

    private void onFabClick() {


        if (user != null) {

            tv_name.setText(user.toString());
        } else {
            Toast.makeText(getApplicationContext(), "没有成功", Toast.LENGTH_LONG).show();
        }


        if (people != null) {

            tv_pepple.setText(people.toString() + "____");
        }
    }


    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tv_name = (TextView) findViewById(R.id.tv_name);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);
        setSupportActionBar(toolbar);
        fab = (FloatingActionButton) findViewById(R.id.fab);


        tv_pepple = (TextView) findViewById(R.id.tv_pepple);
        tv_pepple.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                onFabClick();
                break;
        }
    }
}
