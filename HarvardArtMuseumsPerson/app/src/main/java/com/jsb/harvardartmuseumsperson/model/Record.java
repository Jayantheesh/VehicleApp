package com.jsb.harvardartmuseumsperson.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Record {

    @SerializedName("dateend")
    @Expose
    private Integer dateend;
    @SerializedName("alphasort")
    @Expose
    private String alphasort;
    @SerializedName("displaydate")
    @Expose
    private String displaydate;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("deathplace")
    @Expose
    private String deathplace;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("objectcount")
    @Expose
    private Integer objectcount;
    @SerializedName("lastupdate")
    @Expose
    private String lastupdate;
    @SerializedName("datebegin")
    @Expose
    private Integer datebegin;
    @SerializedName("birthplace")
    @Expose
    private String birthplace;
    @SerializedName("personid")
    @Expose
    private Integer personid;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("culture")
    @Expose
    private String culture;
    @SerializedName("displayname")
    @Expose
    private String displayname;

    public Integer getDateend() {
        return dateend;
    }

    public void setDateend(Integer dateend) {
        this.dateend = dateend;
    }

    public String getAlphasort() {
        return alphasort;
    }

    public void setAlphasort(String alphasort) {
        this.alphasort = alphasort;
    }

    public String getDisplaydate() {
        return displaydate;
    }

    public void setDisplaydate(String displaydate) {
        this.displaydate = displaydate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDeathplace() {
        return deathplace;
    }

    public void setDeathplace(String deathplace) {
        this.deathplace = deathplace;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getObjectcount() {
        return objectcount;
    }

    public void setObjectcount(Integer objectcount) {
        this.objectcount = objectcount;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getDatebegin() {
        return datebegin;
    }

    public void setDatebegin(Integer datebegin) {
        this.datebegin = datebegin;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

}
