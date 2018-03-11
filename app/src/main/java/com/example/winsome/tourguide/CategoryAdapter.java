package com.example.winsome.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context context;
    final int PAGE_COUNT = 4;
    private String tabTitles[];


    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabTitles = context.getResources().getStringArray(R.array.header);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumFragment();
        } else if (position == 1){
            return new ActivitiesFragment();
        } else if (position == 2){
            return new FoodFragment();
        } else {
            return new EventFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
