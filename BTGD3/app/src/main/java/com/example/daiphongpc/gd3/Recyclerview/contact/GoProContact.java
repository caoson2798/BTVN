package com.example.daiphongpc.gd3.Recyclerview.contact;

import java.io.Serializable;

public class GoProContact implements Serializable {
    private String name,addr;
    private int age;

    public GoProContact(String name, String addr, int age) {
        this.name = name;
        this.addr = addr;
        this.age = age;
    }

    public GoProContact() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
