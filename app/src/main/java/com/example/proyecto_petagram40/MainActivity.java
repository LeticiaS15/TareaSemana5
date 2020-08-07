package com.example.proyecto_petagram40;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;


import com.example.proyecto_petagram40.adapter.PageAdapter;
import com.example.proyecto_petagram40.fragment.HomeMascotaFragment;
import com.example.proyecto_petagram40.fragment.ProfileFragment;
import com.example.proyecto_petagram40.menu.About;
import com.example.proyecto_petagram40.menu.Contacto;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Toolbar materialToolBar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialToolBar = findViewById(R.id.mainToolBar);
        setSupportActionBar(materialToolBar);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        setUpViewPager();
    }

    private ArrayList<Fragment> addFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new HomeMascotaFragment());
        fragments.add(new ProfileFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), 1, addFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_icon);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_hueso);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.mEstrella:
                abrirFavoritos();
                break;

            case R.id.AcercaFavorito:
                Intent intentAbout = new Intent(MainActivity.this, About.class);
                startActivity(intentAbout);
                break;
            case R.id.ContactoFavorito:
                Intent intentContact = new Intent(MainActivity.this, Contacto.class);
                startActivity(intentContact);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void abrirFavoritos(){
        Intent intent = new Intent(MainActivity.this, MascotasFavoritas.class);
        startActivity(intent);
    }
}