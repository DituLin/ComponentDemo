package com.atu.secondmodule.applike;

import com.atu.componentlib.applicationlike.IApplicationLike;
import com.atu.componentlib.router.ui.UIRouter;
import com.atu.secondmodule.uirouter.SecondUIRouter;

/**
 * Created by atu on 2017/12/4.
 */

public class SecondAppLike implements IApplicationLike{

    UIRouter uiRouter = UIRouter.getInstance();
    SecondUIRouter secondUIRouter = SecondUIRouter.getInstance();
    @Override
    public void onCreate() {
        uiRouter.registerUI(secondUIRouter);
    }

    @Override
    public void onStop() {
        uiRouter.unregisterUI(secondUIRouter);
    }
}
