package com.jsb.snagflims2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SnagFlims {

    @SerializedName("featured_shows")
    @Expose
    private List<FeaturedShow> featuredShows = null;

    public List<FeaturedShow> getFeaturedShows() {
        return featuredShows;
    }

    public void setFeaturedShows(List<FeaturedShow> featuredShows) {
        this.featuredShows = featuredShows;
    }

}
