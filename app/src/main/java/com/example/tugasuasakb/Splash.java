package com.example.tugasuasakb;

/**
 *
 * 10 Agustus 2020
 * NIM   : 10117225
 * Nama  : Hendri Satya Nugraha
 * Kelas : IF-7
 *
 */

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    LauncherManager launcherManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        launcherManager = new LauncherManager(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(launcherManager.isFirstTime()) {
                    launcherManager.setFirstLaunch(false);
                    Splash.this.finish();
                    startActivity(new Intent(getApplicationContext(),Slider.class));
                } else {
                    Splash.this.finish();
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
            }
        },2000);
    }
}