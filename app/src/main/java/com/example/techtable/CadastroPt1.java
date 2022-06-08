package com.example.techtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CadastroPt1 extends AppCompatActivity {
    private Button btnPt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pt1);

        btnPt2 = findViewById(R.id.btnCadastrar);
        btnPt2.setOnClickListener(view ->{
            irParaPt2();
        });
    }
    public void irParaPt2(){
        Intent intent = new Intent(this, CadastroPt2.class);
        startActivity(intent);
    }
}