package com.example.daiphongpc.gd3.network.BtRetrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SanPham {
    @SerializedName("isActive")
    @Expose
    public Boolean isActive;
    @SerializedName("retailerId")
    @Expose
    public Integer retailerId;
    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("weight")
    @Expose
    public Integer weight;
    @SerializedName("hasVariants")
    @Expose
    public Boolean hasVariants;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("basePrice")
    @Expose
    public Integer basePrice;
    @SerializedName("categoryId")
    @Expose
    public Integer categoryId;
    @SerializedName("images")
    @Expose
    public ArrayList<String> images = null;
    @SerializedName("allowsSale")
    @Expose
    public Boolean allowsSale;
    @SerializedName("modifiedDate")
    @Expose
    public String modifiedDate;
    @SerializedName("createdDate")
    @Expose
    public String createdDate;
    @SerializedName("isRewardPoint")
    @Expose
    public Boolean isRewardPoint;
    @SerializedName("attributes")
    @Expose
    public ArrayList<ThuocTInh> attributes = null;
    @SerializedName("fullName")
    @Expose
    public String fullName;
    @SerializedName("inventories")
    @Expose
    public ArrayList<BangTomTat> inventories = null;
    @SerializedName("conversionValue")
    @Expose
    public Integer conversionValue;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("unit")
    @Expose
    public String unit;
    @SerializedName("categoryName")
    @Expose
    public String categoryName;

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(Integer retailerId) {
        this.retailerId = retailerId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getHasVariants() {
        return hasVariants;
    }

    public void setHasVariants(Boolean hasVariants) {
        this.hasVariants = hasVariants;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public Boolean getAllowsSale() {
        return allowsSale;
    }

    public void setAllowsSale(Boolean allowsSale) {
        this.allowsSale = allowsSale;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getRewardPoint() {
        return isRewardPoint;
    }

    public void setRewardPoint(Boolean rewardPoint) {
        isRewardPoint = rewardPoint;
    }

    public ArrayList<ThuocTInh> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<ThuocTInh> attributes) {
        this.attributes = attributes;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<BangTomTat> getInventories() {
        return inventories;
    }

    public void setInventories(ArrayList<BangTomTat> inventories) {
        this.inventories = inventories;
    }

    public Integer getConversionValue() {
        return conversionValue;
    }

    public void setConversionValue(Integer conversionValue) {
        this.conversionValue = conversionValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
