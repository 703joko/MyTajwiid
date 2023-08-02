package com.github.paolorotolo.appintroexample;

import android.app.*;
import android.content.*;
import android.os.*;
import android.support.v4.app.*;
import android.support.v4.view.*;
import android.view.*;
import com.SODD.jswipetabs.app.fragments.*;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


public class Ro extends FragmentActivity implements ActionBar.TabListener {

    ActionBar actionBar;
    TabPagerAdapter mTabPagerAdapter;
    ViewPager mViewPager;

    FragmentManager fragmentManager;

    FragmentXa fragmentXa;
    FragmentYa fragmentYa;
    FragmentZa fragmentZa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ro);
        fragmentManager = getSupportFragmentManager();

        if (savedInstanceState != null) {
            fragmentXa = (FragmentXa)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager4, 0));
            fragmentYa = (FragmentYa)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager4, 1));
            fragmentZa = (FragmentZa)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager4, 2));
        } else {
            fragmentXa = new FragmentXa();
            fragmentManager.beginTransaction().add(R.id.main_pager4, fragmentXa, makeFragmentName(R.id.main_pager4, 0)).commit();

            fragmentYa = new FragmentYa();
            fragmentManager.beginTransaction().add(R.id.main_pager4, fragmentYa, makeFragmentName(R.id.main_pager4, 1)).commit();

            fragmentZa = new FragmentZa();
            fragmentManager.beginTransaction().add(R.id.main_pager4, fragmentZa, makeFragmentName(R.id.main_pager4, 2)).commit();
        }

        mTabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.main_pager4);
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
                    return fragmentXa;
                case 1:
                    return fragmentYa;
                case 2:
                    return fragmentZa;
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
                    return getResources().getString(R.string.tab_xa_title);
                case 1:
                    return getResources().getString(R.string.tab_ya_title);
                case 2:
                    return getResources().getString(R.string.tab_za_title);
            }
            return null;
        }
    }




    private static String makeFragmentName(int viewId, int index) {//special magic from Stack Overflow
        return "android:switcher:" + viewId + ":" + index;
    }
}
