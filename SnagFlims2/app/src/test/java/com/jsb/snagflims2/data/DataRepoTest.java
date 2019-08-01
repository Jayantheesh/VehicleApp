package com.jsb.snagflims2.data;

import android.content.Context;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class DataRepoTest {

    @Mock
    Context mContext;

    @Mock RetrofitClient mClient;

    @Test
    public void getMovies() {
        Assert.assertFalse(DataRepo.getInstance(mContext, mClient).getMovies(null, null));
    }
}