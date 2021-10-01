package com.example.revisinpruebai_2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class VisorViajes extends AppCompatActivity {

    private ArrayList<Pasaje> viajes;
    private RecyclerView recycler;
    private AdaptadorPasaje adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_viajes);

        viajes = (ArrayList<Pasaje>) getIntent().getSerializableExtra("viajes");
        recycler = findViewById(R.id.recyclerHistorial);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        adaptador = new AdaptadorPasaje(viajes);

        recycler.setAdapter(adaptador);

    }
}