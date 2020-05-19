package com.example.defensahito3adri.Onboarding;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.defensahito3adri.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class pagSelectApp extends Fragment implements View.OnClickListener {
    public EditText user, selectapp;
    public ViewPager viewPager;
    private View view;
    public Button bdesc1, bdesc2, bdesc3, bselect1, bselect2, bselect3, ingresar;


    public pagSelectApp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initializeInflater(inflater, container);
        iniciarVariables();


        return view;


    }

    public void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_pag_select_app, container, false);
    }

    public void iniciarVariables() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);

        bdesc1 = view.findViewById(R.id.desc1);
        bdesc2 = view.findViewById(R.id.desc2);
        bdesc3 = view.findViewById(R.id.desc3);

        bselect1 = view.findViewById(R.id.s1);
        bselect2 = view.findViewById(R.id.s2);
        bselect3 = view.findViewById(R.id.s3);

        selectapp = view.findViewById(R.id.selectapp1);
        user= view.findViewById(R.id.user1);

        bdesc1.setOnClickListener(this);
        bdesc2.setOnClickListener(this);
        bdesc3.setOnClickListener(this);

        bselect1.setOnClickListener(this);
        bselect2.setOnClickListener(this);
        bselect3.setOnClickListener(this);

        selectapp.setOnClickListener(this);
        user.setOnClickListener(this);


        ingresar = view.findViewById(R.id.i1);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreapp = selectapp.getText().toString().trim();
                String nickname = user.getText().toString().trim();

                if (nombreapp.equals("Select App") || nombreapp.equals("Username")) {
                    Toast.makeText(getActivity(), "Por favor selecione los campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (nombreapp.equals("Custom"))
                    {
                        Intent intent = new Intent(getActivity(), calcu_custom.class);
                        intent.putExtra("APP: ", nombreapp);
                        intent.putExtra("Bienvenido: ", nickname);
                        startActivity(intent);
                        getActivity().finish();

                    }
                    else if (nombreapp.equals("Basica")) {
                        Intent intent = new Intent(getActivity(), calcuBasic.class);
                        intent.putExtra("APP: ", nombreapp);
                        intent.putExtra("Bienvenido: ", nickname);
                        startActivity(intent);
                        getActivity().finish();

                    }
                    else if (nombreapp.equals("Cientifica")) {
                        Intent intent = new Intent(getActivity(), calcuCientific.class);
                        intent.putExtra("APP: ", nombreapp);
                        intent.putExtra("Bienvenido: ", nickname);
                        startActivity(intent);
                        getActivity().finish();
                    }

                }
            }
        });


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.desc1:
                MMensaje("Calculadora Basica");
                break;
            case R.id.desc2:
                MMensaje("Calculadora Cientifica");
                break;
            case R.id.desc3:
                MMensaje("Calculadora Custom, operaciones planteadas en la defensa");
                break;
            case R.id.s1:
                selectapp.setText("Basica");
                break;
            case R.id.s2:
                selectapp.setText("Cientifica");
                break;
            case R.id.s3:
                selectapp.setText("Custom");
                break;
        }

    }

    private void MMensaje (String msg){
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }


}
