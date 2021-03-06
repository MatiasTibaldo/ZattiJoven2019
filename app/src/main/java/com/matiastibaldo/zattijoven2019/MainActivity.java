package com.matiastibaldo.zattijoven2019;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.matiastibaldo.zattijoven2019.Fragmentos.CancioneroAnimacion;
import com.matiastibaldo.zattijoven2019.Fragmentos.Convertirnos;
import com.matiastibaldo.zattijoven2019.Fragmentos.Cronograma;
import com.matiastibaldo.zattijoven2019.Fragmentos.Discernir;
import com.matiastibaldo.zattijoven2019.Fragmentos.Escuchar;
import com.matiastibaldo.zattijoven2019.Fragmentos.Fascinar;
import com.matiastibaldo.zattijoven2019.Fragmentos.Ficha1;
import com.matiastibaldo.zattijoven2019.Fragmentos.Ficha2;
import com.matiastibaldo.zattijoven2019.Fragmentos.Ficha3;
import com.matiastibaldo.zattijoven2019.Fragmentos.Home;
import com.matiastibaldo.zattijoven2019.Fragmentos.CancioneroMeditacion;
import com.matiastibaldo.zattijoven2019.Fragmentos.Oracion1;
import com.matiastibaldo.zattijoven2019.Fragmentos.Oracion2;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


          CargarFragmento(new Home());
        navigationView.getMenu().getItem(0).setChecked(false);
//       navigationView.getMenu().getItem(0).setChecked(true);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

            // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_fascinar) {
            CargarFragmento(new Fascinar());
//            item.setChecked(true);
        } else if (id == R.id.nav_escuchar) {
            CargarFragmento(new Escuchar());
//            item.setChecked(true);
        } else if (id == R.id.nav_discernir) {
            CargarFragmento(new Discernir());
        } else if (id == R.id.nav_convertirnos) {
            CargarFragmento(new Convertirnos());
        } else if (id == R.id.nav_cronograma) {
            CargarFragmento(new Cronograma());
        } else if (id == R.id.nav_cancionero_animacion) {
            CargarFragmento(new CancioneroAnimacion());
        } else if (id == R.id.nav_cancionero_meditacion) {
            CargarFragmento(new CancioneroMeditacion());
        }else if (id == R.id.nav_ficha1) {
            CargarFragmento(new Ficha1());
        }else if (id == R.id.nav_ficha2) {
            CargarFragmento(new Ficha2());
        }else if (id == R.id.nav_ficha3) {
            CargarFragmento(new Ficha3());
        }else if (id == R.id.nav_oracion1) {
            CargarFragmento(new Oracion1());
        }else if (id == R.id.nav_oracion2) {
            CargarFragmento(new Oracion2());
        }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void CargarFragmento(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.contenedorFragmento, fragment).commit();


    }
}
