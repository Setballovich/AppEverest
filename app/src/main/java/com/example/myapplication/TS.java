package com.example.myapplication;

import android.os.BatteryManager;
import android.telephony.TelephonyManager;

public class TS {

        public static String callState(Integer state) {
            switch (state) {
                case TelephonyManager.CALL_STATE_IDLE:
                    return "IDLE";
                case TelephonyManager.CALL_STATE_OFFHOOK:
                    return "OFFHOOK";
                case TelephonyManager.CALL_STATE_RINGING:
                    return "RINGING";
                default:
                    return "UNDEFINED";
            }
        }

        public static String phoneType(Integer type) {
            switch (type) {
                case TelephonyManager.PHONE_TYPE_CDMA:
                    return "CDMA";
                case TelephonyManager.PHONE_TYPE_GSM:
                    return "GSM";
                case TelephonyManager.PHONE_TYPE_NONE:
                    return "NONE";
                default:
                    return "UNDEFINED";
            }
        }

        public static String dataState(Integer state) {
            switch (state) {
                case TelephonyManager.DATA_DISCONNECTED:
                    return "DISCONNECTED";
                case TelephonyManager.DATA_CONNECTING:
                    return "CONNECTING";
                case TelephonyManager.DATA_CONNECTED:
                    return "CONNECTED";
                case TelephonyManager.DATA_SUSPENDED:
                    return "SUSPENDED";
                default:
                    return "UNDEFINED";
            }
        }
    public static String dataActivity(Integer act) {
        switch (act) {
            case TelephonyManager.DATA_ACTIVITY_NONE:
                return "NONE";
            case TelephonyManager.DATA_ACTIVITY_IN:
                return "IN";
            case TelephonyManager.DATA_ACTIVITY_OUT:
                return "OUT";
            case TelephonyManager.DATA_ACTIVITY_INOUT:
                return "INOUT";
            case TelephonyManager.DATA_ACTIVITY_DORMANT:
                return "DORMANT";
            default:
                return "UNDEFINED";
        }
    }

    public static String simState(Integer state) {
        switch (state) {
            case TelephonyManager.SIM_STATE_UNKNOWN:
                return "UNKNOWN";
            case TelephonyManager.SIM_STATE_ABSENT:
                return "ABSENT";
            case TelephonyManager.SIM_STATE_PIN_REQUIRED:
                return "PIN REQUIRED";
            case TelephonyManager.SIM_STATE_PUK_REQUIRED:
                return "PUK REQUIRED";
            case TelephonyManager.SIM_STATE_NETWORK_LOCKED:
                return "NETWORK LOCKED";
            case TelephonyManager.SIM_STATE_READY:
                return "READY";
            default:
                return "UNDEFINED";

        }
    }
    public static String batteryHealth(int health) {
        switch (health) {
            case BatteryManager.BATTERY_HEALTH_DEAD:
                return "DEAD";
            case BatteryManager.BATTERY_HEALTH_GOOD:
                return "GOOD";
            case BatteryManager.BATTERY_HEALTH_OVERHEAT:
                return "OVERHEAT";
            case BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE:
                return "OVER VOLTAGE";
            case BatteryManager.BATTERY_HEALTH_UNKNOWN:
                return "UNKNOWN";
            case BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE:
                return "UNSPECIFIED FAILURE";
            default:
                return "UNDEFINED";

        }
    }
    public static String batteryPlugged (Integer plug) {
        switch (plug) {
            case BatteryManager.BATTERY_PLUGGED_AC:
                return "AC";
            case BatteryManager.BATTERY_PLUGGED_USB:
                return "USB";
            default:
                return "UNDEFINED";
        }
    }
    public static String batteryStatus (Integer status) {
        switch (status) {
            case BatteryManager.BATTERY_STATUS_CHARGING:
                return "CHARGING";
            case BatteryManager.BATTERY_STATUS_DISCHARGING:
                return "DISCHARGING";
            case BatteryManager.BATTERY_STATUS_FULL:
                return "FULL";
            case BatteryManager.BATTERY_STATUS_NOT_CHARGING:
                return "NOT CHARGING";
            case BatteryManager.BATTERY_STATUS_UNKNOWN:
                return "UNKNOWN";
            default:
                return "UNDEFINED";
        }
    }

}
