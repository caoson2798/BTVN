package com.example.daiphongpc.gd3.LTNetWork.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("user_name")
    @Expose
    public String userName;
}
