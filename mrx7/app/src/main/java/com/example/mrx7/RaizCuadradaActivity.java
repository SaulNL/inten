package com.example.mrx7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RaizCuadradaActivity extends AppCompatActivity {

    private EditText etNumero;
    private Button btnCalcular;
    private TextView tvResultado;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiz_cuadrada);

        etNumero = findViewById(R.id.etNumero);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el número ingresado por el usuario
                String numeroStr = etNumero.getText().toString();

                if (!numeroStr.isEmpty()) {
                    // Convertir el número a Double
                    double numero = Double.parseDouble(numeroStr);

                    // Calcular la raíz cuadrada
                    double resultado = Math.sqrt(numero);

                    // Mostrar el resultado en TextView
                    tvResultado.setText("La raíz cuadrada de " + numero + " es " + resultado);
                }
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Regresar al Activity Principal
                Intent intent = new Intent(RaizCuadradaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}