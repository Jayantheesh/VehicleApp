package com.jsb.vehicleapp.data;

import android.util.Log;

import com.jsb.vehicleapp.model.Vehicle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VehicleCallBack implements Callback<Vehicle> {

    ResponseCallBack mCb;

    public VehicleCallBack(ResponseCallBack cb) {
        mCb = cb;
    }

    @Override
    public void onResponse(Call<Vehicle> call, Response<Vehicle> response) {
        if (response.isSuccessful()) {
            Log.e("VehicleApp", "onSuccess");
            mCb.onSuccess(response);
        } else {
            Log.e("VehicleApp", "onFailure");
            mCb.onFailure("Failed");
        }
    }

    @Override
    public void onFailure(Call<Vehicle> call, Throwable t) {
        Log.e("VehicleApp", "onFailure" + " " + t.getMessage());
        mCb.onFailure(t.getMessage());
    }
}
