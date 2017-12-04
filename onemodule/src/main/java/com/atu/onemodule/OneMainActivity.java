package com.atu.onemodule;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.atu.baseres.BaseActivity;
import com.atu.onemodule.fragment.OneFragment;

public class OneMainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_activity_main);

        Fragment fragment = new OneFragment();
        final FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fl_content, fragment).commitAllowingStateLoss();
    }
}
