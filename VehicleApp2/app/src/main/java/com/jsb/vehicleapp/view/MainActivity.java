package com.jsb.vehicleapp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.jsb.vehicleapp.R;
import com.jsb.vehicleapp.data.DataRepo;
import com.jsb.vehicleapp.data.ResponseCallBack;
import com.jsb.vehicleapp.model.Vehicle;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements ResponseCallBack {

    RecyclerView mRecyclerView = null;
    RecyclerView.LayoutManager mLayoutManager = null;
    RecyclerView.Adapter mRVAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recycler View
        mRecyclerView = findViewById(R.id.recyclerview);
        //mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mLayoutManager = new GridLayoutManager(this, 3);
        mRecyclerView.setLayoutManager(mLayoutManager);


        //API to get the Vehicle info from Internet
        DataRepo.getInstance(getApplicationContext()).getVehicleDetails("json", this);
    }

    @Override
    public void onSuccess(Response<Vehicle> response) {
        //Log.e("VehicleApp" , "Onsucess" + " " + response.body().toString());
        mRVAdapter = new RVAdapter(this, response.body());
        mRecyclerView.setAdapter(mRVAdapter);
    }

    @Override
    public void onFailure(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
