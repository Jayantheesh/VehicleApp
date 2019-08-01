package com.jsb.snagflims2.data;

import com.jsb.snagflims2.model.SnagFlims;

import retrofit2.Response;

public interface ResponseCallback {

    void onSucess(Response<SnagFlims> response);
    void onFailure(String msg);
}
