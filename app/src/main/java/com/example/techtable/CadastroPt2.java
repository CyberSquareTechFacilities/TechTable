package com.example.techtable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

public class CadastroPt2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pt2);
        View btnPt3 = findViewById(R.id.btnProsseguirPara3);
        btnPt3.setOnClickListener(view ->{
                irParaPt3();
        });
        }
        public void irParaPt3(){
            Intent intent = new Intent(this, CadastroPt3.class);
            startActivity(intent);
        }


}
