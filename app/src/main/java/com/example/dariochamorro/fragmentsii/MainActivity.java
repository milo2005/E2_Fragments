package com.example.dariochamorro.fragmentsii;

import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.dariochamorro.fragmentsii.fragments.ColorFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    NavigationView nav;

    ColorFragment color;

    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color = new ColorFragment();
        color.init(ColorFragment.COLOR_AZUL);

        FragmentTransaction fT = getSupportFragmentManager().beginTransaction();
        fT.add(R.id.container, color);
        fT.commit();

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        nav = (NavigationView) findViewById(R.id.nav);

        nav.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this,drawer,R.string.open_nav, R.string.close_nav);

    }


    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.nav_azul:
                color.putColor(ColorFragment.COLOR_AZUL);
                break;
            case R.id.nav_rojo:
                color.putColor(ColorFragment.COLOR_ROJO);
                break;
            case R.id.nav_amarillo:
                color.putColor(ColorFragment.COLOR_AMARILLO);
                break;
            case R.id.nav_verde:
                color.putColor(ColorFragment.COLOR_VERDE);
                break;
            case R.id.nav_naranja:
                color.putColor(ColorFragment.COLOR_NARANJA);
                break;
            case R.id.nav_violeta:
                color.putColor(ColorFragment.COLOR_VIOLETA);
                break;
        }
        drawer.closeDrawers();

        return false;
    }
}
