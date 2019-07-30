package com.jsb.zomato.data;

import android.content.Context;

public class DataRepo {

    private static DataRepo mDataRepo;
    private Context mContext;
    private RetrofitClient mNetClient;

    private DataRepo(Context context, RetrofitClient client) {
        mContext = context;
        mNetClient = client;
    }

    public boolean getEstablishments(String lat, String lon, String api_key, ResponseCallback cb) {
        if (lat == null || lon == null || api_key == null || cb == null) {
            return false;
        }
        mNetClient.getEstablishments(lat, lon, api_key, cb);
        return true;
    }

    public static DataRepo getInstance(Context context, RetrofitClient client) {
        if (mDataRepo == null) {
            mDataRepo = new DataRepo(context, client);
        }
        return mDataRepo;
    }
}
