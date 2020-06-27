package com.example.imcsincero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextAltura = findViewById(R.id.editTextAltura);
        final EditText editTextPeso = findViewById(R.id.editTextPeso);

        Button calcular = findViewById(R.id.btnCalcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double altura = Double.parseDouble(Objects.requireNonNull(editTextAltura.getText().toString()));
                double peso = Double.parseDouble(Objects.requireNonNull(editTextPeso.getText().toString()));

                double imc = peso / (altura * altura);

                Intent intent = new Intent(getApplicationContext(),IMCResultado.class);
                intent.putExtra("IMC", imc);
                startActivity(intent);
            }
        });


    }



}