package com.light.libary.location;

/**
 * Created by 11449 on 2018/5/11.
 */

public  abstract class AbsLocation {

    protected GLocationListener  mLocationListener;

    public   void register(GLocationListener  locationListener){
        mLocationListener=locationListener;
        init();
    }

    public abstract  void  init();

    public abstract  void  start();

    public  abstract   void  stop();

    public  abstract   void  unRegister();










}
