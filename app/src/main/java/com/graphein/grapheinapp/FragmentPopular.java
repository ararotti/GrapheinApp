package com.graphein.grapheinapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by araratavsaroglu on 30/05/17.
 */

public class FragmentPopular extends Fragment {
    public static FragmentPopular createInstance() {
        FragmentPopular fragmentPopular = new FragmentPopular();
        return fragmentPopular;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_popular, container, false);
        return view;
    }
}
