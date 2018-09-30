package com.example.angela.conversordetemperatura;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;


public class Resultado extends AppCompatActivity{
   // public String temp;
  // public TextView resultadoTemp;
//
    @Override
    protected  void  onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView resultadoTemp = (TextView) findViewById(R.id.resultado);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String temp = (String) bundle.getString("result");
        resultadoTemp.setText(temp+" Fahrenheit");
    }
}
