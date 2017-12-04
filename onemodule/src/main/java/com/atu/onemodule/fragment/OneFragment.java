package com.atu.onemodule.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.atu.baseres.BaseFragment;
import com.atu.componentlib.router.ui.UIRouter;
import com.atu.onemodule.R;

/**
 * Created by atu on 2017/12/4.
 */
@Route(path = "/one/one_fragment")
public class OneFragment extends BaseFragment {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.one_fragment_video, container, false);
            rootView.findViewById(R.id.tv_video).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    UIRouter.getInstance().openUri(getActivity(),"secondmodule://second",null);
                }
            });
        }

        return rootView;
    }

}
