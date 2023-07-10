package com.example.quiz3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class tela8 extends AppCompatActivity {
    Button btnProximo8;
    RadioButton rdo73, rdo71, rdo72, rdo74;
    compartilha cp = new compartilha();
    TextView txt8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela8);
        rdo73 = findViewById(R.id.rdo73);
        rdo71 = findViewById(R.id.rdo71);
        rdo72 = findViewById(R.id.rdo72);
        rdo74 = findViewById(R.id.rdo74);
        txt8 = findViewById(R.id.txt8);
        btnProximo8 = findViewById(R.id.btnProximo8);
        //SORTEAR
        String[] frage = {"O que comemora no feriado do dia 21 de abril no Brasil?", "Qual foi o recurso utilizado inicialmente pelo homem para explicar a origem das coisas?","Qual era o nome de Aleijadinho?"};
        Random random = new Random();
        int numb = random.nextInt(frage.length);
        txt8.setText(frage[numb]);
        //RESPOSTAS
        if(numb == 1){
            rdo71.setText("Filosofia");
            rdo72.setText("Matemática");
            rdo73.setText("Mitologia");
            rdo74.setText("Astronomia");
        }
        else if(numb == 2){
            rdo71.setText("Alexandrino Francisco Lisboa");
            rdo72.setText("Manuel Francisco Lisboa");
            rdo73.setText("Antônio Francisco Lisboa");
            rdo74.setText("Francisco Antônio Lisboa");
        }
        btnProximo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela8.this, tela9.class);
                startActivity(intent);

                if(rdo73.isChecked()){
                    cp.setResp8("1");
                }
                finish();
            }
        });
    }
}