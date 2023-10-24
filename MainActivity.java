package com.example.app_parcial;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public TextView Des;
    public TextView Nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encuentra el botón "Agregar" por su ID
        Button agregarButton = findViewById(R.id.Agregar);
        Button verButton = findViewById(R.id.Ver);
        Des = findViewById(R.id.des);
        Nombres = findViewById(R.id.Nombres);



        agregarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                String descripcion = Des.getText().toString();
                intent.putExtra("descripcion", descripcion);

                String Des2 = Nombres.getText().toString();
                intent.putExtra("nombres", Des2);


                startActivity(intent);
            }
        });

        verButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);

                String descripcion = Des.getText().toString();
                intent.putExtra("descripcion", descripcion);

                String Des2 = Nombres.getText().toString();
                intent.putExtra("nombres", Des2);

                startActivity(intent);
            }
        });
    }

}
