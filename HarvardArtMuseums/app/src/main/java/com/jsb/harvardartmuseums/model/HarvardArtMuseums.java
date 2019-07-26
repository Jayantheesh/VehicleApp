package com.jsb.harvardartmuseums.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HarvardArtMuseums {

    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("records")
    @Expose
    private List<Record> records = null;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

}
