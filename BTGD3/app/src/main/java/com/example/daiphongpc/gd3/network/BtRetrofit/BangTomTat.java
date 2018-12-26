package com.example.daiphongpc.gd3.network.BtRetrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BangTomTat {
    @SerializedName("reserved")
    @Expose
    public Integer reserved;
    @SerializedName("branchId")
    @Expose
    public Integer branchId;
    @SerializedName("cost")
    @Expose
    public Integer cost;
    @SerializedName("onHand")
    @Expose
    public Integer onHand;
    @SerializedName("branchName")
    @Expose
    public String branchName;
    @SerializedName("productId")
    @Expose
    public Integer productId;

    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getOnHand() {
        return onHand;
    }

    public void setOnHand(Integer onHand) {
        this.onHand = onHand;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
