package com.example.myapplication.oficinas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.principal.MainActivity;

import java.util.List;

public class AdapterListaOficinas extends RecyclerView.Adapter<AdapterListaOficinas.ViewHolder>
{
    private List<Oficina> listaOficinas;
    private Context contexto;

    public AdapterListaOficinas(List<Oficina> dados, Context context)
    {
        this.listaOficinas = dados;
        this.contexto = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public AppCompatImageView imagemOficina;
        public AppCompatTextView tituloOficina;
        public ConstraintLayout constraintOficina;

        public ViewHolder(View v)
        {
            super(v);
            this.imagemOficina = v.findViewById(R.id.imagemOficina);
            this.tituloOficina = v.findViewById(R.id.tituloOficina);
            this.constraintOficina = v.findViewById(R.id.constraintOficina);
        }
    }

    @NonNull
    @Override
    public AdapterListaOficinas.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_oficina, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        Oficina oficina = listaOficinas.get(position);
        holder.imagemOficina.setImageResource(R.drawable.iconeoficina);
        holder.tituloOficina.setText(oficina.getNome());

        holder.constraintOficina.setOnClickListener(v ->
        {
            if (contexto instanceof MainActivity)
            {
                ((MainActivity) contexto).abrirDetalhesOficina(oficina);
            }
            else
            {
                Toast.makeText(contexto, "Erro ao tentar abrir os detalhes da oficina.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return listaOficinas.size();
    }

}
