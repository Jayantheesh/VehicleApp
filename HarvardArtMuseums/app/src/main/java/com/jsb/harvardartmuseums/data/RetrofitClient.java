package com.jsb.harvardartmuseums.data;

import com.jsb.harvardartmuseums.model.HarvardArtMuseums;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private Retrofit mClient;
    private static final String BASE_URL = "https://api.harvardartmuseums.org/";

    public RetrofitClient() {

        HttpLoggingInterceptor httploggin = new HttpLoggingInterceptor();
        httploggin.level(HttpLoggingInterceptor.Level.HEADERS);
        OkHttpClient.Builder builder = new OkHttpClient.Builder().addInterceptor(httploggin);

        mClient = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    void getImages(String query, IResponseCallback cb) {
        Call<HarvardArtMuseums>  response = mClient.create(IAPIService.class).getImages(query, "26a708e0-ab5d-11e9-a106-6fc0dc4365f5");
        response.enqueue(new APICallback(cb));
    }
}
