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


public class intro extends AppCompatActivity {

    private AdView mBottomBanner;
    private Toolbar mToolbar;
    public static final String DEVICE_ID = "1abf96472fb1a848d6b069e70630e46a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        //Ui
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mBottomBanner = (AdView) findViewById(R.id.av_bottom_banner);


        // Setup
        setUpToolbar();
        setUpBottomBanner();

    }

    private void setUpToolbar() {
        setSupportActionBar(mToolbar);
    }

    private void setUpBottomBanner() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(DEVICE_ID)
                .build();
        mBottomBanner.loadAd(adRequest);

    }

    private void showDetailsUi() {
        startActivity(new Intent(this, historia.class));
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


