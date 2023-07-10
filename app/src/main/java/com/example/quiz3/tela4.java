package com.example.quiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class tela4 extends AppCompatActivity {

    Button btnProximo4;
    RadioButton rdo34, rdo31, rdo32, rdo33;
    compartilha cp = new compartilha();
    TextView txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);
        rdo34 = findViewById(R.id.rdo34);
        rdo31 = findViewById(R.id.rdo31);
        rdo32 = findViewById(R.id.rdo32);
        rdo33 = findViewById(R.id.rdo33);
        btnProximo4 = findViewById(R.id.btnProximo4);
        txt4 = findViewById(R.id.txt4);
        //SORTEAR
        String[] frage = {"Quantos ossos tem um corpo humano?", "Qual o significado das setas do símbolo internacional da reciclagem?", "O que é um Papiloscopista?"};
        Random random = new Random();
        int numb = random.nextInt(frage.length);
        txt4.setText(frage[numb]);
        //RESPOSTAS
        if(numb == 1){
            rdo31.setText("Papel, vidro e metal");
            rdo32.setText("Coleta, separação e consumo");
            rdo33.setText("Papel, vidro e plástico");
            rdo34.setText("Fabricação, utilização e reutilização");
        }
        else if(numb == 2){
            rdo31.setText("Especialista em cópias");
            rdo32.setText("Indivíduo que se dedica ao estudo de papiros");
            rdo33.setText("Pessoa que tem uma pequena saliência cônica na língua");
            rdo34.setText("Profissional especializado em identificação humana");
        }
        btnProximo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela4.this, tela5.class);
                startActivity(intent);

                if(rdo34.isChecked()){
                    cp.setResp4("1");
                }
                finish();
            }
        });
    }
}