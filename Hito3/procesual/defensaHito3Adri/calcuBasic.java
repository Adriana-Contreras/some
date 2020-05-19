package com.example.defensahito3adri.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.defensahito3adri.R;

public class calcuBasic extends AppCompatActivity {
    private TextView tvUsername2,tvNombreApp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu_basic);
        mostrarNickname();
    }


    public void mostrarNickname() {

        tvNombreApp2 = findViewById(R.id.ShowSelect2);
        String nomApp = getIntent().getStringExtra("APP: ");
        String msg1 = "App:  "+ nomApp;
        tvNombreApp2.setText(msg1);

        tvUsername2 = findViewById(R.id.showUsername2);
        String username = getIntent().getStringExtra("Bienvenido: ");
        String msg2 = "Bienvenido:  " +username;
        tvUsername2.setText(msg2);
    }
}
