package com.example.jeremy.myapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jeremy on 12/10/2016.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return HowItWorks_Fragment.newInstance("how it works", "how it works");
            case 1:
                return Fragment_Moov.newInstance("Moov", "Moov");
            case 2:
                return Fragment_Moov.newInstance("Moov", "Moov");
        }
        return Fragment_Moov.newInstance("Moov", "Moov");
    }

    @Override
    public int getCount() {
        return 3;
    }
}
