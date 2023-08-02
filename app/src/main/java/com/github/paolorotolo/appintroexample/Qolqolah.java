package com.github.paolorotolo.appintroexample;

import android.app.*;
import android.os.*;
import android.support.v4.app.*;
import android.support.v4.view.*;
import android.view.*;
import com.SODD.jswipetabs.app.fragments.*;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;



public class Qolqolah extends FragmentActivity implements ActionBar.TabListener {

    ActionBar actionBar;
    TabPagerAdapter mTabPagerAdapter;
    ViewPager mViewPager;

    FragmentManager fragmentManager;

    FragmentKubro fragmentKubro;
    FragmentSugro fragmentSugro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qolqolah);

		new AlertDialog.Builder(this).setTitle("Hukum Qolqolah").setMessage(R.string.qolqolah_).setNeutralButton("OK", null).show();
        fragmentManager = getSupportFragmentManager();

        if (savedInstanceState != null) {
            fragmentKubro = (FragmentKubro)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager4, 0));
            fragmentSugro = (FragmentSugro)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager4, 1));
        } else {
            fragmentKubro = new FragmentKubro();
            fragmentManager.beginTransaction().add(R.id.main_pager4, fragmentKubro, makeFragmentName(R.id.main_pager4, 0)).commit();

            fragmentSugro = new FragmentSugro();
            fragmentManager.beginTransaction().add(R.id.main_pager4, fragmentSugro, makeFragmentName(R.id.main_pager4, 1)).commit();
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
                    return fragmentKubro;
                case 1:
                    return fragmentSugro;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getResources().getString(R.string.tab_kubro_title);
                case 1:
                    return getResources().getString(R.string.tab_sugro_title);
            }
            return null;
        }
    }

    private static String makeFragmentName(int viewId, int index) {//special magic from Stack Overflow
        return "android:switcher:" + viewId + ":" + index;
    }
}
