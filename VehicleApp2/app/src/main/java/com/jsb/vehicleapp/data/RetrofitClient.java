package com.jsb.vehicleapp.data;

import com.jsb.vehicleapp.model.Vehicle;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private Retrofit mClient;

    private static final String BASE_URL = "https://vpic.nhtsa.dot.gov/api/vehicles/";

    public RetrofitClient() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.level(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder okhttp = new OkHttpClient.Builder().addInterceptor(logging);

        mClient =  new Retrofit.Builder().baseUrl(BASE_URL)
                .client(okhttp.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public void getVehicleDetails(String type, ResponseCallBack cb) {
        Call<Vehicle> response = mClient.create(APIService.class).getVehicleDetails(type);
        response.enqueue(new VehicleCallBack(cb));
    }

}
