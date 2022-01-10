package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class Sensors_date extends AppCompatActivity implements SensorEventListener {
    private static final String TAG = "Light_sensor";

    public SensorManager sensorManager;

    public Sensor accelerometr,mGyro,mMagno,mLight,mPressure,mTemp,mHumi;


    TextView xValue,yValue,zValue,xGyroValue,yGyroValue,zGyroValue, xMagnoValue, yMagnoValue,zMagnoValue,light,pressure,temp,humi;

    @Override
    protected void onCreate (Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_sensors_date);

        xValue = (TextView) findViewById(R.id.xValue);
        yValue = (TextView) findViewById(R.id.yValue);
        zValue = (TextView) findViewById(R.id.zValue);

        xGyroValue = (TextView) findViewById(R.id.xGyroValue);
        yGyroValue = (TextView) findViewById(R.id.yGyroValue);
        zGyroValue = (TextView) findViewById(R.id.zGyroValue);

        xMagnoValue = (TextView) findViewById(R.id.xMagnoValue);
        yMagnoValue = (TextView) findViewById(R.id.yMagnoValue);
        zMagnoValue = (TextView) findViewById(R.id.zMagnoValue);

        light = (TextView) findViewById(R.id.light);
        pressure = (TextView) findViewById(R.id.pressure);
        temp = (TextView) findViewById(R.id.temp);
        humi = (TextView) findViewById(R.id.humi);

        Log.d(TAG, "onCreate: Initializing Sensor Services");
        sensorManager = (SensorManager) getSystemService((Context.SENSOR_SERVICE));

        accelerometr = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if (accelerometr !=null) {
            sensorManager.registerListener(Sensors_date.this,accelerometr,SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Registered accelerometer listener");
        }else {
            xValue.setText(R.string.x);
            yValue.setText(R.string.y);
            zValue.setText(R.string.z);

        }

        mGyro = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        if (mGyro !=null) {
            sensorManager.registerListener(Sensors_date.this,mGyro,SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Registered Gyro listener");
        }else {
            xGyroValue.setText(R.string.xGyro);
            yGyroValue.setText(R.string.yGyro);
            zGyroValue.setText(R.string.zGyro);
        }

        mMagno = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        if (mMagno !=null) {
            sensorManager.registerListener(Sensors_date.this,mMagno,SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Registered Magnometer listener");
        }else {
            xMagnoValue.setText(R.string.xMagno);
            yMagnoValue.setText(R.string.yMagno);
            zMagnoValue.setText(R.string.zMagno);
        }

        mLight = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        if (mLight !=null) {
            sensorManager.registerListener(Sensors_date.this,mLight,SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Registered light listener");
        }else {
            light.setText(R.string.Light);
        }

        mPressure = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        if (mPressure !=null) {
            sensorManager.registerListener(Sensors_date.this,mPressure,SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Registered Pressure listener");
        }else {
            pressure.setText(R.string.pressure);
        }

        mTemp = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
        if (mTemp !=null) {
            sensorManager.registerListener(Sensors_date.this,mTemp,SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Registered Temp listener");
        }else {
            temp.setText(R.string.temp);
        }

        mHumi = sensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY);
        if (mHumi !=null) {
            sensorManager.registerListener(Sensors_date.this,mHumi,SensorManager.SENSOR_DELAY_NORMAL);
            Log.d(TAG, "onCreate: Registered Humi listener");
        }else {
            humi.setText(R.string.humi);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor = sensorEvent.sensor;
        if (sensor.getType( ) == Sensor.TYPE_ACCELEROMETER) {
            Log.d(TAG, "OnSensorChanged: X: " + sensorEvent.values[0] + "Y: " + sensorEvent.values[1] + "Z: " + sensorEvent.values[2]);

            xValue.setText("xValue " + sensorEvent.values[0]);
            yValue.setText("yValue " + sensorEvent.values[1]);
            zValue.setText("zValue " + sensorEvent.values[2]);
        } else if (sensor.getType()== Sensor.TYPE_GYROSCOPE) {
            xGyroValue.setText("xGValue " + sensorEvent.values[0]);
            yGyroValue.setText("yGValue " + sensorEvent.values[1]);
            zGyroValue.setText("zGValue " + sensorEvent.values[2]);
        } else if (sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD) {
            xMagnoValue.setText("xMValue " + sensorEvent.values[0]);
            yMagnoValue.setText("yMValue " + sensorEvent.values[1]);
            zMagnoValue.setText("zMValue " + sensorEvent.values[2]);
        }else if(sensor.getType() == Sensor.TYPE_LIGHT) {
            light.setText("Light: " + sensorEvent.values[0]);
        }else if(sensor.getType() == Sensor.TYPE_PRESSURE) {
            pressure.setText("Pressure: " + sensorEvent.values[0]);
        }else if (sensor.getType() == Sensor.TYPE_AMBIENT_TEMPERATURE) {
            temp.setText("Temp: " + sensorEvent.values[0]);
        }else if (sensor.getType() == Sensor.TYPE_RELATIVE_HUMIDITY) {
            humi.setText("Humidity: " + sensorEvent.values[0]);
        }

    }
}

