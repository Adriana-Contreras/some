package com.example.hito3tareafinal.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.hito3tareafinal.Onboarding.login;
import com.example.hito3tareafinal.Onboarding.pag1;
import com.example.hito3tareafinal.Onboarding.pag2;

public class OnboardinfAdapter extends FragmentPagerAdapter {


    public OnboardinfAdapter(FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new pag1();
            case 1:
                return new pag2();
            case 2:
                return new login();

            default:
                return null;
        }
    }
    public int getCount() {
        return 3;
    }
}









