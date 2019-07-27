package com.jsb.harvardartmuseumsperson.data;

import android.content.Context;

public class DataRepo {

    private Context mContext;
    private static DataRepo mData;
    private RetrofitClient mNetModule;

    DataRepo(Context mContext) {
        this.mContext = mContext;
        mNetModule = new RetrofitClient();
    }

    public static DataRepo getInstance(Context context) {
        if (mData == null) {
            mData = new DataRepo(context);
        }
        return mData;
    }

    public void getPersonList(String query, ResponseCallback cb, String page) {
        mNetModule.getPersonList(query, cb, page);
    }
}
