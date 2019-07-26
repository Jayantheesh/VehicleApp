package com.jsb.harvardartmuseums.data;

import com.jsb.harvardartmuseums.model.HarvardArtMuseums;

import retrofit2.Response;

public interface IResponseCallback {

    void onSucess(Response<HarvardArtMuseums> response);
    void onFailure(String text);
}
