package com.example.techtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class CadastroPt3 extends AppCompatActivity {
    Button buttonVegano;
    Button buttonVegetariano;
    Button buttonProsseguir;
    Button btnPt4;
    CheckBox nenhumaOp;

    int laranja = Color.parseColor("#e05017");
    int branco = Color.parseColor("#ffffff");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pt3);

        buttonVegetariano = findViewById(R.id.btnVegetariano);
        buttonVegano = findViewById(R.id.btnVegano);
        buttonProsseguir = findViewById(R.id.btnProsseguirPara4);
        nenhumaOp = findViewById(R.id.chkNenhum);
        btnPt4 = findViewById(R.id.btnProsseguirPara4);

        buttonVegano.setBackgroundColor(branco);
        buttonVegetariano.setBackgroundColor(branco);

        buttonVegano.setOnClickListener(view ->{
            clickVegano();
        });

        buttonVegetariano.setOnClickListener(view ->{
            clickVegetariano();
        });
        nenhumaOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nenhumaOp.isChecked()){
                    trocaCor(branco, branco, laranja, laranja);
                    liberarBotaoProsseguir();
                }else{
                    trocaCor(branco, branco, laranja, laranja);
                }
            }
        });


        btnPt4.setOnClickListener(view ->{
            irParaPt4();
        });
    }



    public void liberarBotaoProsseguir(){
        buttonProsseguir.setEnabled(true);
        buttonProsseguir.setBackgroundColor(laranja);
        buttonProsseguir.setTextColor(branco);
    }

    public void trocaCor(int bgcVegan, int bgcVege, int coVegan, int coVege){

        buttonVegano.setBackgroundColor(bgcVegan);
        buttonVegetariano.setBackgroundColor(bgcVege);

        buttonVegano.setTextColor(coVegan);
        buttonVegetariano.setTextColor(coVege);

    }


    public void clickVegano(){
        trocaCor(laranja, branco, branco, laranja);
        liberarBotaoProsseguir();
        if(nenhumaOp.isChecked()){
            nenhumaOp.toggle();
        }

    }
    public void clickVegetariano(){
        trocaCor(branco, laranja, laranja, branco);
        liberarBotaoProsseguir();
        if(nenhumaOp.isChecked()){
            nenhumaOp.toggle();
        }
    }

    public void irParaPt4(){
        Intent intent = new Intent(this, CadastroPt4.class);
        startActivity(intent);
    }

}