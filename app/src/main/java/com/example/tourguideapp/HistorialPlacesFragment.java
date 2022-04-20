package com.example.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HistorialPlacesFragment extends Fragment  {


    Activity context;

    public HistorialPlacesFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_historial_places, container, false);

        // No:- 1

        TextView t1 = view.findViewById(R.id.lahore_fort_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), ActivityHistoricalLahoreFort.class);
                startActivity(i1);
            }
        });

        // No:-2

        TextView t2 = view.findViewById(R.id.cypress_tomb_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), Activity_Historical_cypress.class);
                startActivity(i2);
            }
        });

        // No:-3

        TextView t3 = view.findViewById(R.id.khan_e_jahan_tomb_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), Activity_Historical_khan_Jahan.class);
                startActivity(i3);
            }
        });

        // No:-4

        TextView t4 = view.findViewById(R.id.Gulabi_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), Activity_Historical_Gulabi.class);
                startActivity(i4);
            }
        });

        // No:-5

        TextView t5 = view.findViewById(R.id.Mosque_Mariyum_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), Activity_Historical_mariyam.class);
                startActivity(i5);
            }
        });


        // No:-6


        TextView t6 = view.findViewById(R.id.haveli_textView);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), Activity_Historical_haveli.class);
                startActivity(i6);
            }
        });







        return view;
    }




}
