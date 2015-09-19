package com.example.dariochamorro.fragmentsii;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.dariochamorro.fragmentsii.adapters.PagerAdapter;
import com.example.dariochamorro.fragmentsii.fragments.ColorFragment;
import com.example.dariochamorro.fragmentsii.fragments.TitleFragment;

import java.util.ArrayList;
import java.util.List;

public class ColorActivity extends AppCompatActivity {

    ViewPager pager;
    List<TitleFragment> data;

    PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        pager = (ViewPager) findViewById(R.id.pager);

        data = new ArrayList<>();

        ColorFragment azul = new ColorFragment();
        azul.init(ColorFragment.COLOR_AZUL);
        data.add(azul);

        ColorFragment rojo = new ColorFragment();
        rojo.init(ColorFragment.COLOR_ROJO);
        data.add(rojo);

        ColorFragment amarillo = new ColorFragment();
        amarillo.init(ColorFragment.COLOR_AMARILLO);
        data.add(amarillo);

        ColorFragment verde = new ColorFragment();
        verde.init(ColorFragment.COLOR_VERDE);
        data.add(verde);

        ColorFragment violeta = new ColorFragment();
        violeta.init(ColorFragment.COLOR_VIOLETA);
        data.add(violeta);

        ColorFragment naranja= new ColorFragment();
        naranja.init(ColorFragment.COLOR_NARANJA);
        data.add(naranja);


        adapter = new PagerAdapter(getSupportFragmentManager(),data);
        pager.setAdapter(adapter);

    }



}
