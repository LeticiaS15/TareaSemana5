package com.example.proyecto_petagram40.db;

import android.content.Context;


import com.example.proyecto_petagram40.contenedor.Mascota;

import java.util.ArrayList;

public class ConstructorMascotasFavoritas {
    private Context context;

    public ConstructorMascotasFavoritas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerMascotasFavoritas(){
        BaseDatos db = new BaseDatos(context);
        return  db.obtenerMascotasFavoritas();
    }

}
