package com.example.daiphongpc.gd3.LTNetWork.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GetDetailProc {

    @SerializedName("status")
    @Expose
    public Integer status;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("data")
    @Expose
    public ArrayList<ArrayDetailProc> data = null;


}
