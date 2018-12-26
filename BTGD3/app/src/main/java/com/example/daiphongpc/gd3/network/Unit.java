package com.example.daiphongpc.gd3.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Unit implements Serializable {
    @SerializedName("StallID")
    @Expose
    public String stallID;
    @SerializedName("Description")
    @Expose
    public String description;
    @SerializedName("UnitName")
    @Expose
    public String unitName;
    @SerializedName("IsGenerate")
    @Expose
    public Boolean isGenerate;
    @SerializedName("Inactive")
    @Expose
    public Boolean inactive;
    @SerializedName("UnitID")
    @Expose
    public String unitID;
    @SerializedName("EditMode")
    @Expose
    public Integer editMode;

    public String getStallID() {
        return stallID;
    }

    public void setStallID(String stallID) {
        this.stallID = stallID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Boolean getGenerate() {
        return isGenerate;
    }

    public void setGenerate(Boolean generate) {
        isGenerate = generate;
    }

    public Boolean getInactive() {
        return inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    public String getUnitID() {
        return unitID;
    }

    public void setUnitID(String unitID) {
        this.unitID = unitID;
    }

    public Integer getEditMode() {
        return editMode;
    }

    public void setEditMode(Integer editMode) {
        this.editMode = editMode;
    }
}
