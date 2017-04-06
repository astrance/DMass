package com.example.dm.dmass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Programas extends AppCompatActivity {

    Button Blanco;
    Button Amarillos;
    Button Naranjo;
    Button Purpura;
    Button Azul;
    Button Verde;
    Button Cafe3;
    Button Cafe2;
    Button Cafe1;
    Button Negro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programas);

        Blanco = (Button) findViewById(R.id.IDBlanco);

        Blanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Blanco = new Intent(Programas.this, BlancoScroll.class);
                startActivity(Blanco);
            }
        });

        Amarillos = (Button) findViewById(R.id.IDAmarillo);

        Amarillos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Amarillos = new Intent(Programas.this, Amarillo.class);
                startActivity(Amarillos);
            }
        });

        Naranjo = (Button) findViewById(R.id.IDNaranjo);

        Naranjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Naranjo = new Intent(Programas.this, Naranjo.class);
                startActivity(Naranjo);
            }
        });

        Purpura = (Button) findViewById(R.id.IDPurpura);

        Purpura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Purpura = new Intent(Programas.this, purpura.class);
                startActivity(Purpura);
            }
        });

        Azul = (Button) findViewById(R.id.IDAzul);

        Azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Azul = new Intent(Programas.this, azul.class);
                startActivity(Azul);
            }
        });

        Verde = (Button) findViewById(R.id.IDVerde);

        Verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Verde = new Intent(Programas.this, verde.class);
                startActivity(Verde);
            }
        });

        Cafe3 = (Button) findViewById(R.id.IDCafe3);

        Cafe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cafe3 = new Intent(Programas.this, cafe3.class);
                startActivity(Cafe3);
            }
        });

        Cafe2 = (Button) findViewById(R.id.IDCafe2);

        Cafe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cafe2 = new Intent(Programas.this, Cafe2Kiu.class);
                startActivity(Cafe2);
            }
        });

        Cafe1 = (Button) findViewById(R.id.IDCafe1);

        Cafe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cafe1 = new Intent(Programas.this, cafe1.class);
                startActivity(Cafe1);
            }
        });

        Negro = (Button) findViewById(R.id.IDNegro);

        Negro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Negro = new Intent(Programas.this, negro.class);
                startActivity(Negro);
            }
        });
    }
}
