package com.example.tablasmultiplicar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    EditText txt1;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1= (EditText) findViewById(R.id.txtNum);
        btn1= (Button) findViewById(R.id.btn1);
        tv1= (TextView) findViewById(R.id.tv1);
    }

    public void Operar(View view) {

        int numero = Integer.parseInt(valueOf(txt1.getText()));
        tv1.setText("");
        String salida;
        int resultado;
        for (int i = 1; i <= 10; i++) {
            resultado=numero*i;
            salida = numero + " X " + i + " = " + resultado;
            tv1.append("\n"+salida);


        }
    }
}
