package com.jsb.harvardartmuseums.data;

import com.jsb.harvardartmuseums.model.HarvardArtMuseums;

import retrofit2.Call;
import retrofit2.Response;

public class APICallback implements retrofit2.Callback<HarvardArtMuseums> {
    private IResponseCallback mCb;

    public APICallback(IResponseCallback cb) {
        mCb = cb;
    }

    @Override
    public void onResponse(Call<HarvardArtMuseums> call, Response<HarvardArtMuseums> response) {
        if(response.isSuccessful()) {
            mCb.onSucess(response);
        } else {
            mCb.onFailure("onResponse Failed");
        }
    }

    @Override
    public void onFailure(Call<HarvardArtMuseums> call, Throwable t) {
        mCb.onFailure(t.getMessage());
    }
}
