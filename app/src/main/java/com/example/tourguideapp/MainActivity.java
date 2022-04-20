package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewpager = findViewById(R.id.view_pager);

        ViewAdapterPage adpter = new ViewAdapterPage(this, getSupportFragmentManager());

        viewpager.setAdapter(adpter);

        TabLayout tablayout = findViewById(R.id.tab_layout);
        tablayout.setupWithViewPager(viewpager);

    }
}
