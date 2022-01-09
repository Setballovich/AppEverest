package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class Telephone_Date extends Activity {
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telephone_date);
        textView = (TextView) this.findViewById(R.id.textView3);

        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        textView.append("\nCall state: " + TS.callState(tm.getCallState( )));
        textView.append("\nPhone type: " + TS.phoneType(tm.getPhoneType( )));
        textView.append("\nNetwork country ISO: " + tm.getNetworkCountryIso());
        textView.append("\nNetwork operator: " + tm.getNetworkOperator());
        textView.append("\nNetwork operator name: " + tm.getNetworkOperatorName());
        textView.append("\nData state: " + TS.dataState(tm.getDataState()));
        textView.append("\nData activity: " + TS.dataActivity(tm.getDataActivity()));
        textView.append("\nNetwork roaming: " + (tm.isNetworkRoaming() ? "true" : "false"));
        textView.append("\n\nSim state: " + TS.simState(tm.getSimState()));
        textView.append("\nSim country ISO: " + tm.getSimCountryIso());
        textView.append("\nSim operator: " + tm.getSimOperator());
        textView.append("\nSim operator name: " + tm.getSimOperatorName());
    }
}

