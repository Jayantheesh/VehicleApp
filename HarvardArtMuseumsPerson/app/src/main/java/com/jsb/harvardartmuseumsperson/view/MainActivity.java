package com.jsb.harvardartmuseumsperson.view;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.jsb.harvardartmuseumsperson.R;
import com.jsb.harvardartmuseumsperson.data.DataRepo;
import com.jsb.harvardartmuseumsperson.data.ResponseCallback;
import com.jsb.harvardartmuseumsperson.model.Person;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements ResponseCallback {

    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;


    private static final int PAGE_START = 1;
    private boolean isLoading = false;
    private boolean isLastPage = false;
    private int TOTAL_PAGES = 5;
    private int currentPage = PAGE_START;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.addOnScrollListener(new PaginationScrollListener(mLayoutManager) {
            @Override
            protected void loadMoreItems() {
                currentPage += 1;

                // mocking network delay for API call
                new Handler().post(new Runnable() {
                    @Override
                    public void run() {
                        //REST API Invocation
                        DataRepo.getInstance(getApplicationContext()).getPersonList("culture:Dutch",
                                MainActivity.this, String.valueOf(currentPage));
                    }
                });

            }

            @Override
            public int getTotalPageCount() {
                return TOTAL_PAGES;
            }

            @Override
            public boolean isLastPage() {
                return isLastPage;
            }

            @Override
            public boolean isLoading() {
                return isLoading;
            }
        });

        //REST API Invocation
        DataRepo.getInstance(getApplicationContext()).getPersonList("culture:Dutch", this, String.valueOf(currentPage));
    }

    @Override
    public void onSucess(Response<Person> response) {
        mAdapter = new RVAdapter(response.body(), this);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onFailure(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
