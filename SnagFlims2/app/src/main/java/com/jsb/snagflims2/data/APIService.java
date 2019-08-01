package com.jsb.snagflims2.data;

import com.jsb.snagflims2.model.SnagFlims;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("/apis/android/featured/shows.json")
    Call<SnagFlims> getMovies(@Query("site") String query);
}
