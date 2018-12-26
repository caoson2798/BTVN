package com.example.daiphongpc.gd3.network.BtRetrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class DataShoes {
    @SerializedName("status")
    @Expose
    public int status;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("data")
    @Expose
    public ArrayList<ListShoes> data;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<ListShoes> getData() {
        return data;
    }

    public void setData(ArrayList<ListShoes> data) {
        this.data = data;
    }
}
