package com.example.quiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class tela6 extends AppCompatActivity {
    compartilha cp = new compartilha();
    Button btnProximo6;
    RadioButton rdo51, rdo52, rdo53, rdo54;
    TextView txt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);
        rdo51 = findViewById(R.id.rdo51);
        rdo52 = findViewById(R.id.rdo52);
        rdo53 = findViewById(R.id.rdo53);
        rdo54 = findViewById(R.id.rdo54);
        txt6 = findViewById(R.id.txt6);
        btnProximo6 = findViewById(R.id.btnProximo6);
        //SORTEAR
        String[] frage = {"Qual o nome popular do cloreto de sódio?", "Qual a nacionalidade de Che Guevara?","Em que ordem surgiram os modelos atômicos?"};
        Random random = new Random();
        int numb = random.nextInt(frage.length);
        txt6.setText(frage[numb]);
        //RESPOSTAS
        if(numb == 1){
            rdo51.setText("Argentina");
            rdo52.setText("Cubana");
            rdo53.setText("Venezuelana");
            rdo54.setText("Boliviana");
        }
        else if(numb == 2){
            rdo51.setText("Dalton, Thomson, Rutherford, Rutherford-Bohr");
            rdo52.setText("Dalton, Thomson, Rutherford-Bohr, Rutherford");
            rdo53.setText("Rutherford-Bohr, Rutherford, Thomson, Dalton");
            rdo54.setText("Thomson, Dalton, Rutherford, Rutherford-Bohr");
        }
        btnProximo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela6.this, tela7.class);
                startActivity(intent);

                if(rdo51.isChecked()){
                    cp.setResp6("1");
                }
                finish();
            }
        });
    }
}