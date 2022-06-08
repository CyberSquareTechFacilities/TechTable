package com.example.techtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class VerificarEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificar_email);
    }
    public boolean VerificadorEmail(String email){

        if (email == "teste"){
            return true;

        }else{
            return false;
        }


    }

}