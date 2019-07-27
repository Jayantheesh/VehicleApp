package com.jsb.harvardartmuseumsperson.data;

import com.jsb.harvardartmuseumsperson.model.Person;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private Retrofit mClient;
    private static String BASE_URL = "https://api.harvardartmuseums.org";

    public RetrofitClient() {

        if (mClient == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.level(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addInterceptor(interceptor);

            mClient = new Retrofit.Builder()
                    .client(builder.build())
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

    }

    public void getPersonList(String query, ResponseCallback cb, String page) {
        Call<Person>  response = mClient.create(APIService.class).getPersonList(query, "26a708e0-ab5d-11e9-a106-6fc0dc4365f5", page);
        response.enqueue(new InfoCallback(cb));
    }
}
