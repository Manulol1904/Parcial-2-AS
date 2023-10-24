package com.example.app_parcial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView datos;
    TextView nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Encuentra el TextView "Datos" y "Nombre2" por sus ID
        datos = findViewById(R.id.Datos);
        nombres = findViewById(R.id.Nombre2);

        // Obtiene el valor de la descripción y nombres del Intent
        String descripcion = getIntent().getStringExtra("descripcion");
        String Des2 = getIntent().getStringExtra("nombres");

        // Establece el valor en los TextView correspondientes
        datos.setText(descripcion);
        nombres.setText(Des2);
    }

}
