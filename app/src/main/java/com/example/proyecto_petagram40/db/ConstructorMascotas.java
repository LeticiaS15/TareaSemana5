package com.example.proyecto_petagram40.db;

import android.content.ContentValues;
import android.content.Context;

import com.example.proyecto_petagram40.R;
import com.example.proyecto_petagram40.contenedor.Mascota;

import java.util.ArrayList;

public class ConstructorMascotas {
    private static final int LIKE = 1;
    private Context context;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatosMascotas(){
        BaseDatos db = new BaseDatos(context);
        if(db.ActualizarMascota()){
            insertarMascotas(db);
        }
        return db.obtenerMascotas();
    }

    public void insertarMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBD.TABLE_MASCOTA_NOMBRE, "panchito");
        contentValues.put(ConstantesBD.TABLE_MASCOTA_FOTO, R.drawable.perro);
        db.insertarMascotas(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBD.TABLE_MASCOTA_NOMBRE, "panchito2");
        contentValues.put(ConstantesBD.TABLE_MASCOTA_FOTO, R.drawable.ic_camera_fab);
        db.insertarMascotas(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBD.TABLE_MASCOTA_NOMBRE, "pepito");
        contentValues.put(ConstantesBD.TABLE_MASCOTA_FOTO, R.drawable.perro);
        db.insertarMascotas(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBD.TABLE_MASCOTA_NOMBRE, "pequito");
        contentValues.put(ConstantesBD.TABLE_MASCOTA_FOTO, R.drawable.perro);
        db.insertarMascotas(contentValues);
    }

    public void darLikeMascota(Mascota mascota){
        BaseDatos bd = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBD.TABLE_LIKES_ID_PETS_FK, mascota.getId());
        contentValues.put(ConstantesBD.TABLE_LIKES_NUMERO, LIKE);
        bd.insertarMascotasFavoritas(contentValues);
    }

    public int obtenerLike(Mascota mascota){
        BaseDatos bd = new BaseDatos(context);
        return bd.obtenerLikes(mascota);
    }

}
