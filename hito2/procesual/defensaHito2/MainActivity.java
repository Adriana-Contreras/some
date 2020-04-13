package com.example.defensahito2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;
    private Button btset, btbus;
    private int mayor,n11,n33, n55,n22,n66,n44;
    private String n1,n5,n3,n2,n6,n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();

    }

    public void initializeVariables() {
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);

        btset=  findViewById(R.id.btset);
        btbus=  findViewById(R.id.btbus);


        btbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recoger el valor de los txtbox
                if(tv10.equals("Confirmado")){
                    n1 = tv1.getText().toString();
                    n3= tv3.getText().toString();
                    n5= tv5.getText().toString();
                }
                n11 = Integer.parseInt(n1);
                n33 =Integer.parseInt(n3);
                n55 = Integer.parseInt(n5);
                if(n11 > n33) {
                    if (n11 > n55) {
                        mayor = n11;
                    }else{ mayor= n55; }
                }

                else if( n33> n55){
                    mayor= n33;
                }else {mayor= n55;}

                Toast.makeText(getApplication(), "la cantidad mayor de confirmados es "+ mayor,Toast.LENGTH_LONG).show();

                if(tv10.equals("Sospechosos")){
                    n2 = tv2.getText().toString();
                    n4= tv4.getText().toString();
                    n6= tv6.getText().toString();
                }
                n22 = Integer.parseInt(n2);
                n44 =Integer.parseInt(n4);
                n66 = Integer.parseInt(n6);
                if(n22> n44) {
                    if (n22 > n66) {
                        mayor = n22;
                    }else{ mayor= n66; }
                }

                else if( n44> n66){
                    mayor= n44;
                }else {mayor= n66;}

                Toast.makeText(getApplication(), "la cantidad mayor de sospechosos es "+ mayor,Toast.LENGTH_LONG).show();

            }
        });
        btset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recoger el valor de los txtbox
                if(tv9.getText().toString()=="Cochabamba"){
                    tv1.setText(tv7.getText());
                    tv2.setText(tv8.getText());
                }
                if(tv9.getText().toString()=="Santa Cruz"){
                    tv3.setText(tv7.getText());
                    tv4.setText(tv8.getText());
                }
                if(tv9.getText().toString()=="Oruro"){
                    tv5.setText(tv7.getText());
                    tv6.setText(tv8.getText());
                }

            }
        });


            }



        }











