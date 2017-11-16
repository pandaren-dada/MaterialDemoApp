package com.app.pandarendemoapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dll HuaiKhwang on 9/11/2560.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> fragmetnTitleList = new ArrayList<>();

    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmetnTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return fragmetnTitleList.get(position);
    }

    public void addFragment(Fragment fragment, String title){

        mFragmentList.add(fragment);
        fragmetnTitleList.add(title);
    }
}
