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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public static String getTAG() {
        return TAG;
    }

    public static void setTAG(String TAG) {
        Student.TAG = TAG;
    }

    void getStudentInf(){
        Log.d(TAG,this.name);
        Log.d(TAG,String.valueOf(this.age));
        Log.d(TAG,this.addr);
    }
}
