package com.graphein.grapheinapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by araratavsaroglu on 05/06/17.
 */

public class DemoViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private Fragment currentFragment;

    public DemoViewPagerAdapter(FragmentManager fm) {
        super(fm);

        fragments.clear();
        fragments.add(FragmentMain.createInstance());
        fragments.add(FragmentSearch.createInstance());
        fragments.add(FragmentProfile.createInstance());
        fragments.add(FragmentMisc.createInstance());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        if (getCurrentFragment() != object) {
            currentFragment = ((Fragment) object);
        }
        super.setPrimaryItem(container, position, object);
    }

    public Fragment getCurrentFragment() {
        return currentFragment;
    }
}
