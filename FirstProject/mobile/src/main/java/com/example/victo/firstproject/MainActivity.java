package com.example.victo.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final String STATE = "State";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(STATE,"e-onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e(STATE,"e-OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e(STATE,"e-onResume");

    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.e(STATE,"e-onPause");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e(STATE,"e-onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(STATE,"e-onDestroy");
    }

}

