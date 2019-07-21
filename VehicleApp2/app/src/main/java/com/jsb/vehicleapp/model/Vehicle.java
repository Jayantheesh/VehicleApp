package com.jsb.vehicleapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Vehicle {

    @SerializedName("Count")
    @Expose
    private Integer count;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("SearchCriteria")
    @Expose
    private Object searchCriteria;
    @SerializedName("Results")
    @Expose
    private List<Result> results = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(Object searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("count :" + count).append("message :" + message).append("searchCriteria :" + searchCriteria).append("results :" + results).toString();
    }

}
