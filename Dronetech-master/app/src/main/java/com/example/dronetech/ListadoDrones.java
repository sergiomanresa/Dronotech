package com.example.dronetech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ListadoDrones extends AppCompatActivity {
    ImageView octocoptero;
    ImageView tricoptero;
    ImageView cuadricoptero;
    ImageView hexacoptero;
    private void changeView(Class clase){
        Intent intent = new Intent(getApplicationContext(), clase);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_drones);

        octocoptero = findViewById(R.id.imgOctocoptero);
        tricoptero = findViewById(R.id.imgTricoptero);
        cuadricoptero = findViewById(R.id.imgCuadricoptero);
        hexacoptero = findViewById(R.id.imgHexacoptero);

        octocoptero.setOnClickListener(view -> changeView(Octopuscoptero.class));
        tricoptero.setOnClickListener(view -> changeView(Tricoptero.class));
        cuadricoptero.setOnClickListener(view -> changeView(Cuadricopterobinario.class));
        hexacoptero.setOnClickListener(view -> changeView(Hexacoptero.class));
    }
}