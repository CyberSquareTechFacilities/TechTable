package com.example.techtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnIniciarCadastro;
    private Button btnEsqueciminhasenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaração botão para Registrar
        btnIniciarCadastro = (Button)findViewById(R.id.btnRegistrar);
        btnIniciarCadastro.setOnClickListener(view -> {
            abrirCadastroPt1();
        });

        //Declaração botão de Esqueci Minha Senha
        btnEsqueciminhasenha = (Button)findViewById(R.id.btnEsqueciSenha);
        btnEsqueciminhasenha.setOnClickListener(view -> {
            abrirEsqueciSenha();
        });
    }
        public void abrirCadastroPt1(){
            Intent intent = new Intent(this, CadastroPt1.class);
            startActivity(intent);
        }

        public void abrirEsqueciSenha(){
            Intent intent = new Intent(this,EsqueciSenha.class);
            startActivity(intent);
        }
}