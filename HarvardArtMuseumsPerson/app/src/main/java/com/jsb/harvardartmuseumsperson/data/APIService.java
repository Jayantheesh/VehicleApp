package com.jsb.harvardartmuseumsperson.data;

import com.jsb.harvardartmuseumsperson.model.Person;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("person")
    Call<Person> getPersonList(@Query("q") String q, @Query("apikey") String key, @Query("page") String page);
}
