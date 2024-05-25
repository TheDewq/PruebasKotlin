package com.example.test3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class
listView extends RecyclerView.Adapter<listView.ViewHolder> {
    private List<listPersonas> lista;
    private LayoutInflater inflater;
    private Context context;

    public listView(List<listPersonas> lista, Context context) {
        this.lista = lista;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public listView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.itempersona,null);
        return new listView.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listView.ViewHolder holder, int position) {
        holder.bindData(lista.get(position));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre, telefono;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tvNombre);
            telefono = itemView.findViewById(R.id.tvTelefono);

        }

        public void bindData(listPersonas listPersonas) {
            nombre.setText(listPersonas.getNombre());
            telefono.setText(listPersonas.getTelefono());
        }
    }
}
