package com.example.daiphongpc.gd3;

import android.util.Log;

public class Student {
    String name;
    int age;
    String addr;
    public static String TAG="ktsv";
    public Student(){

    }

    public Student(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
    void getStudentInf(){
        Log.d(TAG,this.name);
        Log.d(TAG,String.valueOf(this.age));
        Log.d(TAG,this.addr);
    }
}
