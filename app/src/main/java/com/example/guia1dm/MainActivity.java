package com.example.guia1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private  Button btncalc;
    private  Button btlogin;
    private  Button btndata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



      btncalc = (Button)findViewById(R.id.btncalc);
      btlogin = (Button)findViewById(R.id.btnlog);
      btndata = (Button)findViewById(R.id.btndatos);

    }


    @Override
    public void onClick(View view) {

        Button a = (Button) view;
        switch (view.getId())
        {
            case R.id.btncalc:
            {
                Intent s = new Intent(this, Calculadora.class);
                startActivity(s);
                break;
            }

            case R.id.btndatos:
            {
                Intent s = new Intent(this, MisDatos.class);
                startActivity(s);
                break;
            }

            case R.id.btnlog:
            {
                Intent s = new Intent(this, Formulario.class);
                startActivity(s);
                break;
            }

        }


    }
}
