package com.jsb.vehicleapp.data;

import android.content.Context;

public class DataRepo {

    private Context mContext;
    private static DataRepo mRepo;
    private RetrofitClient mNetClient = null;

    private DataRepo(Context context) {
        mContext = context;
        mNetClient = new RetrofitClient();
    }

    public static DataRepo getInstance(Context context) {
        if (mRepo == null) {
            mRepo = new DataRepo(context);
        }
        return mRepo;
    }

    public void getVehicleDetails(String type, ResponseCallBack cb) {
        mNetClient.getVehicleDetails(type, cb);
    }
}
