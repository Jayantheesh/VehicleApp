package com.jsb.snagflims2.data;

import android.content.Context;

public class DataRepo {

    private static DataRepo mDataRepo;
    private RetrofitClient mNetClient;
    private Context mContext;

    DataRepo(Context context, RetrofitClient client) {
        mContext = context;
        mNetClient = client;
    }

    public static DataRepo getInstance(Context contex, RetrofitClient client) {
        if (mDataRepo == null) {
            mDataRepo = new DataRepo(contex, client);
        }
        return mDataRepo;
    }

    public boolean getMovies(String query, ResponseCallback cb) {
        if (query == null) return false;
        mNetClient.getMovies(query, cb);
        return true;
    }
}
