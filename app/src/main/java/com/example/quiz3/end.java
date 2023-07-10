package com.example.quiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class end extends AppCompatActivity {
    TextView txtResultado, txtNota;
    Button btnRecomecar;
    compartilha cp = new compartilha();
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        txtResultado = findViewById(R.id.txtResultado);
        txtNota = findViewById(R.id.txtNota);
        btnRecomecar = findViewById(R.id.btnRecomecar);

        // GET
        //tela1
        String a = cp.getResp1();
        if(a == "1"){
            num = num+1;
        }
        //tela2
        String b = cp.getResp2();
        if(b == "1"){
            num = num+1;
        }
        //tela3
        String c = cp.getResp3();
        if(c == "1"){
            num = num+1;
        }
        //tela4
        String d = cp.getResp4();
        if(d == "1"){
            num = num+1;
        }
        //tela5
        String e = cp.getResp5();
        if(e == "1"){
            num = num+1;
        }
        //tela6
        String f = cp.getResp6();
        if(f == "1"){
            num = num+1;
        }
        //tela7
        String g = cp.getResp7();
        if(g == "1"){
            num = num+1;
        }
        //tela8
        String h = cp.getResp8();
        if(h == "1"){
            num = num+1;
        }
        //tela9
        String i = cp.getResp9();
        if(i == "1"){
            num = num+1;
        }
        //tela10
        String j = cp.getResp10();
        if(j == "1"){
            num = num+1;
        }
        txtResultado.setText(Integer.toString(num) + "/10");
        if(num == 10){
            txtNota.setText("MB");
        }
        else if(num >=8 && num<=9){
            txtNota.setText("B");
        }
        else if(num >=6 && num<=7){
            txtNota.setText("R");
        }
        else{
            txtNota.setText("I");
        }
        //BUTTON
        btnRecomecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Zerar a pontuação
                cp.setResp1("");
                cp.setResp2("");
                cp.setResp3("");
                cp.setResp4("");
                cp.setResp5("");
                cp.setResp6("");
                cp.setResp7("");
                cp.setResp8("");
                cp.setResp9("");
                cp.setResp10("");
                num = 0;
                txtResultado.setText(Integer.toString(num) + "/10");
                //remomeçar
                Intent intent = new Intent(end.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }
}