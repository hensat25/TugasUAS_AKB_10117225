package com.example.tugasuasakb;

/**
 *
 * 12 Agustus 2020
 * NIM   : 10117225
 * Nama  : Hendri Satya Nugraha
 * Kelas : IF-7
 *
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class ListFragment extends Fragment {

    Button b1;
    Button b2;
    Button b3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        b1 = v.findViewById(R.id.btnSate);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SateFragment sateFragment = new SateFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, sateFragment);
                transaction.commit();
            }
        });

        b2 = v.findViewById(R.id.btnMonumen);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MonumenFragment monumenFragment = new MonumenFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, monumenFragment);
                transaction.commit();
            }
        });

        b3 = v.findViewById(R.id.btnBraga);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BragaFragment bragaFragment = new BragaFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, bragaFragment);
                transaction.commit();
            }
        });


        return v;
    }
}
