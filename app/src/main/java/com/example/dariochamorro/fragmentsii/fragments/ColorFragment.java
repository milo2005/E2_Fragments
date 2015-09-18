package com.example.dariochamorro.fragmentsii.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dariochamorro.fragmentsii.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    public static final int COLOR_AZUL=0;
    public static final int COLOR_ROJO=1;
    public static final int COLOR_AMARILLO=2;
    public static final int COLOR_VERDE=3;
    public static final int COLOR_NARANJA=4;
    public static final int COLOR_VIOLETA=5;

    int color;
    String colors[];
    int colorsHex[];

    TextView txt;

    public ColorFragment() {}

    public void init(int color){
        this.color = color;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        colors = context.getResources().getStringArray(R.array.colors);
        colorsHex = context.getResources().getIntArray(R.array.colors_hex);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_color, container, false);

        txt = (TextView) v.findViewById(R.id.txt);
        putColor(color);

        return v;
    }

    public void putColor(int color) {
        this.color = color;
        txt.setText(colors[color]);
        txt.setBackgroundColor(colorsHex[color]);
    }


}
