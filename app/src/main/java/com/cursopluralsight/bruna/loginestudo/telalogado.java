package com.cursopluralsight.bruna.loginestudo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class telalogado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telalogado);
    }


    public void irTelalogin (View view){
        Intent intent2 = new Intent(getApplicationContext(), telalogin.class);
        startActivity(intent2);
    }
}
