package com.example.jeremy.myapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jeremy on 12/10/2016
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
                return HowItWorks_Fragment.newInstance("how it works", "how it works");
        else if (position == 1)
                return Fragment_Moov.newInstance("Moov", "Moov");
        else if (position == 2)
                return Fragment_WorkOut.newInstance("Moov", "Moov");
        else
            return HowItWorks_Fragment.newInstance("how it works", "how it works");
    }

    @Override
    public int getCount() {
        return 3;
    }
}
