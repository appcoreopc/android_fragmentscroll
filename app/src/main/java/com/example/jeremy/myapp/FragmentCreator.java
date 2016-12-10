package com.example.jeremy.myapp;

import android.support.v4.app.Fragment;

/**
 * Created by Jeremy on 12/10/2016.
 */

public class FragmentCreator  {

    public static Fragment getFragment(int position)
    {
        return new Fragment_Moov();
    }
}
