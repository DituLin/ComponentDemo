package com.atu.secondmodule.ui;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.atu.baseres.BaseActivity;
import com.atu.secondmodule.R;

@Route(path = "/second/activity_details")
public class DetailsActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int setLayoutResource() {
        return R.layout.second_activity_details;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }

    @Override
    protected void init() {

    }
}
