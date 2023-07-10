package com.example.quiz3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class tela2 extends AppCompatActivity {

    Button btnProximo2;
    RadioGroup radioGroup2;
    RadioButton rdo11, rdo12, rdo13, rdo14;
    TextView txt2;
    compartilha cp = new compartilha();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        //INSTÂNCIAR
        btnProximo2 = findViewById(R.id.btnProximo2);
        radioGroup2 = findViewById(R.id.radioGroup1);
        rdo11 = findViewById(R.id.rdo11);
        rdo12 = findViewById(R.id.rdo12);
        rdo13 = findViewById(R.id.rdo13);
        rdo14 = findViewById(R.id.rdo14);
        txt2 = findViewById(R.id.txt2);
        //SORTEAR
        String[] frage = {"Qual a montanha mais alta do mundo?", "Quanto mede uma girafa?", "Quantos braços tem um polvo?"};
        Random random = new Random();
        int numb = random.nextInt(frage.length);
        txt2.setText(frage[numb]);
        //RESPOSTAS
        if(numb == 1){
            rdo11.setText("Entre 5 e 6 metros");
            rdo12.setText("2,5 metros");
            rdo13.setText("Entre 4,8 e 5,5 metros");
            rdo14.setText("4 metros");
        }
        else if(numb == 2){
            rdo11.setText("4");
            rdo12.setText("6");
            rdo13.setText("8");
            rdo14.setText("10");
        }

        //BUTTON
        btnProximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela2.this, tela3.class);
                startActivity(intent);

                if(rdo13.isChecked()){
                    cp.setResp2("1");
                }
                finish();
            }
        });
    }
}