package com.cursopluralsight.bruna.loginestudo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class telacadastrar extends AppCompatActivity {
    private EditText nome, senha;
    private Button salvar;

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacadastrar);

        nome = findViewById(R.id.nomeCadastarEditText);
        senha= findViewById(R.id.senhaCadastrarEditText);
        salvar = findViewById(R.id.btSalvar);




    }

    public void btVoltar (View view){
        Intent intent4 = new Intent(getApplicationContext(), telalogin.class);
        startActivity(intent4);
    }



    }

