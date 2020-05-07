package com.example.hito3tareafinal.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hito3tareafinal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class pag1 extends Fragment {
    private TextView textNext;
    private ViewPager viewPager;
    private View view;

    public pag1() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //initialize viewpager from main activity
        _initializeInflater(inflater, container);

        //initialize components
        
        _initialize();

        //add click event to text Next
        _addClickTextNext();

        //return
        return view;
    }

    private void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textNext = view.findViewById(R.id.textNextWelcome);

    }

    private void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_pag1, container, false);
    }


    private void _addClickTextNext() {

        textNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
    }
}
