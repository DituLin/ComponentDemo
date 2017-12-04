package com.atu.onemodule.applike;

import com.atu.componentlib.applicationlike.IApplicationLike;
import com.atu.componentlib.router.Router;
import com.atu.componentservice.OneModuleService;
import com.atu.onemodule.serviceimpl.OneServiceImpl;

/**
 *
 * 路由注册、注销
 * Created by atu on 2017/12/4.
 */

public class OneAppLike implements IApplicationLike{

    Router router = Router.getInstance();

    @Override
    public void onCreate() {
        router.addService(OneModuleService.class.getSimpleName(),new OneServiceImpl());
    }

    @Override
    public void onStop() {
        router.removeService(OneModuleService.class.getSimpleName());
    }
}
