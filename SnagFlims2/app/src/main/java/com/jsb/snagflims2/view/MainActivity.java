package com.jsb.snagflims2.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.jsb.snagflims2.R;
import com.jsb.snagflims2.data.DataRepo;
import com.jsb.snagflims2.data.ResponseCallback;
import com.jsb.snagflims2.data.RetrofitClient;
import com.jsb.snagflims2.model.SnagFlims;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements ResponseCallback {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataRepo.getInstance(getApplicationContext(), new RetrofitClient()).getMovies("snagfilms", this);

        mRecyclerView = findViewById(R.id.recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }

    @Override
    public void onSucess(Response<SnagFlims> response) {
        Toast.makeText(this, "onSucess", Toast.LENGTH_SHORT).show();
        mAdapter = new RVAdapter(this, response.body());
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onFailure(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
