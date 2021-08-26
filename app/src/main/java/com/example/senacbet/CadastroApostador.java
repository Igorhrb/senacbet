package com.example.senacbet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.senacbet.model.Apostador;

public class CadastroApostador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_apostador);

        Button buttonCadastrar = findViewById(R.id.activity_cadastro_button_cadastrar);

        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Apostador apostador = new Apostador();
                EditText nome = findViewById(R.id.activity_cadastro_nome);
                EditText saldo = findViewById(R.id.activity_cadastro_saldo);
                EditText email = findViewById(R.id.activity_cadastro_email);

                apostador.setNome(nome.getText().toString());
                apostador.setSaldo(saldo.getText().toString());
                apostador.setEmail(email.getText().toString());

                finish();
            }

        });
    }




}