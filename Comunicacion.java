package com.example.ejerciciosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Comunicacion extends AppCompatActivity {
    private EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comunicacion);

        etNombre = findViewById(R.id.etNombre);
    }

    public void abrirSaludo(View view) {
        if (!etNombre.getText().equals("")) {
            Intent intent = new Intent(this, Hola.class);
            intent.putExtra("nombre", etNombre.getText().toString());
            startActivity(intent);
        } else {
            Toast.makeText(this, "Debe indicar los datos requeridos", Toast.LENGTH_LONG).show();
        }
    }
}
