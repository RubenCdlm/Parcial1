package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView numerouno;
    private TextView numerodos;
    private TextView numerotres;
    private TextView idingresar;
    private Button IdRef;
    private Button Idmult;
    private Button button7;
    private TextView respuesta;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numerouno = (EditText) findViewById(R.id.numerouno);
        numerodos = (EditText) findViewById(R.id.numerodos);
        numerotres = (EditText) findViewById(R.id.numerotres);
        numerotres = (EditText) findViewById(R.id.numerotres);
        idingresar = (EditText) findViewById(R.id.idingresar);


        button7 =(Button) findViewById(R.id.button7);
        IdRef =(Button) findViewById(R.id.IdRef);
        Idmult =(Button) findViewById(R.id.Idmult);
        respuesta =(TextView) findViewById(R.id.respuesta);
        result =(TextView) findViewById(R.id.result);

    }
    public boolean validar(){
        boolean result = true;

        String valor = numerouno.getText().toString();
        String valor1 = numerodos.getText().toString();
        String valor2 = numerotres.getText().toString();

        if(valor.isEmpty())
        {
            numerouno.setError("Este campo no puede quedar vacio");
            result = false;
        }
        if(valor1.isEmpty())
        {
            numerodos.setError("Este campo no puede quedar vacio");
            result = false;
        }
        if(valor2.isEmpty())
        {
            numerotres.setError("Este campo no puede quedar vacio");
            result = false;
        }

        return result;
    }
    public void factorial(View view){

        if(validar()){
            int n = Integer.parseInt(numerouno.getText().toString());
            int result = 1;
            for(int i = 2; i <= n ; i++){
                result *= i;
            }

            int n1 = Integer.parseInt(numerodos.getText().toString());
            int result1 = 1;
            for(int i = 2; i <= n1 ; i++){
                result1 *= i;
            }
            int n2 = Integer.parseInt(numerotres.getText().toString());
            int result2 = 1;
            for(int i = 2; i <= n2 ; i++){
                result2 *= i;
            }

                double resultFin = (result+result1+result2);
              respuesta.setText("" +String.format(Locale.getDefault(),"%.0f",resultFin));
        }

    }
    public void Multipli(View view){

        if(validar()){
            int uno = Integer.parseInt(numerouno.getText().toString());
            int dos = Integer.parseInt(numerodos.getText().toString());
            int tres = Integer.parseInt(numerotres.getText().toString());

            int result =((uno * dos) + tres);
            respuesta.setText(result+ "");
        }

    }
    public void factorial2(View view){


            int n2 = Integer.parseInt(idingresar.getText().toString());
            int result2 = 1;
            for(int i = 2; i <= n2 ; i++){
                result2 *= i;
            }

            double resultFin = (result2);
            result.setText("" +String.format(Locale.getDefault(),"%.0f",resultFin));
        }




}