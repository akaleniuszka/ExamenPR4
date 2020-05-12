package com.example.ejerciciosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirHipotenusa(View view) {
        Intent intent = new Intent(this, Hipotenusa.class);
        startActivity(intent);
    }

    public void abrirCalificacion(View view) {
        Intent intent = new Intent(this, calificacion.class);
        startActivity(intent);
    }

    public void abrirOperaciones(View view) {
        Intent intent = new Intent(this, Operaciones.class);
        startActivity(intent);
    }

    public void abrirComunicacion(View view) {
        Intent intent = new Intent(this, Comunicacion.class);
        startActivity(intent);
    }
}
