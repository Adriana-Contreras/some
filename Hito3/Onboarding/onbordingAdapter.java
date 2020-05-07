package com.example.onboarding.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.onboarding.Onboardingg.FaceDetectionFragmenttt;
import com.example.onboarding.Onboardingg.TextRecognitionFragment;
import com.example.onboarding.Onboardingg.WelcomeFragment;
import com.example.onboarding.Onboardingg.loginFragment;

public class onbordingAdapter extends FragmentPagerAdapter {
    public onbordingAdapter(FragmentManager fm)
    {
        super(fm);
    }



    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new WelcomeFragment();
            case 1:
                return new FaceDetectionFragmenttt();
            case 2:
                return new TextRecognitionFragment();
            case 3:
                return new loginFragment();
            default:
                return null;
        }
    }


    public int getCount() {
        return 4;
    }





}





