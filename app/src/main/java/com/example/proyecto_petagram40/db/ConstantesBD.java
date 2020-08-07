package com.example.proyecto_petagram40.db;

public class ConstantesBD {
    public  static final String DATABASE_NAME = "mascotas";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_PERRITO = "usuario";
    public static final String TABLE_PERRITO_ID = "usuario_id";
    public static final String TABLE_PERRITO_UPDATE = "datos_cargados";

    public static final String TABLE_MASCOTA = "mascota";
    public static final String TABLE_MASCOTA_ID = "mascota_id";
    public static final String TABLE_MASCOTA_NOMBRE = "nombre";
    public static final String TABLE_MASCOTA_FOTO = "foto";

    public static final String TABLE_LIKES = "likes";
    public static final String TABLE_LIKES_ID = "likes_id";
    public static final String TABLE_LIKES_ID_PETS_FK = "nombre_id";
    public static final String TABLE_LIKES_NUMERO = "numero_likes";
}
