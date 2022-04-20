package com.example.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotels, container, false);

        // No:-1
        // Luxus Grand hotel action perform and open new activity ( activity_Hotels_Luxus )

        TextView t1 = view.findViewById(R.id.luxus_hotel_textView);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), activity_Hotels_Luxus.class);
                startActivity(i1);
            }
        });


        // No:2
        // Heritage luxury suites action perform and open new activity ( activity_hotels_Heritage_luxury )

        TextView t2 = view.findViewById(R.id.heritage_hotel_textView);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), activity_hotels_Heritage_luxury.class);
                startActivity(i2);
            }
        });



        // No:- 3
        // Pearl COntinental action perform and open new activity ( activity_Hotels_PC )

        TextView t3 = view.findViewById(R.id.pc_textView);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), activity_Hotels_PC.class);
                startActivity(i3);
            }
        });

        // No:- 4
        // Nishat hotel action perform and open new activity ( activity_Hotels_nishat )

        TextView t4 = view.findViewById(R.id.Nishat_hotel_textView);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), activity_Hotels_nishat.class);
                startActivity(i4);
            }
        });

        // No:5
        // Avari lahore action perform and open new activity ( actvity_hotels_avari )

        TextView t5 = view.findViewById(R.id.Avari_hotel_textView);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), activity_hotels_avari.class);
                startActivity(i5);
            }
        });





        return view;
    }


}
