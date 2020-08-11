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
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Slider extends AppCompatActivity {

    ViewPager viewPager;
    Button btnNext;
    int[] layouts;
    com.example.tugasuasakb.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_slider);

        viewPager = findViewById(R.id.pager);
        btnNext = findViewById(R.id.nextBtn);

        layouts = new int[] {
                R.layout.slider1,
                R.layout.slider2,
                R.layout.slider3
        };

        adapter = new com.example.tugasuasakb.Adapter(this, layouts);
        viewPager.setAdapter(adapter);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(viewPager.getCurrentItem()+1 < layouts.length) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                } else {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
            }
        });

        viewPager.addOnPageChangeListener(viewPagerChangeListener);

    }

    ViewPager.OnPageChangeListener viewPagerChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int i) {
            if(i == layouts.length - 1) {
                btnNext.setText("Mulai");
            } else {
                btnNext.setText("Next");
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}