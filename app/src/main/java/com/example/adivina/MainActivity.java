package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtAdivina;
    private Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAdivina = (TextView) findViewById(R.id.editTextAdivina);
        btnCheck = (Button) findViewById(R.id.buttonCheck);

    }
//METODO RANDOM:
    public int aleatorio(int a) {
        Random nAleatorio = new Random();
        int n = nAleatorio.nextInt(a);
        System.out.println("EL NUMERO ALEATORIO ES: " + n);
        return a;
    }

}