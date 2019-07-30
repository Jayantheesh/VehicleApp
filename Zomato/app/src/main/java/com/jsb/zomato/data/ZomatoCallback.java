package com.jsb.zomato.data;

import com.jsb.zomato.model.Zomato;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ZomatoCallback implements Callback<Zomato> {

    private ResponseCallback mCb;

    public ZomatoCallback(ResponseCallback cb) {
        mCb = cb;
    }

    @Override
    public void onResponse(Call<Zomato> call, Response<Zomato> response) {
        if (response.isSuccessful()) {
            mCb.onSucess(response);
            return;
        }
        mCb.onFailure("onResponse Failure");
    }

    @Override
    public void onFailure(Call<Zomato> call, Throwable t) {
        mCb.onFailure(t.getMessage());
    }
}
