package com.github.paolorotolo.appintroexample;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.SODD.jswipetabs.app.fragments.FragmentLima;
import com.SODD.jswipetabs.app.fragments.FragmentEnam;
import com.SODD.jswipetabs.app.fragments.FragmentTujuh;


public class Mimmati extends FragmentActivity implements ActionBar.TabListener {

    ActionBar actionBar;
    TabPagerAdapter mTabPagerAdapter;
    ViewPager mViewPager;

    FragmentManager fragmentManager;

    FragmentLima fragmentLima;
    FragmentEnam fragmentEnam;
    FragmentTujuh fragmentTujuh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mim_mati);

        fragmentManager = getSupportFragmentManager();

        if (savedInstanceState != null) {
            fragmentLima = (FragmentLima)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager2, 0));
            fragmentEnam = (FragmentEnam)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager2, 1));
            fragmentTujuh = (FragmentTujuh)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager2, 2));
        } else {
            fragmentLima = new FragmentLima();
            fragmentManager.beginTransaction().add(R.id.main_pager2, fragmentLima, makeFragmentName(R.id.main_pager2, 0)).commit();

            fragmentEnam = new FragmentEnam();
            fragmentManager.beginTransaction().add(R.id.main_pager2, fragmentEnam, makeFragmentName(R.id.main_pager2, 1)).commit();

            fragmentTujuh = new FragmentTujuh();
            fragmentManager.beginTransaction().add(R.id.main_pager2, fragmentTujuh, makeFragmentName(R.id.main_pager2, 2)).commit();
        }

        mTabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.main_pager2);
        mViewPager.setAdapter(mTabPagerAdapter);

        actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
            mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                @Override
                public void onPageSelected(int position) {
                    actionBar.setSelectedNavigationItem(position);
                }
            });

            for (int i = 0; i < mTabPagerAdapter.getCount(); i++) {
                actionBar.addTab(actionBar.newTab()
                        .setText(mTabPagerAdapter.getPageTitle(i))
                        .setTabListener(this));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_exit:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    public class TabPagerAdapter extends FragmentPagerAdapter {
        public TabPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return fragmentLima;
                case 1:
                    return fragmentEnam;
                case 2:
                    return fragmentTujuh;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getResources().getString(R.string.tab_lima_title);
                case 1:
                    return getResources().getString(R.string.tab_enam_title);
                case 2:
                    return getResources().getString(R.string.tab_tujuh_title);
            }
            return null;
        }
    }

    private static String makeFragmentName(int viewId, int index) {//special magic from Stack Overflow
        return "android:switcher:" + viewId + ":" + index;
    }
}
