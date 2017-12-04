package com.atu.secondmodule;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.atu.baseres.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class SecondMainActivity extends BaseActivity {

    @BindView(R2.id.second_tv_content)
    TextView tvContent;

    @OnClick(R2.id.second_btn_click)
    void onClick(View view) {
        if (view.getId() == R.id.second_btn_click) {
            tvContent.setText("我变了哦");
            ARouter.getInstance().build("/second/activity_details").navigation();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int setLayoutResource() {
        return R.layout.second_activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }

    @Override
    protected void init() {

    }
}
