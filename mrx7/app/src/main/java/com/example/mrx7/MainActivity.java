package com.example.mrx7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
    private EditText  algp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRaizCuadrada = findViewById(R.id.btnRaizCuadrada);
        Button btnPotencia = findViewById(R.id.btnPotencia);
        Button btnDolaresPesos = findViewById(R.id.btnDolaresPesos);
        Button btnRadio = findViewById(R.id.btnRadio);
        Button btnAreaCuadrado = findViewById(R.id.btnAreaCuadrado);


        btnRaizCuadrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RaizCuadradaActivity.class);
                startActivity(intent);

            }
        });

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PotenciaActivity.class);
                startActivity(intent);
            }
        });

        btnDolaresPesos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DolaresPesosActivity.class);
                startActivity(intent);
            }
        });

        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(intent);
            }
        });

        btnAreaCuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AreaCuadradoActivity.class);
                startActivity(intent);
            }
        });
    }
}