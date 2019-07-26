package com.jsb.harvardartmuseums.data;

import com.jsb.harvardartmuseums.model.HarvardArtMuseums;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IAPIService {

    @GET("image")
    Call<HarvardArtMuseums> getImages(@Query("q") String query, @Query("apikey") String auth);

}

