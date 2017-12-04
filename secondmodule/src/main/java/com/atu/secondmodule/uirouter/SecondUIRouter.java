package com.atu.secondmodule.uirouter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

import com.atu.componentlib.router.ui.IComponentRouter;
import com.atu.secondmodule.SecondMainActivity;

/**
 * Created by atu on 2017/12/4.
 */

public class SecondUIRouter implements IComponentRouter {
    private static final String SCHME = "secondmodule";

    private static final String SHAREHOST = "second";

    private static String[] HOSTS = new String[]{SHAREHOST};


    private static SecondUIRouter instance = new SecondUIRouter();

    private SecondUIRouter() {
    }

    public static SecondUIRouter getInstance() {
        return instance;
    }


    @Override
    public boolean openUri(Context context, String url, Bundle bundle) {
        if (TextUtils.isEmpty(url) || context == null) {
            return true;
        }
        return openUri(context,url,bundle);
    }

    @Override
    public boolean openUri(Context context, Uri uri, Bundle bundle) {
        if (uri == null || context == null) {
            return true;
        }
        String host = uri.getHost();
        if (SHAREHOST.equals(host)) {
            Intent intent = new Intent(context, SecondMainActivity.class);
            intent.putExtras(bundle == null ? new Bundle() : bundle);
            context.startActivity(intent);
            return true;
        }

        return false;
    }

    @Override
    public boolean verifyUri(Uri uri) {
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (SCHME.equals(scheme)) {
            for (String str : HOSTS) {
                if (str.equals(host)) {
                    return true;
                }
            }
        }
        return false;
    }
}
