package com.example.daiphongpc.gd3.LTNetWork.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArrayDetailProc {
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("product_id")
    @Expose
    public Integer productId;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("remain")
    @Expose
    public Integer remain;
    @SerializedName("images")
    @Expose
    public String images;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("price")
    @Expose
    public Integer price;
}
