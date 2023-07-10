package com.example.quiz3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class tela7 extends AppCompatActivity {
    Button btnProximo7;
    RadioButton rdo64, rdo61, rdo62, rdo63;
    compartilha cp = new compartilha();
    TextView txt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela7);
        rdo64 = findViewById(R.id.rdo64);
        rdo61 = findViewById(R.id.rdo61);
        rdo62 = findViewById(R.id.rdo62);
        rdo63 = findViewById(R.id.rdo63);
        txt7 = findViewById(R.id.txt7);
        btnProximo7 = findViewById(R.id.btnProximo7);
        //SORTEAR
        String[] frage = {"Qual a especialidade do otorrinolaringologista?", "Qual a montanha mais alta do Brasil?","Em qual local da Ásia o português é língua oficial?"};
        Random random = new Random();
        int numb = random.nextInt(frage.length);
        txt7.setText(frage[numb]);
        //RESPOSTAS
        if(numb == 1){
            rdo61.setText("Monte Roraima");
            rdo62.setText("Pico da Bandeira");
            rdo63.setText("Pico Paraná");
            rdo64.setText("Pico da Neblina");
        }
        else if(numb == 2){
            rdo61.setText("Índia");
            rdo62.setText("Filipinas");
            rdo63.setText("Moçambique");
            rdo64.setText("Macau");
        }
        btnProximo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela7.this, tela8.class);
                startActivity(intent);
                if(rdo64.isChecked()){
                    cp.setResp7("1");
                }
                finish();
            }
        });
    }
}