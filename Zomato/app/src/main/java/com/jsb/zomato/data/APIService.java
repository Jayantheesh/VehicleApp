package com.jsb.zomato.data;

import com.jsb.zomato.model.Zomato;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface APIService {

    @GET("/api/v2.1/establishments")
    Call<Zomato> getEstablishment(@Query("lat") String lat,
                                  @Query("lon") String lon,
                                  @Header("user-key") String api_key);
}
