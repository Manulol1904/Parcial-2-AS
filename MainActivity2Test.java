package com.example.app_parcial;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("MainActivity2Test")
public class MainActivity2Test {

    @Test
    public void testOnCreate_ShouldSetDatosTextView() {
        // Crea un Intent mock con los datos esperados
        Intent intent = new Intent();
        intent.putExtra("descripcion", "Esta es una descripción");
        intent.putExtra("nombres", "Juan Pérez");

        // Crea una instancia de MainActivity2
        MainActivity2 activity = new MainActivity2();

        // Llama al método onCreate()
        activity.onCreate(null);

        // Obtiene el texto del TextView "Datos"
        String datosText = activity.datos.getText().toString();

        // Realiza la aserción
        assertEquals("Esta es una descripción", datosText);
    }
}
