package com.example.quiz3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class tela3 extends AppCompatActivity {
    RadioButton rdo21, rdo22, rdo23, rdo24;
    Button btnProximo3;
    compartilha cp = new compartilha();
    TextView txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        rdo21 = findViewById(R.id.rdo21);
        rdo22 = findViewById(R.id.rdo22);
        rdo23 = findViewById(R.id.rdo23);
        rdo24 = findViewById(R.id.rdo24);
        txt3 = findViewById(R.id.txt3);
        btnProximo3 = findViewById(R.id.btnProximo3);

        //SORTEAR
        String[] frage = {"Quem inventou a lâmpada?", "Quais as respectivas invenções dos inventores Alexander Graham Bell e Galileu Galilei", "De que são constituídos os diamantes?"};
        Random random = new Random();
        int numb = random.nextInt(frage.length);
        txt3.setText(frage[numb]);
        //RESPOSTAS
        if(numb == 1){
            rdo21.setText("Lâmpada e avião");
            rdo22.setText("Relógio e giroscópio");
            rdo23.setText("Internet e televisão");
            rdo24.setText("Telefone e termômetro");
        }
        else if(numb == 2){
            rdo21.setText("Bóhrio");
            rdo22.setText("Ósmio");
            rdo23.setText("Grafite");
            rdo24.setText("Carbono");
        }
        //BUTTON
        btnProximo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela3.this, tela4.class);
                startActivity(intent);

                if(rdo24.isChecked()){
                    cp.setResp3("1");
                }

                finish();
            }
        });
    }
}