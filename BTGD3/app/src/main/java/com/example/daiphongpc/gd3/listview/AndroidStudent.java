package com.example.daiphongpc.gd3.listview;

public class AndroidStudent {
    int id;
    String name,addr,phoneName;

    public AndroidStudent(int id, String name, String addr, String phoneName) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.phoneName = phoneName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
}
