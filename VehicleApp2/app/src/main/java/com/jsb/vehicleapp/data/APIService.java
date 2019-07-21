package com.jsb.vehicleapp.data;

import com.jsb.vehicleapp.model.Vehicle;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    //https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json

    @GET("getallmakes")
    Call<Vehicle> getVehicleDetails(@Query("format") String type);

}
