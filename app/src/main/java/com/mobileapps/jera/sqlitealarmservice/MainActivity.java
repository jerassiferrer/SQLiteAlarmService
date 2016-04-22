package com.mobileapps.jera.sqlitealarmservice;


import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    static final int UPDATE_INTERVAL = 1000*60*60*2; /* 1 sec * 60*60*2 = 2 hours  */;
    private Timer timer = new Timer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }




}

