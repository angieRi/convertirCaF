package com.example.angela.conversordetemperatura;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    private EditText temp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp =(EditText)findViewById(R.id.in_temp);

    }

    public void onclickCalcular(View view) {
        //String temp = inTemp.getText().toString();

       /** if(temp.getText().length() == 0){
            Toast.makeText(this,"Ingrese una temperatura valida",Toast.LENGTH_SHORT).show();
            return;
        }**/

            float inputTemp = Float.parseFloat(temp.getText().toString());

          //  Bundle bundle = new Bundle();
            //bundle.putString("temp",this.convertirCaF(inputTemp).toString());
            Float result = this.convertirCaF(inputTemp);
            String resultado = result.toString();
            Intent intent = new Intent(MainActivity.this,Resultado.class);
            intent.putExtra("result",resultado);
            startActivity(intent);

    }

    //metodo q calcula la temperatura de celcius a fara
    private Float convertirCaF(float celcius) {

        return ((celcius * 9)/5) + 32 ;
    }
}
