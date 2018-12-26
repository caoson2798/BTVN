package com.example.daiphongpc.gd3.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetaurantType {
    @SerializedName("SortOrder")
    @Expose
    public Integer sortOrder;
    @SerializedName("RestaurantType")
    @Expose
    public Integer restaurantType;
    @SerializedName("RestaurantTypeName")
    @Expose
    public String restaurantTypeName;
    @SerializedName("RestaurantTypeID")
    @Expose
    public String restaurantTypeID;
    @SerializedName("Description")
    @Expose
    public String description;

    boolean tick;

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(Integer restaurantType) {
        this.restaurantType = restaurantType;
    }

    public String getRestaurantTypeName() {
        return restaurantTypeName;
    }

    public void setRestaurantTypeName(String restaurantTypeName) {
        this.restaurantTypeName = restaurantTypeName;
    }

    public String getRestaurantTypeID() {
        return restaurantTypeID;
    }

    public void setRestaurantTypeID(String restaurantTypeID) {
        this.restaurantTypeID = restaurantTypeID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTick() {
        return tick;
    }

    public void setTick(boolean tick) {
        this.tick = tick;
    }
}
