package com.jsb.harvardartmuseumsperson.data;

import com.jsb.harvardartmuseumsperson.model.Person;

import retrofit2.Response;

public interface ResponseCallback {

    void onSucess(Response<Person> response);
    void onFailure(String msg);

}
