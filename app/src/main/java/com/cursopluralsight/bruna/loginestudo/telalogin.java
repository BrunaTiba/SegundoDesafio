package com.cursopluralsight.bruna.loginestudo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class telalogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telalogin);



    }

    public void btTelaLogin(View view) {

        final EditText nome = (EditText) findViewById(R.id.nomeEditText);
        final EditText senha = (EditText) findViewById(R.id.senhaEditText);

        Button gravar = (Button) findViewById(R.id.btSalvar);
        gravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor ed= prefs.edit();

                ed.putString ("nome", nome.getText().toString());
                ed.putString ("senha", senha.getText().toString());

                ed.apply();
                Toast.makeText(getBaseContext(), "Cadastro realizado com sucesso", Toast.LENGTH_LONG).show();

                Button limpar = (Button) findViewById(R.id.btLimpar);
                limpar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nome.setText("");
                        senha.setText("");
                    }
                });
                Button recuperar = (Button) findViewById(R.id.btnRecuperar);
                recuperar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
                        nome.setText(prefs.getString("nome", "Não tem"));
                        senha.setText(prefs.getString("email", "Não tem"));
                    }
                });

            }
        });

         //EditText nome = (EditText) findViewById(R.id.nomeCadastarEditText);
         //EditText senha = (EditText) findViewById(R.id.senhaCadastrarEditText);
        //SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);

       // SharedPreferences.Editor ed= prefs.edit();

        //ed.putString ("nome", nome.getText().toString());
       // ed.putString ("senha", senha.getText().toString());

       // ed.apply();
        //Toast.makeText(getBaseContext(), "Cadastro realizado com sucesso", Toast.LENGTH_LONG).show();


        //TextView nomeEditText = (TextView) findViewById(R.id.nomeEditText);
        //TextView senhaEditText = (TextView) findViewById(R.id.senhaEditText);
        //String nome = nomeEditText.getText().toString();
        //String senha = senhaEditText.getText().toString();
        if (nome.equals("nome") && senha.equals("senha")) {

            Intent intent1 = new Intent(getApplicationContext(), telalogado.class);
            startActivity(intent1);

        }else {

            AlertDialog AlertDialog;
            AlertDialog = new AlertDialog.Builder(this).create();
            AlertDialog.setTitle("Parabéns!!!");
            AlertDialog.setMessage("Login invalido, favor realizar cadastro");
            AlertDialog.show();
        }
    }

    public void btCadastrar (View view) {
        Intent intent3 = new Intent(getApplicationContext(), telacadastrar.class);
        startActivity(intent3);
    }
}