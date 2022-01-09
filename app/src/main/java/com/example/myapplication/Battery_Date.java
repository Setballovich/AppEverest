package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class Battery_Date extends Activity {
    TextView textView;

    public Battery_Date() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_date);
        this.textView = this.findViewById(R.id.textView5);
        BroadcastReceiver receiver = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                Battery_Date.this.textView.setText("");
                Battery_Date.this.textView.append("\nMax scale: " + intent.getIntExtra("scale", -1));
                Battery_Date.this.textView.append("\nCurrent scale: " + intent.getIntExtra("level", -1));
                Battery_Date.this.textView.append("\nTemperature: " + intent.getIntExtra("temperature", -1));
                Battery_Date.this.textView.append("\nVoltage: " + intent.getIntExtra("voltage", -1));
                Battery_Date.this.textView.append("\nTechnology: " + intent.getStringExtra("technology"));
                Battery_Date.this.textView.append("\nHealth: " + TS.batteryHealth(intent.getIntExtra("health", -1)));
                Battery_Date.this.textView.append("\nStatus: " + TS.batteryStatus(intent.getIntExtra("status", -1)));
                Battery_Date.this.textView.append("\nPlugged: " + TS.batteryPlugged(intent.getIntExtra("plugged", -1)));
            }
        };
        this.registerReceiver(receiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }
}

