package com.jsb.harvardartmuseums.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Record {

    @SerializedName("iiifbaseuri")
    @Expose
    private String iiifbaseuri;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("caption")
    @Expose
    private Object caption;
    @SerializedName("fileid")
    @Expose
    private Integer fileid;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("imageid")
    @Expose
    private Integer imageid;
    @SerializedName("renditionnumber")
    @Expose
    private String renditionnumber;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("lastupdate")
    @Expose
    private String lastupdate;
    @SerializedName("accesslevel")
    @Expose
    private Integer accesslevel;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("baseimageurl")
    @Expose
    private String baseimageurl;
    @SerializedName("idsid")
    @Expose
    private Integer idsid;

    public String getIiifbaseuri() {
        return iiifbaseuri;
    }

    public void setIiifbaseuri(String iiifbaseuri) {
        this.iiifbaseuri = iiifbaseuri;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Object getCaption() {
        return caption;
    }

    public void setCaption(Object caption) {
        this.caption = caption;
    }

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public String getRenditionnumber() {
        return renditionnumber;
    }

    public void setRenditionnumber(String renditionnumber) {
        this.renditionnumber = renditionnumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getAccesslevel() {
        return accesslevel;
    }

    public void setAccesslevel(Integer accesslevel) {
        this.accesslevel = accesslevel;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getBaseimageurl() {
        return baseimageurl;
    }

    public void setBaseimageurl(String baseimageurl) {
        this.baseimageurl = baseimageurl;
    }

    public Integer getIdsid() {
        return idsid;
    }

    public void setIdsid(Integer idsid) {
        this.idsid = idsid;
    }

}