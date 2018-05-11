package com.light.libary.util;

import android.util.Log;

import com.example.glibrary.BuildConfig;

/**
 * Created by 11449 on 2018/5/11.
 */
public class GLog {
    private static Boolean isDeBug = true;
    private static final  String GTAG="light_easy_car";

    public  static  boolean getIsDeubg(){
        return BuildConfig.DEBUG;
    }
    public static void i(String tag ,String msg){
        if(getIsDeubg())
            Log.i(GTAG+tag, msg);
    }

    public static void w(String tag ,String msg){
        if(getIsDeubg())
            Log.w(GTAG+tag, msg);
    }

    public static void e(String tag ,String msg){
        if(getIsDeubg())
            Log.e(GTAG+tag, msg);
    }

    public static void d(String tag ,String msg){
        if(getIsDeubg())
            Log.d(GTAG+tag, msg);
    }

    public static void i(String msg){
        if(isDeBug)
            Log.i(GTAG, msg);
    }

    public static void w(String msg){
        if(isDeBug)
            Log.w(GTAG, msg);
    }

    public static void e(String msg){
        if(isDeBug)
            Log.e(GTAG, msg);
    }

    public static void d(String msg){
        if(isDeBug)
            Log.d(GTAG, msg);
    }




}
