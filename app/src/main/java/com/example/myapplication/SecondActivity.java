package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button telephone_button = (Button) findViewById(R.id.telephone_button);
        Button Screen_button = (Button) findViewById(R.id.Screen_button);
        Button Battery_button = (Button) findViewById(R.id.Battery_button);
        Button Sensors_button = (Button) findViewById(R.id.Sensors_button);

        telephone_button.setOnClickListener(this);
        Screen_button.setOnClickListener(this);
        Battery_button.setOnClickListener(this);
        Sensors_button.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId( )) {
            case R.id.telephone_button:
                i = new Intent(this,Telephone_Date.class );
                startActivity(i);
                break;
            case R.id.Screen_button:
                i = new Intent(this,Screen_Date.class );
                startActivity(i);
                break;
            case R.id.Battery_button:
                i = new Intent(this,Battery_Date.class );
                startActivity(i);
                break;
            case R.id.Sensors_button:
                i = new Intent(this,Sensors_date.class );
                startActivity(i);
                break;

    }

    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
       getMenuInflater().inflate(R.menu.menu,menu);
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case  R.id.action1:
                Intent i;
                i = new Intent(this,Info.class );
                startActivity(i);
    }
        return super.onOptionsItemSelected(item);
    }
    }
