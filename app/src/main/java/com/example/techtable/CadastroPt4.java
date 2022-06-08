package com.example.techtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastroPt4 extends AppCompatActivity {
    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pt4);

        btnVoltar = findViewById(R.id.btnVoltarparalogin);

        btnVoltar.setOnClickListener(view ->{
            irParaLogin();
        });
    }
    public void irParaLogin(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}