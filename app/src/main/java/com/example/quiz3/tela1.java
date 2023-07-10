package com.example.quiz3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class tela1 extends AppCompatActivity {

    Button btnProximo1;
    RadioButton rdo1, rdo2, rdo3, rdo4;
    RadioGroup radioGroup1;
    compartilha cp = new compartilha();
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        //INSTÂNCIAR
        rdo1 = findViewById(R.id.rdo1);
        rdo2 = findViewById(R.id.rdo2);
        rdo3 = findViewById(R.id.rdo3);
        rdo4 = findViewById(R.id.rdo4);
        radioGroup1 = findViewById(R.id.radioGroup1);
        btnProximo1 = findViewById(R.id.btnProximo1);
        txt1 = findViewById(R.id.txt1);

        //SORTEAR
        String[] frage = {"Quem foi a primeira pessoa a viajar no espaço?", "Quantos planetas Terra cabem dentro do Sol?", "Qual das alternativas contém apenas nomes de rios?"};
        Random random = new Random();
        int numb = random.nextInt(frage.length);
        txt1.setText(frage[numb]);
        //RESPOSTAS
        if(numb == 1){
            rdo1.setText("1 milhão");
            rdo2.setText("100");
            rdo3.setText("600");
            rdo4.setText("2 milhões");
        }
        else if(numb == 2){
            rdo1.setText("Nilo, Amazonas, Mississipi");
            rdo2.setText("Tocantins, Bering, Ganges");
            rdo3.setText("Cáspio, Vermelho, Reno");
            rdo4.setText("São Francisco, Douro, Antártico");
        }
        //BUTTON
        btnProximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela1.this, tela2.class);
                startActivity(intent);
                //SET
                if(rdo1.isChecked()){
                    cp.setResp1("1");
                }
                finish();
            }
        });
    }

}