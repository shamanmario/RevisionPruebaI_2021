package com.example.revisinpruebai_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    private TarjetaChip tarjeta;
    private TextView carga;
    private  TextView saldo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        int cargaInicial = getIntent().getIntExtra("cargaInicial", 5000);
        tarjeta = new TarjetaChip(cargaInicial);
        carga = findViewById(R.id.montoCarga);
        carga.setText("0");

        saldo = findViewById(R.id.saldo);

        saldo.setText("$"+tarjeta.getSaldo());


    }

    public void cargarTarjeta(View view){
        int cantidad = Integer.parseInt(carga.getText().toString());
        if(tarjeta.cargarChip(cantidad)){
            Toast.makeText(this, "Tarjeta Chip recargada", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Las recargas deben ser iguales o mayores a $1.000", Toast.LENGTH_SHORT).show();
        }

        carga.setText("0");

        saldo.setText("$"+tarjeta.getSaldo());
    }

    public void comprarPasajeMetro(View view){
        if(tarjeta.comprarPasajeMetro()){
            Toast.makeText(this, "Compra de pasaje de Metro correcta", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Saldo insuficiente para comprar un pasaje en Metro", Toast.LENGTH_SHORT).show();
        }

        saldo.setText("$"+tarjeta.getSaldo());
    }

    public void comprarPasajeTaxi(View view){
        if(tarjeta.comprarPasajeTaxi()){
            Toast.makeText(this, "Compra de pasaje de Taxi correcta", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Saldo insuficiente para comprar un pasaje en Taxi", Toast.LENGTH_SHORT).show();
        }

        saldo.setText("$"+tarjeta.getSaldo());
    }

    public void verViajesMetro(View view){

        Intent intento = new Intent(this, VisorViajes.class);
        intento.putExtra("viajes", tarjeta.getViajesMetro());
        startActivity(intento);

    }

    public void verViajesTaxi(View view){
        Intent intento = new Intent(this, VisorViajes.class);
        intento.putExtra("viajes", tarjeta.getViajesTaxi());
        startActivity(intento);
    }
}