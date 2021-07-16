package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txtRespuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        int numAd = 0;
        Bundle extra = getIntent().getExtras();
        numAd = extra.getInt("number");
        verificar(numAd);
        txtRespuesta = (TextView) findViewById(R.id.txtresultado);

    }

    public void verificar(int num) {

        int nAl = aleatorio(3);

        if (num == nAl) {
            txtRespuesta.setText("GANASTE!");
            txtRespuesta.setTextColor(Color.GREEN);
        } else {
            txtRespuesta.setText("PERDISTE!");
            txtRespuesta.setTextColor(Color.RED);
        }
    }

    //METODO RANDOM:
    public int aleatorio(int a) {
        Random nAleatorio = new Random();
        int n = nAleatorio.nextInt(a);
        return n;
    }

}