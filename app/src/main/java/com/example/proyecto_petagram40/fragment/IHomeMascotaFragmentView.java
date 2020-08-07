package com.example.proyecto_petagram40.fragment;


import com.example.proyecto_petagram40.adapter.MascotasAdapter;
import com.example.proyecto_petagram40.contenedor.Mascota;

import java.util.ArrayList;

public interface IHomeMascotaFragmentView {
    public void createVerticalLinearLayout();
    public MascotasAdapter iniciarAdaptador(ArrayList<Mascota> mascotas);

  public  void iniciarAdpRV(MascotasAdapter adapter);
}
