package com.graphein.grapheinapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by araratavsaroglu on 05/06/17.
 */

public class FragmentMisc extends Fragment {
    public static FragmentMisc createInstance() {
        FragmentMisc fragmentMisc = new FragmentMisc();
        return fragmentMisc;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_misc, container, false);
        return view;
    }
}
