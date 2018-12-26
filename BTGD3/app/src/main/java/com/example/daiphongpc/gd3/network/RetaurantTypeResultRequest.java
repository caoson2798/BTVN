package com.example.daiphongpc.gd3.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RetaurantTypeResultRequest {
    @SerializedName("ErrorType")
    @Expose
    public Integer errorType;
    @SerializedName("Data")
    @Expose
    public ArrayList<RetaurantType> data = null;
    @SerializedName("Success")
    @Expose
    public Boolean success;

    public Integer getErrorType() {
        return errorType;
    }

    public void setErrorType(Integer errorType) {
        this.errorType = errorType;
    }

    public ArrayList<RetaurantType> getData() {
        return data;
    }

    public void setData(ArrayList<RetaurantType> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
