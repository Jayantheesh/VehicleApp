package com.jsb.snagflims2.data;

import com.jsb.snagflims2.model.SnagFlims;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SnagFlimsCallback implements Callback<SnagFlims> {

    private ResponseCallback mCb;

    public SnagFlimsCallback(ResponseCallback cb) {
        mCb = cb;
    }

    @Override
    public void onResponse(Call<SnagFlims> call, Response<SnagFlims> response) {
        if (response.isSuccessful()) {
            mCb.onSucess(response);
        } else {
            mCb.onFailure("Failed");
        }
    }

    @Override
    public void onFailure(Call<SnagFlims> call, Throwable t) {
        mCb.onFailure(t.getMessage());
    }
}
