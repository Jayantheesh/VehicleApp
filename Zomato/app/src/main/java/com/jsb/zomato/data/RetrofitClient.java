package com.jsb.zomato.data;

import com.jsb.zomato.model.Zomato;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private Retrofit mClient;

    private static final String BASE_URL = "https://developers.zomato.com";

    public RetrofitClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder okhttp = new OkHttpClient.Builder().addInterceptor(interceptor);

        mClient = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okhttp.build())
                .build();
    }

    public void getEstablishments(String lat, String lon, String api_key, ResponseCallback cb) {
        Call<Zomato> response =  mClient.create(APIService.class).getEstablishment(lat, lon, api_key);
        response.enqueue(new ZomatoCallback(cb));

    }
}
