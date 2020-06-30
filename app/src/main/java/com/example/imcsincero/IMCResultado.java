package com.example.imcsincero;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        final ImageView imgResultado = findViewById(R.id.imgResultado);
        final TextView textIMC = findViewById(R.id.textIMC);
        final TextView textSincero = findViewById(R.id.textSincero);

        double imc = getIntent().getDoubleExtra("IMC", 0D);

        if (imc < 18.5) {
            imgResultado.setImageResource(R.drawable.imc1);
            textIMC.setText("Filé de Borboleta!");
            textSincero.setText("Cuidado! Nesse Ritmo quando você estiver de frente, vai parecer que está de lado e quando estiver de lado, vai parecer que sumiu!. Aproveite a oportunidade e faça um tour pela praça de Alimentação do Shopping!");
        } else if (imc < 25){
            imgResultado.setImageResource(R.drawable.imc2);
            textIMC.setText("Que Físico!");
            textSincero.setText("Como diz o ditado: 'em time que está ganhando, não se mexe! Continue assim e terá idade pra ver os bisnetos!");
                    } else if (imc < 30){
            imgResultado.setImageResource(R.drawable.imc3);
            textIMC.setText("Ops!");
            textSincero.setText("Escorregou numa lasanha por esses dias né?! Não deixe que ela te vença. Você que Lute!");
        } else {
            imgResultado.setImageResource(R.drawable.imc4);
            textIMC.setText("Deu m&rd@");
            textSincero.setText("Lascou! Invoque o Edward Mãos de Tesoura que há em você e corte tudo menos água e... feche a boquinha, please!");
        }
    }

    public void voltar(View view){
        Button botaovoltar = findViewById(R.id.btnVoltar);
        finish();
    }
}
