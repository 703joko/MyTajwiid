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


public class Idgham extends FragmentActivity implements ActionBar.TabListener {

    ActionBar actionBar;
    TabPagerAdapter mTabPagerAdapter;
    ViewPager mViewPager;

    FragmentManager fragmentManager;

    FragmentX fragmentX;
    FragmentY fragmentY;
    FragmentZ fragmentZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idgham);
		new AlertDialog.Builder(this).setTitle("Hukum Idgham").setMessage(R.string.hukum_idgham).setNeutralButton("OK", null).show();
        fragmentManager = getSupportFragmentManager();

        if (savedInstanceState != null) {
            fragmentX = (FragmentX)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager3, 0));
            fragmentY = (FragmentY)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager3, 1));
            fragmentZ = (FragmentZ)fragmentManager.findFragmentByTag(makeFragmentName(R.id.main_pager3, 2));
        } else {
            fragmentX = new FragmentX();
            fragmentManager.beginTransaction().add(R.id.main_pager3, fragmentX, makeFragmentName(R.id.main_pager3, 0)).commit();

            fragmentY = new FragmentY();
            fragmentManager.beginTransaction().add(R.id.main_pager3, fragmentY, makeFragmentName(R.id.main_pager3, 1)).commit();

            fragmentZ = new FragmentZ();
            fragmentManager.beginTransaction().add(R.id.main_pager3, fragmentZ, makeFragmentName(R.id.main_pager3, 2)).commit();
        }

        mTabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.main_pager3);
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
                    return fragmentX;
                case 1:
                    return fragmentY;
                case 2:
                    return fragmentZ;
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
                    return getResources().getString(R.string.tab_x_title);
                case 1:
                    return getResources().getString(R.string.tab_y_title);
                case 2:
                    return getResources().getString(R.string.tab_z_title);
            }
            return null;
        }
    }




    private static String makeFragmentName(int viewId, int index) {//special magic from Stack Overflow
        return "android:switcher:" + viewId + ":" + index;
    }
}
