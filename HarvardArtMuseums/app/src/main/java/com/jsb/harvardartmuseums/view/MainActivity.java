package com.jsb.harvardartmuseums.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.jsb.harvardartmuseums.R;
import com.jsb.harvardartmuseums.data.DataRepo;
import com.jsb.harvardartmuseums.data.IResponseCallback;
import com.jsb.harvardartmuseums.model.HarvardArtMuseums;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements IResponseCallback {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdatpter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Invoke REST API
        DataRepo.getInstance(getApplicationContext()).getImages("width:>2000", this);
    }

    @Override
    public void onSucess(Response<HarvardArtMuseums> response) {
        if (response.isSuccessful()) {
            mAdatpter = new RVAdapter(response.body(), this);
            mRecyclerView.setAdapter(mAdatpter);
        }
    }

    @Override
    public void onFailure(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
