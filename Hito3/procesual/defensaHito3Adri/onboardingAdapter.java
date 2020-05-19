package com.example.defensahito3adri.adapaters;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.defensahito3adri.Onboarding.pag1;
import com.example.defensahito3adri.Onboarding.pag2;
import com.example.defensahito3adri.Onboarding.pagSelectApp;


public class onboardingAdapter extends FragmentPagerAdapter {

    public onboardingAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new pag1();
            case 1:
                return new pag2();
            case 2:
                return new pagSelectApp();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 3;
    }
}
