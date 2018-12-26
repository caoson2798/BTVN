package com.example.daiphongpc.gd3.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ThucDon {
    @SerializedName("ListInventoryItem")
    @Expose
    public ArrayList<InventoryItem> listInventoryItem = null;
    @SerializedName("ListUnit")
    @Expose
    public ArrayList<Unit> listUnit = null;
    @SerializedName("ErrorType")
    @Expose
    public Integer errorType;
    @SerializedName("Success")
    @Expose
    public Boolean success;
}
