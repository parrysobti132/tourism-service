package com.example.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FoodStreetFragment extends Fragment {


    public FoodStreetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food_street, container, false);

        // No:- 1 Haleem activity

        TextView t1 = view.findViewById(R.id.haleem_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Activity_Foods_Haleem.class);
                startActivity(i1);
            }
        });

        // No:-2 Seekh kabab Activity

        TextView t2 = view.findViewById(R.id.seekh_kebab_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), Activity_Foods_Seekh.class);
                startActivity(i2);
            }
        });

        // No.3 Biryani activity

        TextView t3 = view.findViewById(R.id.biryani_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), Activity_Foods_Biryani.class);
                startActivity(i3);
            }
        });

        // No.4 halwa puri activty

        TextView t4 = view.findViewById(R.id.halwa_puri_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), Activity_Foods_Halwa.class);
                startActivity(i4);
            }
        });

        // No. 5 Methi lassi activity

        TextView t5 = view.findViewById(R.id.Lassi_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), Activity_Foods_Mitthi_Lassi.class);
                startActivity(i5);
            }
        });


        // No.6 Channay

        TextView t6 = view.findViewById(R.id.Chanay_textView);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), Activity_Foods_Chanaay.class);
                startActivity(i6);
            }
        });

        // No.7 Karahi

        TextView t7 = view.findViewById(R.id.karahi_textView);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getActivity(), Activity_Foods_Karakhi.class);
                startActivity(i7);
            }
        });


        return view;
    }

}
