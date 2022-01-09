package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private void showSecondActivityWithDelay() {
        Handler handler = new Handler( );
        handler.postDelayed(() -> startActivity(new Intent(MainActivity.this, SecondActivity.class)), 2000);
    }

    @Override
    protected void onStart() {
        super.onStart( );
        showSecondActivityWithDelay( );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}