package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button butt;
    private TextView t;
    private EditText et1;
    private int a=2;
    private int b=3;
    private int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializaVariable();


    }
    public  void initializaVariable(){

        butt = findViewById(R.id.button1);
        butt.setText("ingresar");
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CONTENIDO =et1.getText().toString();
                t.setText(CONTENIDO.toString());

            }
        });






        t = findViewById(R.id.idtext);
        t.setText("UNIVERSITARIO: ADRIANA CONTRERAS");



        et1 = findViewById(R.id.et1);
        et1.setText("adriiii");

    }



}
