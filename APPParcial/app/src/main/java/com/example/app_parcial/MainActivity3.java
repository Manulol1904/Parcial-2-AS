package com.example.app_parcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Button addButton = findViewById(R.id.add);
        TextView Datos = findViewById(R.id.Des1);
        TextView Nombres = findViewById(R.id.Nombre3);

        String descripcion = getIntent().getStringExtra("descripcion");
        String Des2 = getIntent().getStringExtra("nombres");

        Datos.setText(descripcion);
        Nombres.setText(Des2);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);

                String descripcion = Datos.getText().toString();
                intent.putExtra("descripcion", descripcion);

                String Des2 = Nombres.getText().toString();
                intent.putExtra("nombres", Des2);

                startActivity(intent);
            }
        });


    }
}
