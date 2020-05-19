package com.example.defensahito3adri.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.defensahito3adri.R;

public class calcu_custom extends AppCompatActivity implements View.OnClickListener {
    private TextView tvUsername, tvNombreApp;
    public EditText txt;
    public Button btn1, btn2, btn3, btn4, btn0, btnigual, btnsuma, btnresta, btndiv, btnmul;
    public Button btncuadrado, btncubo, btneliminar, btnraiz;
    public Button btnxy, btnfactorial, btnshift, btnfibo, znu;
    public double op1 = 0.0;
    int c = 0;
    double op3 = 1.0;
    public String reserva;
    public double resultado;
    int operacion;
    public double op2;
    private boolean cambiar = false;
    private double aux1 = 0, aux2 = 0;
    private char letra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu_custom);

        initializeVariables();
        mostrarNickname();
        //addClickDoneAndPrev();

    }

    public void initializeVariables() {

        txt = findViewById(R.id.pantalla);
        btn1 = findViewById(R.id.num1);
        btn2 = findViewById(R.id.num2);
        btn3 = findViewById(R.id.num3);
        btn4 = findViewById(R.id.num4);
        btn0 = findViewById(R.id.num0);

        btnsuma = findViewById(R.id.suma1);
        btnresta = findViewById(R.id.resta1);
        btndiv = findViewById(R.id.div1);
        btnmul = findViewById(R.id.multi1);
        btnigual = findViewById(R.id.igual1);


        btncuadrado = findViewById(R.id.cuadrado);
        btneliminar = findViewById(R.id.eliminar);
        btnraiz = findViewById(R.id.raiz);
        btnxy = findViewById(R.id.xy);
        btnfactorial = findViewById(R.id.factorial);
        btnshift = findViewById(R.id.shift);


        txt.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn0.setOnClickListener(this);

        btnsuma.setOnClickListener(this);
        btnigual.setOnClickListener(this);
        btnresta.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmul.setOnClickListener(this);

        btncuadrado.setOnClickListener(this);
        btnfactorial.setOnClickListener(this);
        btneliminar.setOnClickListener(this);
        btnraiz.setOnClickListener(this);
        btnshift.setOnClickListener(this);
        btnxy.setOnClickListener(this);

    }

    public void mostrarNickname() {

        tvNombreApp = findViewById(R.id.tvShowSelect);
        String nomApp = getIntent().getStringExtra("APP: ");
        String msg1 = "App:  " + nomApp;
        tvNombreApp.setText(msg1);

        tvUsername = findViewById(R.id.tvShowUsername);
        String username = getIntent().getStringExtra("Bienvenido: ");
        String msg2 = "Bienvenido:  " + username;
        tvUsername.setText(msg2);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.num1:
                String valor = txt.getText().toString();
                valor = valor + "1";
                txt.setText(valor);
                break;
            case R.id.num2:
                String valor2 = txt.getText().toString();
                valor2 = valor2 + "2";
                txt.setText(valor2);
                break;
            case R.id.num3:
                String valor3 = txt.getText().toString();
                valor3 = valor3 + "3";
                txt.setText(valor3);
                break;
            case R.id.num4:
                String valor4 = txt.getText().toString();
                valor4 = valor4 + "4";
                txt.setText(valor4);
                break;
            case R.id.num0:
                String valor0 = txt.getText().toString();
                valor0 = valor0 + "0";
                txt.setText(valor0);
                break;
            case R.id.suma1:
                suma();
                break;
            case R.id.resta1:
                resta();
                break;
            case R.id.multi1:
                multi();
                break;
            case R.id.div1:
                div();
                break;
            case R.id.igual1:
                identificarOperacion();
                break;
            case R.id.cuadrado:
                cuadrado();
                break;
            case R.id.eliminar:
                flechaEliminar();
                break;
            case R.id.raiz:
                botonRaiz();
                break;
            case R.id.shift:
                metodoShift();
                break;



        }


    }


        public void identificarOperacion() {
        try {
            String reserva2 = txt.getText().toString();
            op2 = Double.parseDouble(reserva2);
        } catch (NumberFormatException e) {

        }
        //limpiar
        txt.setText("");
        if (operacion == 1) {

            resultado = op1 + op2;
            txt.setText("" + resultado);

        } else if (operacion == 2) {
            resultado = op1 - op2;
            txt.setText("" + resultado);
        } else if (operacion == 3) {

            resultado = op1 * op2;
            txt.setText("" + resultado);
        } else if (operacion == 4) {

            if (op2 == 0) {
                txt.setText("No es posible dividir entre 0");
                // Toast.makeText.getText(),"no es posible dividir entre 0 ", Toast.LENGTH_LONG).show();
            } else {
                resultado = op1 / op2;
                txt.setText("" + resultado);
            }
        }
        op1 = 0.0;
        op3 = 1.0;
        c = 0;
    }

    public void suma() {
        //if (operador.equals("+")) {
        //   Resultado = Double.parseDouble(reserva) + Double.parseDouble(txt.getText().toString());
        //  txt.setText(String.valueOf(Resultado));

        reserva = txt.getText().toString();
        op1 = op1 + Double.parseDouble(reserva);

        txt.setText("");
        operacion = 1;

    }

    public void resta() {
        // if (operador.equals("-")) {
        //Resultado = Double.parseDouble(reserva) - Double.parseDouble(txt.getText().toString());
        //     txt.setText(String.valueOf(Resultado));
        // }
        op1 = 0;
        if (c < 1) {
            reserva = txt.getText().toString();
            op1 = (Double.parseDouble(reserva)) - op1;
            op3 = op1;
        } else if (c > 0) {
            reserva = txt.getText().toString();
            op1 = op3 - (Double.parseDouble(reserva));

        }
        //limpiamos la pantalla
        txt.setText("");
        operacion = 2;
        c++;

    }


    public void multi() {
        // if (operador.equals("*")) {
        //     Resultado = Double.parseDouble(reserva) * Double.parseDouble(txt.getText().toString());
        //     txt.setText(String.valueOf(Resultado));
        op1 = 1;
        reserva = txt.getText().toString();
        op1 = op3 * Double.parseDouble(reserva);
        op3 = op1;

        //limpiar
        txt.setText("");
        operacion = 3;


    }

    public void div() {
        //if (operador.equals("/")) {
        //    Resultado = Double.parseDouble(reserva) / Double.parseDouble(txt.getText().toString());
        //    txt.setText(String.valueOf(Resultado));
        //}

        if (c < 1) {
            reserva = txt.getText().toString();
            op1 = Double.parseDouble(reserva) / op3;
            op3 = op1;
        } else if (c > 0) {
            reserva = txt.getText().toString();
            op1 = op3 / Double.parseDouble(reserva);
            op3 = op1;

        }
        //limpiar
        txt.setText("");
        operacion = 4;
        c++;

    }

    public void cuadrado() {
        String a = txt.getText().toString();
        Double cuadra = Double.parseDouble(a);
        Double respuesta = Math.pow(cuadra, 2);
        txt.setText("" + respuesta);
    }


    public void flechaEliminar() {
        String cc = txt.getText().toString();
        if (cc.length() > 0) {
            cc = cc.substring(0, cc.length() - 1);
            txt.setText(cc);
        }

    }

    public void botonRaiz() {
        String cc1 = txt.getText().toString();
        if (cc1.length() > 0) {
            Double res = Math.sqrt(Double.parseDouble(cc1));
            txt.setText("" + res);
        }
    }

    public void metodoShift() {

        if (cambiar == false) {
            btncuadrado.setText("x2");
            btnfibo.setText("Zfibo");
            btnxy.setText("Znu");
            cambiar = true;
        } else {
            btnraiz.setText("√");
            btncuadrado.setText("x2");
            btnxy.setText("XY");
            btnfactorial.setText("FAC");

            cambiar = false;
        }
    }

    public void cubo() {
        double x;
        x = Double.parseDouble(txt.getText().toString());
        if (cambiar == false) {
            txt.setText("" + (Math.pow(x, 3)));
        } else {
            aux1 = Double.parseDouble(txt.getText().toString());
            txt.setText("");
            letra = 'x';
        }
    }


    }



