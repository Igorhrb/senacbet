package com.example.senacbet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.senacbet.dao.ApostadoresDAO;
import com.example.senacbet.model.Apostador;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.activity_principal_button_cadastro_apostadores);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CadastroApostador.class);
                startActivity(intent);
            }
        });

//        Button buttonvoltar = findViewById(R.id.activity_cadastro_button_voltar);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(new CadastroApostador().this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
//
    }

    @Override
    protected void onResume() {
        super.onResume();
        ListView view = findViewById(R.id.activity_principal_apostadores);

        view.setAdapter(new ArrayAdapter<Apostador>(MainActivity.this, android.R.layout.simple_list_item_1, ApostadoresDAO.listar()));

    }

}

