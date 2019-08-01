package com.jsb.snagflims2.data;

import com.jsb.snagflims2.model.SnagFlims;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private Retrofit mClient;
    private String BASE_URL = "https://www.snagfilms.com";

    public RetrofitClient() {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.level(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addInterceptor(interceptor);

            mClient = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .client(builder.build()).build();
    }

    public void getMovies(String query, ResponseCallback cb) {
        Call<SnagFlims> response = mClient.create(APIService.class).getMovies(query);
        response.enqueue(new SnagFlimsCallback(cb));
    }


}
