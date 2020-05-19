package com.example.hito3tareafinal.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hito3tareafinal.R;

public class calculadora extends AppCompatActivity implements View.OnClickListener  {


    public EditText txt;
    public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnigual, btnsuma, btnresta, btndiv, btnmul;
    public Button btncuadrado, btnfraccion, btnmasmenos, btneliminar, btnraiz,btnc, btnpunto,btnc2,btnporcentaje;

    //public String operador; //no la uso

    public String reserva; // auxiliar que agarra un numero
    public double resultado;
    int operacion; //identifica operaciones

    public double op1= 0.0;
    public double op2;

    int c= 0;
    double op3=1.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        initializeVariables();
    }
    public void initializeVariables() {
        //para mostrar en pantalla
        txt= findViewById(R.id.pantalla);
        btn1 = findViewById(R.id.num1);
        btn2 = findViewById(R.id.num2);
        btn3 = findViewById(R.id.num3);
        btn4 = findViewById(R.id.num4);
        btn5 = findViewById(R.id.num5);
        btn6 = findViewById(R.id.num6);
        btn5 = findViewById(R.id.num5);
        btn6 = findViewById(R.id.num6);
        btn7 = findViewById(R.id.num7);
        btn8 = findViewById(R.id.num8);
        btn9 = findViewById(R.id.num9);
        btn0 = findViewById(R.id.num0);

        //operaiones
        btnsuma = findViewById(R.id.sum);
        btnresta=findViewById(R.id.resta2);
        btndiv=findViewById(R.id.div);
        btnmul=findViewById(R.id.multi);
        btnigual = findViewById(R.id.igual);

        //operaciones extra
        btncuadrado = findViewById(R.id.cuadrado);
        btnfraccion = findViewById(R.id.fraccion);
        btnmasmenos = findViewById(R.id.masmenos);
        btneliminar = findViewById(R.id.eliminar);
        btnraiz = findViewById(R.id.numraiz);
        btnc = findViewById(R.id.numc);
        btnpunto = findViewById(R.id.punto);
        btnc2 = findViewById(R.id.numc2);
        btnporcentaje = findViewById(R.id.porcentaje);



        txt.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);

        btnsuma.setOnClickListener(this);
        btnigual.setOnClickListener(this);
        btnresta.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmul.setOnClickListener(this);

        btncuadrado.setOnClickListener(this);
        btnfraccion.setOnClickListener(this);
        btnmasmenos.setOnClickListener(this);
        btneliminar.setOnClickListener(this);
        btnraiz.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btnpunto.setOnClickListener(this);
        btnc2.setOnClickListener(this);
        btnporcentaje.setOnClickListener(this);

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
            case R.id.num5:
                String valor5 = txt.getText().toString();
                valor5= valor5 + "5";
                txt.setText(valor5);
                break;
            case R.id.num6:
                String valor6 = txt.getText().toString();
                valor6 = valor6 + "6";
                txt.setText(valor6);

                break;
            case R.id.num7:
                String valor7 = txt.getText().toString();
                valor7 = valor7 + "7";
                txt.setText(valor7);

                break;
            case R.id.num8:
                String valor8 = txt.getText().toString();
                valor8 = valor8 + "8";
                txt.setText(valor8);

                break;
            case R.id.num9:

                String valor9 = txt.getText().toString();
                valor9 = valor9 + "9";
                txt.setText(valor9);

                break;
            case R.id.num0:
                String valor0 = txt.getText().toString();
                valor0 = valor0 + "0";
                txt.setText(valor0);
                break;

            case R.id.sum:

                suma();

                break;
            case R.id.resta2:

                resta();
                break;
            case R.id.multi:

                multi();
                break;

            case R.id.div:

                div();
                break;

            case R.id.igual:
                identificarOperacion();
                break;
            case R.id.cuadrado:
                cuadrado();

                break;
            case R.id.porcentaje:
                porcentaje();

                break;
            case R.id.numc:
                botonC();

                break;
            case R.id.masmenos:
                ConvertirMasMenos();

                break;
            case R.id.fraccion:
                funcionfracccion();

                break;
            case R.id.punto:
                puntoo();

                break;
            case R.id.eliminar:
                flechaEliminar();

                break;
            case R.id.numraiz:
                botonR();

                break;
            case R.id.numc2:
                botonC2();

                break;


        }

    }
    public void identificarOperacion(){
        try {
            String reserva2 = txt.getText().toString();
            op2 = Double.parseDouble(reserva2);
        }
        catch (NumberFormatException e){

        }
        //limpiar
        txt.setText("");
        if(operacion==1)
        {

            resultado = op1+ op2;
            txt.setText(""+resultado);

        }
        else if(operacion==2)
        {
            resultado = op1-op2;
            txt.setText(""+resultado);
        }
        else if(operacion==3){

            resultado =op1*op2;
            txt.setText(""+resultado);
        }
        else if (operacion==4){

            if(op2 == 0){
                txt.setText("No es posible dividir entre 0");
                // Toast.makeText.getText(),"no es posible dividir entre 0 ", Toast.LENGTH_LONG).show();
            }
            else {
                resultado = op1 / op2;
                txt.setText(""+resultado);
            }
        }
        op1 = 0.0;
        op3=1.0;
        c=0;
    }
    public void suma() {
        //if (operador.equals("+")) {
        //   Resultado = Double.parseDouble(reserva) + Double.parseDouble(txt.getText().toString());
        //  txt.setText(String.valueOf(Resultado));

        reserva = txt.getText().toString();
        op1 = op1 + Double.parseDouble(reserva);

        txt.setText("");
        operacion=1;

    }
    public void resta() {
        // if (operador.equals("-")) {
        //Resultado = Double.parseDouble(reserva) - Double.parseDouble(txt.getText().toString());
        //     txt.setText(String.valueOf(Resultado));
        // }
        op1=0;
        if(c<1)
        {
            reserva = txt.getText().toString();
            op1= (Double.parseDouble(reserva))- op1;
            op3=op1;
        }
        else if(c>0)
        {
            reserva = txt.getText().toString();
            op1 = op3 -(Double.parseDouble(reserva));

        }
        //limpiamos la pantalla
        txt.setText("");
        operacion =2;
        c++;

    }


    public  void multi() {
        // if (operador.equals("*")) {
        //     Resultado = Double.parseDouble(reserva) * Double.parseDouble(txt.getText().toString());
        //     txt.setText(String.valueOf(Resultado));
        op1 =1;
        reserva = txt.getText().toString();
        op1 = op3 * Double.parseDouble(reserva);
        op3 = op1;

        //limpiar
        txt.setText("");
        operacion= 3;



    }
    public void div() {
        //if (operador.equals("/")) {
        //    Resultado = Double.parseDouble(reserva) / Double.parseDouble(txt.getText().toString());
        //    txt.setText(String.valueOf(Resultado));
        //}

        if(c<1){
            reserva = txt.getText().toString();
            op1 =  Double.parseDouble(reserva)/op3;
            op3 = op1;
        }
        else if(c>0)
        {
            reserva = txt.getText().toString();
            op1 = op3/Double.parseDouble(reserva);
            op3 =op1;

        }
        //limpiar
        txt.setText("");
        operacion= 4;
        c++;

    }
    public void  cuadrado(){
        String a = txt.getText().toString();
        Double cuadra = Double.parseDouble(a);
        Double respuesta = Math.pow(cuadra,2);
        txt.setText(""+respuesta);
    }
    public void porcentaje(){
        String b = txt.getText().toString();
        Double porcen = Double.parseDouble(b);
        Double respe = porcen /100;
        txt.setText(""+respe);

    }
    public void botonC(){
        txt.setText("");
    }
    public void ConvertirMasMenos(){
        String m = txt.getText().toString();
        Double masmenos = Double.parseDouble(m);
        Double respes = masmenos * -1;
        txt.setText(""+respes);
    }
    public void funcionfracccion(){
        String m1 = txt.getText().toString();
        Double mas1 = Double.parseDouble(m1);
        Double respes1 = 1/mas1;
        txt.setText(""+respes1);
    }
    public void puntoo(){
        String c =  txt.getText().toString();
        if(c.length() <=0)
        {
            txt.setText("0.");
        }
        else
        {
            c=c+".";
        }
        txt.setText(c);
    }
    public void flechaEliminar(){
        String cc = txt.getText().toString();
        if(cc.length()>0)
        {
            cc = cc.substring(0,cc.length()-1);
            txt.setText(cc);
        }

    }
    public void botonR(){
        String cc1 = txt.getText().toString();
        if(cc1.length()>0) {
            Double res = Math.sqrt(Double.parseDouble(cc1));
            txt.setText(""+res);
        }
    }
    public void botonC2(){
        txt.setText("");

    }









}
