package com.example.imcsincero;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IMCResultado extends AppCompatActivity {

    ImageView imgResultado;
    TextView textIMC, textSincero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imc_resultado);

        double imc = getIntent().getDoubleExtra("IMC", 0D);

        if (imc < 18.5) {
            imgResultado.setImageResource(R.drawable.imc5);
            textIMC.setText("Chassi do Grilo ou Filé da Borboleta!");
            textSincero.setText("Cuidado! Nesse Ritmo quando você estiver de frente, vai parecer que está de lado e quando estiver de lado, vai parecer que sumiu!.<br> Aproveite a oportunidade e faça um tour pela praça de Alimentação do Shopping!");
        } else if (imc < 25){
            imgResultado.setImageResource(R.drawable.imc3);
            textIMC.setText("Que Físico!");
            textSincero.setText("Como diz o ditado: 'em time que está ganhando, não se mexe!<br> Continue assim e terá idade pra ver os bisnetos!");
                    } else if (imc < 30){
            imgResultado.setImageResource(R.drawable.imc7);
            textIMC.setText("Ops!");
            textSincero.setText("Escorregou numa lasanha por esses dias né?! <br> Não deixe que ela te vença. Lute!");
        } else {
            imgResultado.setImageResource(R.drawable.imc8);
            textIMC.setText("Deu m&rd@");
            textSincero.setText("Lascou!<br> Invoque o Edward Mãos de Tesoura que há em você e corte tudo menos água e... feche a boquinha, please!");
        }
    }

    public void voltar(View view){
        Button voltar = findViewById(R.id.btnVoltar);
        finish();
    }
}
