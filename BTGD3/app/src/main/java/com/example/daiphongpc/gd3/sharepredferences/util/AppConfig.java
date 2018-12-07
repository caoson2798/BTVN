package com.example.daiphongpc.gd3.sharepredferences.util;


import android.content.Context;
import android.content.SharedPreferences;

public class AppConfig {

    public static SharedPreferences.Editor getEditor(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("son", Context.MODE_PRIVATE);
        return sharedPreferences.edit();
    }

    public static void setUserName(String userName, Context context) {
        getEditor(context).putString("userName", userName).apply();
    }

    public static String getUserName(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("son", Context.MODE_PRIVATE);
        return sharedPreferences.getString("userName", "");
    }

    public static void setPass(String pass, Context context) {
        getEditor(context).putString("pass", pass).apply();
    }

    public static String getPass(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("son", Context.MODE_PRIVATE);
        return sharedPreferences.getString("pass", "");
    }

    public static void setKeepLogin(Boolean isKeepLogin, Context context) {
        getEditor(context).putBoolean("is_keep_login", isKeepLogin).apply();
    }

    public static Boolean getKeepLogin(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("son", Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("is_keep_login", false);
    }


}

