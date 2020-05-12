package com.example.ejerciciosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hola);

        TextView tvSaludo = findViewById(R.id.tvSaludo);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String saludo = bundle.getString("nombre");

        tvSaludo.append(" " + saludo + "!!!");
    }
}
