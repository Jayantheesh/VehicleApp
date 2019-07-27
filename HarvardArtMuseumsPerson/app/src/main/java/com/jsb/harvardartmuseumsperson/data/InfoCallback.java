package com.jsb.harvardartmuseumsperson.data;

import com.jsb.harvardartmuseumsperson.model.Person;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InfoCallback implements Callback<Person> {

    private ResponseCallback mCb;

    public InfoCallback(ResponseCallback cb) {
        mCb = cb;
    }

    @Override
    public void onResponse(Call<Person> call, Response<Person> response) {
        if(response.isSuccessful()) {
            mCb.onSucess(response);
        } else {
            mCb.onFailure("Response Failure");
        }
    }

    @Override
    public void onFailure(Call<Person> call, Throwable t) {
        mCb.onFailure(t.getMessage());
    }
}
