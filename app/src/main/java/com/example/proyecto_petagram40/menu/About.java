package com.example.proyecto_petagram40.menu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.proyecto_petagram40.R;

public class About extends AppCompatActivity {

    private Toolbar aboutToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        aboutToolBar = findViewById(R.id.aboutToolbar);
        setSupportActionBar(aboutToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}