package com.example.app2sumayresta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button butt1, butt2,butt3,butt4;
    private EditText n1, n2,n3,n4;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciazeVariables();
    }

    public void iniciazeVariables() {
        respuesta = findViewById(R.id.rest);

        butt1 = findViewById(R.id.butt1);
        butt1.setText("suma");

        butt2 = findViewById(R.id.butt2);
        butt2.setText("resta");

        butt3 = findViewById(R.id.butt3);
        butt3.setText("multiplicacion");

        butt4 = findViewById(R.id.butt4);
        butt4.setText("division");

        n1 = findViewById(R.id.intro1);
        n2 = findViewById(R.id.intro2);

        n3 = findViewById(R.id.intro1);
        n4 = findViewById(R.id.intro2);

        butt1.setOnClickListener(this);
        butt2.setOnClickListener(this);
        butt3.setOnClickListener(this);
        butt4.setOnClickListener(this);
    }
    private void sumar()
    {
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int r = valor1 + valor2;
        respuesta.setText("" + r);
    }
    private void resta()
    {
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int r1 = valor1 - valor2;
        respuesta.setText("" + r1);

    }
    private void multi()
    {
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int r2 = valor1 * valor2;
        respuesta.setText("" + r2);

    }private void division()
    {
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int r3 = valor1 / valor2;
        respuesta.setText("" + r3);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.butt1:
                sumar();
                break;
            case R.id.butt2:
                resta();
                break;
            case R.id.butt3:
                multi();
                break;
            case R.id.butt4:
                division();
                break;
        }



    }
}