package com.atu.componentdemo;

import android.os.ParcelUuid;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.atu.baseres.BaseActivity;
import com.atu.componentlib.router.Router;
import com.atu.componentservice.OneModuleService;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private Fragment fragment;
    private FragmentTransaction ft;

    @OnClick({R.id.btn_install, R.id.btn_uninstall})
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_install:
                Router.registerComponent("com.atu.secondmodule.applike.SecondAppLike");
                break;
            case R.id.btn_uninstall:
                Router.unregisterComponent("com.atu.secondmodule.applike.SecondAppLike");
                break;
        }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void showFragment() {
        if (fragment != null) {
            ft = getSupportFragmentManager().beginTransaction();
            ft.remove(fragment).commit();
            fragment = null;
        }

//        fragment= (Fragment) ARouter.getInstance().build("/one/one_fragment").navigation();
//        ft = getSupportFragmentManager().beginTransaction();
//        ft.add(R.id.fl_main_content, fragment).commitAllowingStateLoss();

        Router router = Router.getInstance();
        if (router.getService(OneModuleService.class.getSimpleName()) != null) {
            OneModuleService service = (OneModuleService) router.getService(OneModuleService.class.getSimpleName());
            fragment = service.getOneModuleFragment();
            ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.fl_main_content, fragment).commitAllowingStateLoss();
        }
    }

    @Override
    protected int setLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }

    @Override
    protected void init() {
        showFragment();
    }
}
