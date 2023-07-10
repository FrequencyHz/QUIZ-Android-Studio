package com.example.quiz3;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class tela9 extends AppCompatActivity {
    Button btnProximo9;
    RadioButton rdo82, rdo81, rdo84, rdo83;
    TextView txt9;
    compartilha cp = new compartilha();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela9);
        rdo82 = findViewById(R.id.rdo82);
        rdo81 = findViewById(R.id.rdo81);
        rdo83 = findViewById(R.id.rdo83);
        rdo84 = findViewById(R.id.rdo84);
        txt9 = findViewById(R.id.txt9);
        btnProximo9 = findViewById(R.id.btnProximo9);
        //SORTEAR
        String[] frage = {"Quem escreveu Os Lusíadas?", "Quais os nomes dos três Reis Magos?","Qual o nome do cientista que descobriu o processo de pasteurização ?"};
        Random random = new Random();
        int numb = random.nextInt(frage.length);
        txt9.setText(frage[numb]);
        //RESPOSTAS
        if(numb == 1){
            rdo81.setText("Gaspar, Nicolau e Natanael");
            rdo82.setText("Belchior, Gaspar e Baltazar");
            rdo83.setText("Gabriel, Benjamim e Melchior");
            rdo84.setText("Melchior, Noé e Galileu");
        }
        else if(numb == 2){
            rdo81.setText("Marie Curie");
            rdo82.setText("Louis Pasteur");
            rdo83.setText("Blaise Pascal");
            rdo84.setText("Antoine Lavoisier");
        }
        btnProximo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela9.this, tela10.class);
                startActivity(intent);
                if(rdo82.isChecked()){
                    cp.setResp9("1");
                }
                finish();
            }
        });
    }
}