package com.example.proyecto_petagram40.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto_petagram40.R;
import com.example.proyecto_petagram40.contenedor.Mascota;
import com.example.proyecto_petagram40.db.ConstructorMascotas;

import java.util.ArrayList;

public class MascotasAdapter extends RecyclerView.Adapter<MascotasAdapter.MascotasViewHolder>{

    ArrayList<Mascota> misMascotas;
    int Likes;
    Activity activity;

    public MascotasAdapter(ArrayList<Mascota> misMascotas, Activity activity){
        this.misMascotas = misMascotas;
        this.activity = activity;
        this.Likes = 0;
    }

    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_mascota_card, parent, false);

        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotasViewHolder holder, int position) {
        final Mascota miMascota = misMascotas.get(position);

        holder.imgCV.setImageResource(miMascota.getFoto());
        holder.NombreCV.setText(miMascota.getNombre());
        holder.LikesCV.setText(String.valueOf(miMascota.getMeGustas()));

        holder.imgHuesoCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Likes == 0){
                    ConstructorMascotas constructorMascotas = new ConstructorMascotas(activity);
                    constructorMascotas.darLikeMascota(miMascota);
                    holder.LikesCV.setText(String.valueOf(constructorMascotas.obtenerLike(miMascota)));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return misMascotas.size();
    }

    public class MascotasViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgCV;
        private TextView NombreCV;
        private TextView LikesCV;
        private ImageView imgHuesoCV;

        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCV = itemView.findViewById(R.id.imgCV);
            NombreCV = itemView.findViewById(R.id.NombreCV);
            imgHuesoCV = itemView.findViewById(R.id.imgHuesoCV);
            LikesCV = itemView.findViewById(R.id.LikesCV);

        }
    }
}
