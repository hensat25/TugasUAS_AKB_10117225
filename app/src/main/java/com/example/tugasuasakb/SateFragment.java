package com.example.tugasuasakb;

/**
 *
 * 12 Agustus 2020
 * NIM   : 10117225
 * Nama  : Hendri Satya Nugraha
 * Kelas : IF-7
 *
 */

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SateFragment extends Fragment {

    Button b1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_sate, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        b1 = layout.findViewById(R.id.btnMap);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SateMapsActivity.class);
                startActivity(intent);
            }
        });
        return layout;
    }
}