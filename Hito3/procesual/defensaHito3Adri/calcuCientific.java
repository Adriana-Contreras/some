package com.example.defensahito3adri.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.defensahito3adri.R;

public class calcuCientific extends AppCompatActivity {

    private TextView tvUsername3,tvNombreApp3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu_cientific);
        mostrarNickname();
    }


    public void mostrarNickname() {

        tvNombreApp3= findViewById(R.id.ShowSelect3);
        String nomApp = getIntent().getStringExtra("APP: ");
        String msg1 = "App:  "+ nomApp;
        tvNombreApp3.setText(msg1);

        tvUsername3 = findViewById(R.id.ShowUser3);
        String username = getIntent().getStringExtra("Bienvenido: ");
        String msg2 = "Bienvenido:  " +username;
        tvUsername3.setText(msg2);
    }
}
