package com.example.dariochamorro.fragmentsii.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.dariochamorro.fragmentsii.fragments.ColorFragment;
import com.example.dariochamorro.fragmentsii.fragments.TitleFragment;

import java.util.List;

/**
 * Created by Dario Chamorro on 18/09/2015.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    List<TitleFragment> data;

    public PagerAdapter(FragmentManager fm, List<TitleFragment> data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return data.get(position).getTitle();
    }
}
