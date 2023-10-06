package com.example.mrx7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DolaresPesosActivity extends AppCompatActivity {

    private EditText etDolares;
    private Button btnConvertir;
    private TextView tvResultado;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolares_pesos);


        etDolares = findViewById(R.id.etDolares);
        btnConvertir = findViewById(R.id.btnConvertir);
        tvResultado = findViewById(R.id.tvResultado);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dolaresStr = etDolares.getText().toString();

                if (!dolaresStr.isEmpty()) {
                    double dolares = Double.parseDouble(dolaresStr);
                    double tipoCambio = 20.0; // Suponiendo un tipo de cambio fijo
                    double pesosMexicanos = dolares * tipoCambio;
                    tvResultado.setText(dolares + " dólares son " + pesosMexicanos + " pesos mexicanos");
                }
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Regresar al Activity Principal
                Intent intent = new Intent(DolaresPesosActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}