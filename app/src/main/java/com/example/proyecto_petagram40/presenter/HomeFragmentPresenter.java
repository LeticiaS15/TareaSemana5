package com.example.proyecto_petagram40.presenter;

import android.content.Context;


import com.example.proyecto_petagram40.contenedor.Mascota;
import com.example.proyecto_petagram40.db.ConstructorMascotas;
import com.example.proyecto_petagram40.fragment.IHomeMascotaFragmentView;

import java.util.ArrayList;

public class HomeFragmentPresenter implements IHomeFragmentPresenter {
    private IHomeMascotaFragmentView iHomeMascotaFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    ArrayList<Mascota> mascotas;

    public HomeFragmentPresenter(IHomeMascotaFragmentView iHomeMascotaFragmentView, Context context) {
        this.iHomeMascotaFragmentView = iHomeMascotaFragmentView;
        this.context = context;
        obtenerMascotas();
    }

    @Override
    public void obtenerMascotas() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatosMascotas();
        mostrarMascotas();
    }

    @Override
    public void mostrarMascotas() {
        iHomeMascotaFragmentView.iniciarAdpRV(iHomeMascotaFragmentView.iniciarAdaptador(mascotas));
        iHomeMascotaFragmentView.createVerticalLinearLayout();
    }
}
