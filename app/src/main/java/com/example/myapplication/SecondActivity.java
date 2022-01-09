package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button telephone_button = (Button) findViewById(R.id.telephone_button);
        telephone_button.setOnClickListener(this);
        Button Screen_button = (Button) findViewById(R.id.Screen_button);
        telephone_button.setOnClickListener(this);
        Button Battery_button = (Button) findViewById(R.id.Battery_button);
        telephone_button.setOnClickListener(this);
        Button Sensors_button = (Button) findViewById(R.id.Sensors_button);
        telephone_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, Telephone_Date.class);
        startActivity(i);
    }

    public void onClick2(View view) {
        Intent i;
        i = new Intent(this, Screen_Date.class);
        startActivity(i);
    }

    public void onClick3(View view) {
        Intent i;
        i = new Intent(this, Battery_Date.class);
        startActivity(i);
    }

    public void onClick4(View view) {
        Intent i;
        i = new Intent(this, Sensors_date.class);
        startActivity(i);
    }
}