package com.example.revisinpruebai_2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPasaje extends RecyclerView.Adapter<AdaptadorPasaje.ViewHolder>{

    private ArrayList<Pasaje> viajes;

    public AdaptadorPasaje(ArrayList<Pasaje> viajes){
        this.viajes = viajes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.plantilla_pasaje, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.fecha.setText(viajes.get(position).getFecha());
        holder.valor.setText("$"+viajes.get(position).getValor());
        holder.id_secreto.setText(viajes.get(position).adicional());
    }

    @Override
    public int getItemCount() {
        return viajes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView fecha;
        private TextView valor;
        private TextView id_secreto;

        public ViewHolder(View itemView){
            super(itemView);

            fecha = itemView.findViewById(R.id.fechaViaje);
            valor = itemView.findViewById(R.id.valorViaje);
            id_secreto = itemView.findViewById(R.id.extraViaje);
        }

    }


}
