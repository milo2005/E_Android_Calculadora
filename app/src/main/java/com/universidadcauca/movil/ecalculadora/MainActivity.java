package com.universidadcauca.movil.ecalculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    EditText num1, num2;
    Button bSumar, bRestar, bMul, bDiv;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        num1 = (EditText) findViewById(R.id.numero1);
        num2 = (EditText) findViewById(R.id.numero2);

        bSumar = (Button) findViewById(R.id.btn_sumar);
        bRestar = (Button) findViewById(R.id.btn_restar);
        bMul = (Button) findViewById(R.id.btn_mul);
        bDiv = (Button) findViewById(R.id.btn_div);

        result = (TextView) findViewById(R.id.rta);

        bSumar.setOnClickListener(this);
        bRestar.setOnClickListener(this);
        bMul.setOnClickListener(this);
        bDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int numero1 = Integer.parseInt(n1);
        int numero2 = Integer.parseInt(n2);

        if(numero2 != 0) {
            int rta = 0;
            switch (v.getId()) {
                case R.id.btn_sumar:
                    rta = numero1 + numero2;
                    break;
                case R.id.btn_restar:
                    rta = numero1 - numero2;
                    break;
                case R.id.btn_mul:
                    rta = numero1 * numero2;
                    break;
                case R.id.btn_div:
                    rta = numero1 / numero2;
                    break;
            }

            result.setText("" + rta);
        }else{
            //String inf = getString(R.string.calculadora_infinito);
            //String inf = getResources().getString(R.string.calculadora_infinito);
            result.setText(R.string.calculadora_infinito);


        }

    }
}
