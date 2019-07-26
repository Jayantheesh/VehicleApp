package com.jsb.harvardartmuseums.data;

import android.content.Context;

public class DataRepo {

    private static DataRepo mDataRepo;
    private RetrofitClient mNetClient;
    private Context mContext;

    public DataRepo(Context context) {
        mContext = context;
        mNetClient = new RetrofitClient();
    }

    public static DataRepo getInstance(Context context) {
        if (mDataRepo == null) {
            mDataRepo = new DataRepo(context);
        }
        return mDataRepo;
    }

    public void getImages(String query, IResponseCallback cb) {
        mNetClient.getImages(query, cb);
    }
}
