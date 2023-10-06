package com.example.mrx7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PotenciaActivity extends AppCompatActivity {

    private EditText etBase;
    private EditText etExponente;
    private Button btnCalcular;
    private TextView tvResultado;
    private Button btnRegresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);

        etBase = findViewById(R.id.etBase);
        etExponente = findViewById(R.id.etExponente);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);
        btnRegresar = findViewById(R.id.btnRegresar);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String baseStr = etBase.getText().toString();
                String exponenteStr = etExponente.getText().toString();

                if (!baseStr.isEmpty() && !exponenteStr.isEmpty()) {
                    double base = Double.parseDouble(baseStr);
                    double exponente = Double.parseDouble(exponenteStr);
                    double resultado = Math.pow(base, exponente);
                    tvResultado.setText(base + " elevado a la " + exponente + " es igual a " + resultado);
                }
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Regresar al Activity Principal
                Intent intent = new Intent(PotenciaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}