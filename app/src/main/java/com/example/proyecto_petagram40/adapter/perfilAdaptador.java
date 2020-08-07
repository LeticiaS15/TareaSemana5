package com.example.proyecto_petagram40.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.proyecto_petagram40.R;
import com.example.proyecto_petagram40.contenedor.Mascota;

import java.util.ArrayList;

public class perfilAdaptador extends RecyclerView.Adapter<perfilAdaptador.ProfileViewHolder> {

    ArrayList<Mascota> miMascota;

    public perfilAdaptador(ArrayList<Mascota> miMascota) {
        this.miMascota = miMascota;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mascota_perfil_card, parent, false);
        return new ProfileViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        Mascota publicacion = miMascota.get(position);

        holder.imgCV.setImageResource(publicacion.getFoto());
        holder.imgHuesoCV.setImageResource(publicacion.getFoto());
        holder.LikesCV.setText(String.valueOf(publicacion.getMeGustas()));
    }

    @Override
    public int getItemCount() {
        return miMascota.size();
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgCV;
        private TextView LikesCV;
        private ImageView imgHuesoCV;

        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCV = itemView.findViewById(R.id.imgCV);
            LikesCV = itemView.findViewById(R.id.LikesCV);
            imgHuesoCV= itemView.findViewById(R.id.imgHuesoCV);
        }
    }
}
