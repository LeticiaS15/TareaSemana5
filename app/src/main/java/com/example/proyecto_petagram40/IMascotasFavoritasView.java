package com.example.proyecto_petagram40;

import com.example.proyecto_petagram40.adapter.MascotasFavoritasAdapter;
import com.example.proyecto_petagram40.contenedor.Mascota;

import java.util.ArrayList;

public interface IMascotasFavoritasView {
    public void VerticalLinearLayout();
    public MascotasFavoritasAdapter iniciarAdaptador(ArrayList<Mascota> mascotas);
    public void iniciarAdpRV(MascotasFavoritasAdapter adapter);

}
