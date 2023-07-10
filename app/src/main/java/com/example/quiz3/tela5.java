package com.example.quiz3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class tela5 extends AppCompatActivity {
    compartilha cp = new compartilha();
    Button btnProximo5;
    RadioButton rdo42, rdo41, rdo43, rdo44;
    TextView txt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);
        rdo42 = findViewById(R.id.rdo42);
        rdo41 = findViewById(R.id.rdo41);
        rdo43 = findViewById(R.id.rdo43);
        rdo44 = findViewById(R.id.rdo44);
        txt5 = findViewById(R.id.txt5);
        btnProximo5 = findViewById(R.id.btnProximo5);
        //SORTEAR
        String[] frage = {"Qual o monumento famoso pela sua inclinação?", "Qual desses autores brasileiros escreveu O Guarani e Iracema?","O etanol é produzido através de qual fonte de energia?"};
        Random random = new Random();
        int numb = random.nextInt(frage.length);
        txt5.setText(frage[numb]);
        //RESPOSTAS
        if(numb == 1){
            rdo41.setText("José de Anchieta");
            rdo42.setText("José de Alencar");
            rdo43.setText("Gonçalves Dias");
            rdo44.setText("Gonçalves de Magalhães");
        }
        else if(numb == 2){
            rdo41.setText("Solar");
            rdo42.setText("Biomassa");
            rdo43.setText("Eólica");
            rdo44.setText("Geotérmica");
        }
        btnProximo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela5.this, tela6.class);
                startActivity(intent);
                if(rdo42.isChecked()) {
                    cp.setResp5("1");
                }
                finish();
            }
        });
    }
}