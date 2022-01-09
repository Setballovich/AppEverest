package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class Screen_Date extends Activity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_screen_date);
        this.textView =(TextView)this.findViewById(R.id.textView4);
        DisplayMetrics metrics =new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        this.textView.append("\ndensityDpi: " + metrics.densityDpi);
        this.textView.append("\nscaledDensity: " + metrics.scaledDensity);
        this.textView.append("\nheightPixels: " + metrics.heightPixels);
        this.textView.append("\nwidthPixels: " + metrics.widthPixels);
        this.textView.append("\nxdpi: " + metrics.xdpi);
        this.textView.append("\nydpi: " + metrics.ydpi);

    }
}