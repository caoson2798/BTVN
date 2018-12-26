package com.example.daiphongpc.gd3.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class InventoryItem implements Serializable {
    @SerializedName("IconFileName")
    @Expose
    public String iconFileName;
    @SerializedName("StallID")
    @Expose
    public String stallID;
    @SerializedName("EditMode")
    @Expose
    public Integer editMode;
    @SerializedName("InventoryItemCode")
    @Expose
    public String inventoryItemCode;
    @SerializedName("Color")
    @Expose
    public String color;
    @SerializedName("Price")
    @Expose
    public Integer price;
    @SerializedName("CreatedDate")
    @Expose
    public String createdDate;
    @SerializedName("UseCount")
    @Expose
    public Integer useCount;
    @SerializedName("InventoryItemType")
    @Expose
    public Integer inventoryItemType;
    @SerializedName("InventoryItemName")
    @Expose
    public String inventoryItemName;
    @SerializedName("Inactive")
    @Expose
    public Boolean inactive;
    @SerializedName("ModifiedBy")
    @Expose
    public String modifiedBy;
    @SerializedName("ModifiedDate")
    @Expose
    public String modifiedDate;
    @SerializedName("CreatedBy")
    @Expose
    public String createdBy;
    @SerializedName("UnitID")
    @Expose
    public String unitID;
    @SerializedName("IsGenerate")
    @Expose
    public Boolean isGenerate;
    @SerializedName("InventoryItemID")
    @Expose
    public String inventoryItemID;

    public String getIconFileName() {
        return iconFileName;
    }

    public void setIconFileName(String iconFileName) {
        this.iconFileName = iconFileName;
    }

    public String getStallID() {
        return stallID;
    }

    public void setStallID(String stallID) {
        this.stallID = stallID;
    }

    public Integer getEditMode() {
        return editMode;
    }

    public void setEditMode(Integer editMode) {
        this.editMode = editMode;
    }

    public String getInventoryItemCode() {
        return inventoryItemCode;
    }

    public void setInventoryItemCode(String inventoryItemCode) {
        this.inventoryItemCode = inventoryItemCode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Integer getInventoryItemType() {
        return inventoryItemType;
    }

    public void setInventoryItemType(Integer inventoryItemType) {
        this.inventoryItemType = inventoryItemType;
    }

    public String getInventoryItemName() {
        return inventoryItemName;
    }

    public void setInventoryItemName(String inventoryItemName) {
        this.inventoryItemName = inventoryItemName;
    }

    public Boolean getInactive() {
        return inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUnitID() {
        return unitID;
    }

    public void setUnitID(String unitID) {
        this.unitID = unitID;
    }

    public Boolean getGenerate() {
        return isGenerate;
    }

    public void setGenerate(Boolean generate) {
        isGenerate = generate;
    }

    public String getInventoryItemID() {
        return inventoryItemID;
    }

    public void setInventoryItemID(String inventoryItemID) {
        this.inventoryItemID = inventoryItemID;
    }
}
