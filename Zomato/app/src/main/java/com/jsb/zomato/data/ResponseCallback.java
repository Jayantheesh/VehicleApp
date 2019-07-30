package com.jsb.zomato.data;

import com.jsb.zomato.model.Zomato;

import retrofit2.Response;

public interface ResponseCallback {
    void onSucess(Response<Zomato> response);
    void onFailure(String msg);
}
