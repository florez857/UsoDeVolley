package com.example.intel.usodevolley;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PC on 26/02/2016.
 */
public class Adaptador extends RecyclerView.Adapter<Adaptador.holder> {

    ArrayList<Articulo> datos;

    public static class holder extends RecyclerView.ViewHolder {

        TextView titulo;
        TextView contenido;
        ImageView imagen;


        public holder(View vista){
            super(vista);

            titulo=(TextView)vista.findViewById(R.id.textView);
            contenido=(TextView)vista.findViewById(R.id.textView2);
            imagen=(ImageView) vista.findViewById(R.id.imageView);


        }
    }


    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {

               LayoutInflater layout= LayoutInflater.from(parent.getContext());
                        View vista = layout.inflate(R.layout.items,parent,false);
                    holder hol=new holder(vista);


        return hol;


    }

    @Override
    public void onBindViewHolder(holder holder, int position) {

        holder.titulo.setText(datos.get(position).getTitulo());
        holder.contenido.setText(datos.get(position).getContenido());
        holder.imagen.setImageResource(datos.get(position).getImagen());


    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
