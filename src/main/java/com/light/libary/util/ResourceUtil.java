package com.light.libary.util;

import android.content.Context;

/**
 * Created by 11449 on 2018/5/11.
 * 读取资源ID  如果支持Eclipse  ，因为elipse 不支持 aer  故 一定要反射读取资源
 */

public class ResourceUtil {
    public static int getLayoutId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "layout",
                paramContext.getPackageName());
    }

    public static int getStringId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "string",
                paramContext.getPackageName());
    }
    public static String getStrByRes(Context context, String key){
        return context.getString(context.getResources().getIdentifier(key, "string",
                context.getPackageName()));
    }
    public static String getStrByRes(Context context, String key, Object...formatArgs){
        return context.getString(context.getResources().getIdentifier(key, "string",
                context.getPackageName()), formatArgs);
    }

    public static int getDrawableId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "drawable", paramContext.getPackageName());
    }

    public static int getStyleId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "style",
                paramContext.getPackageName());
    }

    public static int getId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "id",
                paramContext.getPackageName());
    }

    public static int getColorId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "color",
                paramContext.getPackageName());
    }

    public static int getDimenId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "dimen",
                paramContext.getPackageName());
    }

    public static int getAnimId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "anim",
                paramContext.getPackageName());
    }



}
