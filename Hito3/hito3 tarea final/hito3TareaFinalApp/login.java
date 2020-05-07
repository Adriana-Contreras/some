package com.example.hito3tareafinal.Onboarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hito3tareafinal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class login extends Fragment {
    private TextView textdonelogin,textprevlogin;
    private ViewPager viewPager;
    private View view;
    private Button btnlogin;
    private EditText etEmailuser, etpasswordd;


    public login() {
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

    private void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);

        textdonelogin = view.findViewById(R.id.textDonelogin);
        textprevlogin = view.findViewById(R.id.textPrevlogin);
         btnlogin  = view.findViewById(R.id.idlogin);

    }

    private void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }

    private void _addClickDoneAndPrev() {
        textdonelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });
        textprevlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), calculadora.class);

                startActivity(intent);
            }
        });


    }
}
