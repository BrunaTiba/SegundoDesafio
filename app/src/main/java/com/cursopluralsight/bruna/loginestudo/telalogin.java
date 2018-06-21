package com.cursopluralsight.bruna.loginestudo;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class telalogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telalogin);
    }

    public void btTelaLogin(View view) {
        TextView nomeEditText = (TextView) findViewById(R.id.nomeEditText);
        TextView senhaEditText = (TextView) findViewById(R.id.senhaEditText);
        String nome = nomeEditText.getText().toString();
        String senha = senhaEditText.getText().toString();
        if (nome.equals("bruna") && senha.equals("123")) {

            Intent intent1 = new Intent(getApplicationContext(), telalogado.class);
            startActivity(intent1);

        }else {

            AlertDialog AlertDialog;
            AlertDialog = new AlertDialog.Builder(this).create();
            AlertDialog.setTitle("Parabéns!!!");
            AlertDialog.setMessage("Login invalido");
            AlertDialog.show();
        }
    }

    public void btCadastrar (View view) {
        Intent intent3 = new Intent(getApplicationContext(), telacadastrar.class);
        startActivity(intent3);
    }
}