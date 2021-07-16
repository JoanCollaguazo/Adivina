package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtAdivina;
    private Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAdivina = (TextView) findViewById(R.id.editTextAdivina);
        btnCheck = (Button) findViewById(R.id.buttonCheck);
        btnCheck.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnCheck) {
            System.out.println("HOLA ESTOY DANDO CLICK");
            if (txtAdivina.getText().toString().isEmpty()) {
                txtAdivina.setError("escribe un numero");
            } else {
                iniciarIntent();
            }
        }
    }
    public void iniciarIntent(){
        try {
            int num=Integer.valueOf(txtAdivina.getText().toString());
            Intent intent = new Intent(MainActivity.this,ResultadoActivity.class);
            intent.putExtra("number",num);
            startActivity(intent);

        }catch (NumberFormatException num){
            txtAdivina.setError(getResources().getString(R.string.error_numero));
        }

    }


}