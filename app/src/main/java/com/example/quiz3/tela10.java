package com.example.quiz3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class tela10 extends AppCompatActivity {
    Button btnProximo10;
    RadioButton rdo94, rdo91, rdo92, rdo93;
    compartilha cp = new compartilha();
    TextView txt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela10);
        rdo94 = findViewById(R.id.rdo94);
        rdo91 = findViewById(R.id.rdo91);
        rdo92 = findViewById(R.id.rdo92);
        rdo93 = findViewById(R.id.rdo93);
        txt10 = findViewById(R.id.txt10);
        btnProximo10 = findViewById(R.id.btnProximo10);
        //SORTEAR
        String[] frage = {"Quem foi a única pessoa na história a receber o Prêmio Nobel em áreas científicas diferentes?", "As pessoas de qual tipo sanguíneo são consideradas doadores universais?","Que animal gruguleja?"};
        Random random = new Random();
        int numb = random.nextInt(frage.length);
        txt10.setText(frage[numb]);
        //RESPOSTAS
        if(numb == 1){
            rdo91.setText("Tipo AB");
            rdo92.setText("Tipo A");
            rdo93.setText("Tipo B");
            rdo94.setText("Tipo O");
        }
        else if(numb == 2){
            rdo91.setText("garça");
            rdo92.setText("pavão");
            rdo93.setText("cacatua");
            rdo94.setText("peru");
        }
        btnProximo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela10.this, end.class);
                startActivity(intent);

                if(rdo94.isChecked()){
                    cp.setResp10("1");
                }
                finish();
            }
        });
    }
}