package com.example.proyecto_petagram40.presenter;

import android.content.Context;


import com.example.proyecto_petagram40.IMascotasFavoritasView;
import com.example.proyecto_petagram40.contenedor.Mascota;
import com.example.proyecto_petagram40.db.ConstructorMascotasFavoritas;

import java.util.ArrayList;

public class MascotasFavoritasPresenter implements IMascotasFavoritasPresenter {
    private IMascotasFavoritasView iMascotasFavoritasView;
    private Context context;
    private ArrayList<Mascota> mascotasFavoritas;

    public MascotasFavoritasPresenter(IMascotasFavoritasView iMascotasFavoritasView, Context context) {
        this.iMascotasFavoritasView = iMascotasFavoritasView;
        this.context = context;
        obtenerMascotasFavoritas();
    }

    @Override
    public void obtenerMascotasFavoritas() {
        ConstructorMascotasFavoritas constructor = new ConstructorMascotasFavoritas(context);
        mascotasFavoritas = constructor.obtenerMascotasFavoritas();
        mostrarMascotasFavoritas();
    }

    @Override
    public void mostrarMascotasFavoritas() {
        iMascotasFavoritasView.iniciarAdpRV(iMascotasFavoritasView.iniciarAdaptador(mascotasFavoritas));
        iMascotasFavoritasView.VerticalLinearLayout();
    }
}
