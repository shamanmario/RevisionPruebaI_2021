package com.example.revisinpruebai_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView cargaInicial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargaInicial = findViewById(R.id.cargaInicial);
        cargaInicial.setText("0");
    }

    public void crearTarjetaChip(View view){
        int monto = Integer.parseInt(cargaInicial.getText().toString());

        if(monto >= 5000){
            //lanzar activity y pasar el monto
            Intent intento = new Intent(this, MenuPrincipal.class);
            intento.putExtra("cargaInicial", monto);
            startActivity(intento);


        } else {
            Toast.makeText(this, "La carga inicial debe ser igual o mayor a $5.000", Toast.LENGTH_SHORT).show();
            cargaInicial.setText("0");
        }
    }
}