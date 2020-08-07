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

public class MascotasFavoritasAdapter extends RecyclerView.Adapter<MascotasFavoritasAdapter.MascotasFavoritasViewHolder>{

    ArrayList<Mascota> mascotasFavoritas;

    public MascotasFavoritasAdapter(ArrayList<Mascota> mascotasFavoritas) {
        this.mascotasFavoritas = mascotasFavoritas;
    }

    @NonNull
    @Override
    public MascotasFavoritasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mascota_favorita_card, parent, false);
        return new MascotasFavoritasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasFavoritasViewHolder holder, int position) {
        Mascota mascotaFavorita = mascotasFavoritas.get(position);

        holder.imgFVCV.setImageResource(mascotaFavorita.getFoto());
        holder. NombreFVCV.setText(mascotaFavorita.getNombre());
        holder.LikesFVCV.setText(String.valueOf(mascotaFavorita.getMeGustas()));
    }

    @Override
    public int getItemCount() {
        return mascotasFavoritas.size();
    }

    public class MascotasFavoritasViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFVCV;
        private TextView NombreFVCV;
        private TextView LikesFVCV;

        public MascotasFavoritasViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFVCV = itemView.findViewById(R.id.imgFVCV);
            NombreFVCV = itemView.findViewById(R.id.NombreFVCV);
            LikesFVCV = itemView.findViewById(R.id.LikesFVCV);
        }
    }
}
