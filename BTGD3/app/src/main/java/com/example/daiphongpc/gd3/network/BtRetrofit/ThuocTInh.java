package com.example.daiphongpc.gd3.network.BtRetrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThuocTInh {
    @SerializedName("attributeName")
    @Expose
    public String attributeName;
    @SerializedName("attributeValue")
    @Expose
    public String attributeValue;
    @SerializedName("productId")
    @Expose
    public Integer productId;

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
