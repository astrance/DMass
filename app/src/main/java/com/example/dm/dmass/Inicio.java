package com.example.dm.dmass;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Inicio extends AppCompatActivity {

    Button Siguiente;
    //TextView TV;     //declaramos nuestroTEXTVIEW de nuestro LAYOUT

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Siguiente = (Button) findViewById(R.id.btn1);

        Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Siguiente = new Intent(Inicio.this, MenuLateral.class);
                startActivity(Siguiente);
            }

        });

        //TV = (TextView) findViewById(R.id.tx_logo);   //definimos en ONCREATE donde esta por                                                                                                     //medio de un ID

        //String font_path = "font/segoeui.ttf";  //definimos un STRING con el valor PATH ( o ruta por                                                                                    //donde tiene que buscar ) de nuetra fuente

        //Typeface TF = Typeface.createFromAsset(getAssets(), font_path);

        //llamanos a la CLASS TYPEFACE y la definimos con un CREATE desde                                                    //ASSETS con la ruta STRING

        //TV.setTypeface(TF);   //finalmente aplicamos TYPEFACE al TEXTVIEW

    }


}

