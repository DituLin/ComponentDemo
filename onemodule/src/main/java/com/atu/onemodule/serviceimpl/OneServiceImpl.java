package com.atu.onemodule.serviceimpl;

import android.support.v4.app.Fragment;

import com.atu.componentservice.OneModuleService;
import com.atu.onemodule.fragment.OneFragment;

/**
 * Created by atu on 2017/12/4.
 */

public class OneServiceImpl implements OneModuleService {
    @Override
    public Fragment getOneModuleFragment() {
        return new OneFragment();
    }
}
