package com.graphein.grapheinapp;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AHBottomNavigationAdapter navigationAdapter;
    private ArrayList<AHBottomNavigationItem> bottomNavigationItems = new ArrayList<>();
    private int[] tabColors;
    private Handler handler = new Handler();
    private DemoViewPagerAdapter adapter;
    private Fragment currentFragment;

    // UI
    private ScrollableViewPager viewPager;
    private AHBottomNavigation bottomNavigation;
    //private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean enabledTranslucentNavigation = getSharedPreferences("shared", Context.MODE_PRIVATE)
                .getBoolean("translucentNavigation", false);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {

        bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);
        viewPager = (ScrollableViewPager) findViewById(R.id.view_pager);
        //floatingActionButton = (FloatingActionButton) findViewById(R.id.floating_action_button);

        tabColors = new int[] { R.color.primary };
        navigationAdapter = new AHBottomNavigationAdapter(this, R.menu.menu_bottom_navigation);
        navigationAdapter.setupWithBottomNavigation(bottomNavigation, tabColors);

        //bottomNavigation.manageFloatingActionButtonBehavior(floatingActionButton);
        bottomNavigation.setTranslucentNavigationEnabled(false);
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_HIDE);

        bottomNavigation.setAccentColor(ContextCompat.getColor(this, R.color.primary));
        bottomNavigation.setInactiveColor(ContextCompat.getColor(this, R.color.divider));

        bottomNavigation.setCurrentItem(0);

        // scroll anında navigasyonun hide edilmesi
        //bottomNavigation.setBehaviorTranslationEnabled(false);

        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {

                if (currentFragment == null) {
                    currentFragment = adapter.getCurrentFragment();
                }

                if (wasSelected) {
                    //currentFragment.refresh();
                    return true;
                }

                if (currentFragment != null) {
                    //currentFragment.willBeHidden();
                }

                viewPager.setCurrentItem(position, false);
                currentFragment = adapter.getCurrentFragment();
                //currentFragment.willBeDisplayed();

                return true;
            }
        });

        viewPager.setOffscreenPageLimit(4);

        adapter = new DemoViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomNavigation.setCurrentItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        currentFragment = adapter.getCurrentFragment();

        //bottomNavigation.setDefaultBackgroundResource(R.drawable.bottom_navigation_background);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }
}
