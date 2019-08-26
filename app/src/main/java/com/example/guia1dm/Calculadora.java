package com.example.guia1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {
    int contador = 0;
    int numero1 = 0;
    int resultado;
    boolean operacion = false;

    String mostrar ="";
    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        txt1= (TextView)findViewById(R.id.txt1calc);
    }




    public void sumar( String a )
    {
        String nume="";
       for (int i = 0; i< a.length(); i++ )
       {
           char s = a.charAt(i);
         /*  if(s == "+")
           {

           }
       else
           {
               nume = nume+ a;
           }
*/

       }
    }

    public void restas( Integer a )
    {
        numero1 = numero1 - a;
    }

    public void multiplicar( Integer a )
    {
        numero1 = numero1 * a;
    }

    public void dividir( Integer a )
    {
        numero1 = numero1 / a;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btn1:
            {

                    mostrar = mostrar + "1";
                   txt1.setText(mostrar);
                    /*if(operacion == true)
                    {
                        mostrar = mostrar + "+";
                        sumar(1);
                        operacion = false;
                    }*/
                break;
            }

            case R.id.btn2:
            {

                    mostrar = mostrar + "2";
                    txt1.setText(mostrar);


                break;
            }

            case R.id.btn3:
            {

                    mostrar = mostrar + "3";
                    txt1.setText(mostrar);


                break;
            }

            case R.id.btn4:
            {

                    mostrar = mostrar + "4";
                    txt1.setText(mostrar);


                break;
            }

            case R.id.btn5:
            {

                    mostrar = mostrar + "5";
                    txt1.setText(mostrar);


                break;
            }

            case R.id.btn6:
            {

                    mostrar = mostrar + "6";
                    txt1.setText(mostrar);


                break;
            }

            case R.id.btn7:
            {

                    mostrar = mostrar + "7";
                    txt1.setText(mostrar);


                break;
            }

            case R.id.btn8:
            {

                    mostrar = mostrar + "8";
                    txt1.setText(mostrar);


                break;
            }

            case R.id.btn9:
            {

                    mostrar = mostrar + "9";
                    txt1.setText(mostrar);


                break;
            }

            case R.id.btn0:
            {

                    mostrar = mostrar + "0";
                    txt1.setText(mostrar);


                break;
            }

            case R.id.btnac:
            {
                mostrar = "";
                txt1.setText("");

                break;
            }

            case R.id.btnmas:
            {
               operacion = true;

               mostrar = mostrar + "+";

                break;
            }
            case R.id.btnmenos:
            {
                operacion = true;
                mostrar = mostrar + "-";

                break;
            }
            case R.id.btndivision:
            {
                operacion = true;
                mostrar = mostrar + "/";

                break;
            }
            case R.id.btnmulti:
            {
                operacion = true;
                mostrar = mostrar + "*";

                break;
            }

            case R.id.btndel:
            {
                if (mostrar.length() > 0)
                {
                    mostrar = mostrar.substring(0, mostrar.length()-1);
                    txt1.setText(mostrar);
                }
                else { }

                break;
            }

        }

    }
}
