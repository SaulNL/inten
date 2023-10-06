package com.example.mrx7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity {

    private EditText etDiametro;
    private Button btnCalcular;
    private TextView tvResultado;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        etDiametro = findViewById(R.id.etDiametro);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String diametroStr = etDiametro.getText().toString();

                if (!diametroStr.isEmpty()) {
                    double diametro = Double.parseDouble(diametroStr);
                    double radio = diametro / 2.0;
                    tvResultado.setText("El radio es " + radio);
                }
            }
        });
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Regresar al Activity Principal
                Intent intent = new Intent(RadioActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}