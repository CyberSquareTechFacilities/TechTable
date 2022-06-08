package com.example.techtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.techtable.VerificarEmail;


public class EsqueciSenha extends AppCompatActivity {

    private Button btnRecuSenha;
    TextView txtSucesso;
    EditText txtEmail;
    int laranja = Color.parseColor("#e05017");

    VerificarEmail vf = new VerificarEmail();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);

        txtEmail = findViewById(R.id.txtEmail3);

        txtSucesso = findViewById(R.id.txtConfirmacao);

        btnRecuSenha = findViewById(R.id.btnRecuperarSenha);
        btnRecuSenha.setOnClickListener(view -> {
            String email = txtEmail.getText().toString();
            Boolean taCerto = vf.VerificadorEmail(email);

            if(vf.VerificadorEmail(email) == true){
                txtSucesso.setText("Email enviado com sucesso!");
            } else{
                txtSucesso.setText("Insira um email válido!");
                txtSucesso.setTextColor(laranja);
            }
        });
    }


}