package com.zahidhasan.discart.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.zahidhasan.discart.fragments.HomeFragment;
import com.zahidhasan.discart.fragments.InfoFragment;
import com.zahidhasan.discart.fragments.PhotosFragment;
import com.zahidhasan.discart.fragments.ReviewFragment;

/**
 * Created by auuntoo on 3/2/18.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                InfoFragment infoFragment = new InfoFragment();
                return infoFragment;
            case 2:
                PhotosFragment photosFragment = new PhotosFragment();
                return photosFragment;
            case 3:
                ReviewFragment reviewFragment = new ReviewFragment();
                return reviewFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return numOfTabs;
    }
}
