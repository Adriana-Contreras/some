package com.example.onboarding.Onboardingg;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.onboarding.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class loginFragment extends Fragment {
    private TextView textdonelogin,textprevlogin;
    private ViewPager viewPager;
    private View view;

    public loginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialize view pager from main activity
        _initializeInflater(inflater, container);

        //initialize components
        _initialize();

        //add click event to text Next and prev text
        _addClickDoneAndPrev();

        //return
        return view;
    }
    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }

    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);

        textdonelogin = view.findViewById(R.id.textDonelogin);
        textprevlogin = view.findViewById(R.id.textPrevlogin);
    }

    public void _addClickDoneAndPrev() {
        textdonelogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        getActivity(),
                        "Finalizo el recorrido de la APP. Done!!!",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        textprevlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
    }



}
