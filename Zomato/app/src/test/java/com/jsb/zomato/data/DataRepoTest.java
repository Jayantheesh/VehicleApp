package com.jsb.zomato.data;

import android.content.Context;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class DataRepoTest {

    @Mock
    Context mContext;

    @Mock RetrofitClient mClient;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getEstablishments() {
        Assert.assertFalse(DataRepo.getInstance(mContext, mClient).getEstablishments("", "", "", null));

    }
}