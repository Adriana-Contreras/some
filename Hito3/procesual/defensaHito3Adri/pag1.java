package com.example.defensahito3adri.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.defensahito3adri.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class pag1 extends Fragment {
    private TextView next1;
    private Button skip1;
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
    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_pag1, container, false);
    }
    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        next1 = view.findViewById(R.id.btnnext1);
        skip1 = view.findViewById(R.id.btnskip1);
    }

    public void _addClickTextNext() {
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
    }

}



