package com.jsb.zomato.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.jsb.zomato.R;
import com.jsb.zomato.data.DataRepo;
import com.jsb.zomato.data.ResponseCallback;
import com.jsb.zomato.data.RetrofitClient;
import com.jsb.zomato.model.Zomato;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements ResponseCallback {

    RecyclerView mRecyclerview;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataRepo.getInstance(getApplicationContext(), new RetrofitClient())
                .getEstablishments("40.588730", "-74.512040","541c8762113255a2c4a6fbca908baad8" , this);

        mRecyclerview = findViewById(R.id.recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(mLayoutManager);

    }

    @Override
    public void onSucess(Response<Zomato> response) {
        Toast.makeText(this, "Response sucess", Toast.LENGTH_SHORT).show();
        mAdapter = new RVAdapter(this, response.body());
        mRecyclerview.setAdapter(mAdapter);
    }

    @Override
    public void onFailure(String msg) {
        Toast.makeText(this, "onFailure", Toast.LENGTH_SHORT).show();
    }
}
