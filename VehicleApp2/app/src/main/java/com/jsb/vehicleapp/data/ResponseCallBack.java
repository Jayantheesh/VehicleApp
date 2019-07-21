package com.jsb.vehicleapp.data;

import com.jsb.vehicleapp.model.Vehicle;

import retrofit2.Response;

public interface ResponseCallBack {
    void onSuccess(Response<Vehicle> response);
    void onFailure(String msg);
}
