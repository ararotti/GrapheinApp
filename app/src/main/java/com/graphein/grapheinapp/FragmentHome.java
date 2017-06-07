package com.graphein.grapheinapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.clans.fab.FloatingActionMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by araratavsaroglu on 30/05/17.
 */

public class FragmentHome extends Fragment {
    private List<Person> persons;
    RecyclerView rv;
    FloatingActionMenu menu;

    public static FragmentHome createInstance() {
        FragmentHome fragmentHome = new FragmentHome();
        return fragmentHome;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        menu = (FloatingActionMenu) view.findViewById(R.id.menu);
        rv = (RecyclerView) view.findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        rv.addOnScrollListener(new RecyclerView.OnScrollListener()
        {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy)
            {
                if(dy > 0) {
                    menu.hideMenuButton(true);
                }
                else {
                    menu.showMenuButton(true);
                }
            }
        });

        initializeData();
        initializeAdapter();

        return view;
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.user1_36));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.user2_36));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.user3_36));
    }
}
