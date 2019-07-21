package com.jsb.vehicleapp.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("Make_ID")
    @Expose
    private Integer makeID;
    @SerializedName("Make_Name")
    @Expose
    private String makeName;

    public Integer getMakeID() {
        return makeID;
    }

    public void setMakeID(Integer makeID) {
        this.makeID = makeID;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("makeID : " + makeID).append("makeName " + makeID).toString();
    }
}