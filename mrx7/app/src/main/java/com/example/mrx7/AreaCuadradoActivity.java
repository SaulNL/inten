package com.example.mrx7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaCuadradoActivity extends AppCompatActivity {

    private EditText etLado;
    private Button btnCalcular;
    private TextView tvResultado;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_cuadrado);

        etLado = findViewById(R.id.etLado);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ladoStr = etLado.getText().toString();

                if (!ladoStr.isEmpty()) {
                    double lado = Double.parseDouble(ladoStr);
                    double area = lado * lado;

                    tvResultado.setText("El área del cuadrado con lado " + lado + " es " + area);
                }
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Regresar al Activity Principal
                Intent intent = new Intent( AreaCuadradoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}