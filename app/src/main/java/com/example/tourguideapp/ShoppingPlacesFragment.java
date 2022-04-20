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


public class ShoppingPlacesFragment extends Fragment {


    public ShoppingPlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_shopping_places, container, false);

        // No.1
        // make new activty ( activity_shoppingPlaces_emporium )

        TextView t1 = view.findViewById(R.id.emporium_mall_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), acivity_shoppingPlaces_emporium.class);
                startActivity(i1);
            }
        });

        // No:2
        // make new activity ( activity_shoppingPlaces_fortress

        TextView t2 = view.findViewById(R.id.Fortress_sqaure_mall_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), activity_shoppingPlaces_fortress.class);
                startActivity(i2);
            }
        });


        // No.3
        // make new activity ( activity_shoppingPlaces_mall_lahore )

        TextView t3 = view.findViewById(R.id.mall_of_Lahore_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), activity_shoppingPlaces_mall_lahore.class);
                startActivity(i3);
            }
        });

        // No.4
        // make activity ( activity_shoppingPlaces_amanaah_mall )

        TextView t4 = view.findViewById(R.id.amanah_Mall_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), activity_shoppingPlaces_Amanah.class);
                startActivity(i4);
            }
        });

        // No.5
        // make activity ( activity_shoppingPlaces_packages )

        TextView t5 = view.findViewById(R.id.packages_Mall_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), activity_shoppingPlaces_packages.class);
                startActivity(i5);
            }
        });




        return view;
    }


}
