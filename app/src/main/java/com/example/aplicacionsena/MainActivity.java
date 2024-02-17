package com.example.aplicacionsena;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrarMensaje("¡Hola! Esta es mi primera actividad.");

        // Obtener referencia al TextView
        TextView textViewMensaje = findViewById(R.id.textViewMensaje);

        // Establecer el texto del TextView
        textViewMensaje.setText("Hola, este es un mensaje de prueba.");
    }

    // Método para mostrar un mensaje utilizando Toast
    private void mostrarMensaje(String mensaje) {
        Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
    }
}