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

public class FragmentSearch extends Fragment {
    public static FragmentSearch createInstance() {
        FragmentSearch fragmentSearch = new FragmentSearch();
        return fragmentSearch;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        return view;
    }
}
