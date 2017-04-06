package com.example.dm.dmass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import android.widget.Button;


public class MenuLateral extends AppCompatActivity {

    private AdView mBottomBanner;
    //private Toolbar mToolbar;
    public static final String DEVICE_ID = "1abf96472fb1a848d6b069e70630e46a";
    //public static final String DEVICE_ID = "1abf96472fb1a848d6b069e70630e46a"; lenovo

    Button Programs;
    Button AcercaDe;
    Button Parker;
    Button Petit;
    Button Huaiqui;
    Button Intro;
    Button Historia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lateral);


        //Ui
        //mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mBottomBanner = (AdView) findViewById(R.id.av_bottom_banner);


        // Setup
        //setUpToolbar();
        setUpBottomBanner();

        Programs = (Button) findViewById(R.id.IDPrograma);

        Programs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Programs = new Intent(MenuLateral.this, Programas.class);
                startActivity(Programs);
            }

        });

        Historia = (Button) findViewById(R.id.IDHistoria);

        Historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Historia = new Intent(MenuLateral.this, historia.class);
                startActivity(Historia);
            }

        });

        AcercaDe = (Button) findViewById(R.id.IDAcerca);

        AcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AcercaDe = new Intent(MenuLateral.this, AcercaDe.class);
                startActivity(AcercaDe);
            }

        });

        Parker = (Button) findViewById(R.id.IDParker);

        Parker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Parker = new Intent(MenuLateral.this, EdParker.class);
                startActivity(Parker);
            }

        });

        Petit = (Button) findViewById(R.id.IDPetit);

        Petit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Petit = new Intent(MenuLateral.this, petit.class);
                startActivity(Petit);
            }

        });

        Huaiqui = (Button) findViewById(R.id.IDRene);

        Huaiqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Huaiqui = new Intent(MenuLateral.this, huaiquimil.class);
                startActivity(Huaiqui);
            }

        });

        Intro = (Button) findViewById(R.id.IDIntro);

        Intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intro = new Intent(MenuLateral.this, intro.class);
                startActivity(Intro);
            }

        });

    }
    //private void setUpToolbar(setSupportActionBar(mToolbar){;
    //}

    private void setUpBottomBanner() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(DEVICE_ID)
                .build();
        mBottomBanner.loadAd(adRequest);

    }

    private void showDetailsUi() {
        startActivity(new Intent(this, MenuLateral.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mBottomBanner != null) {
            mBottomBanner.resume();
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        if (mBottomBanner != null) {
            mBottomBanner.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mBottomBanner != null) {
            mBottomBanner.destroy();
        }
    }

    private void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}

