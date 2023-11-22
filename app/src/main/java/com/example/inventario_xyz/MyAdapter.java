package com.example.inventario_xyz;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context context;
    private List<DataClase> dataList;

    public MyAdapter(Context context, List<DataClase> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(dataList.get(position).getImgURL()).into(holder.recImage);
        holder.recTitle.setText(dataList.get(position).getNombre_comun());
        holder.recDesc.setText(dataList.get(position).getDesc());
        holder.recCience.setText(dataList.get(position).getNombre_cience());
        holder.recFamily.setText(dataList.get(position).getFamilia());


        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Detalle.class);
                intent.putExtra("imgURL", dataList.get(holder.getAdapterPosition()).getImgURL());
                intent.putExtra("desc", dataList.get(holder.getAdapterPosition()).getDesc());
                intent.putExtra("nombre_comun", dataList.get(holder.getAdapterPosition()).getNombre_comun());
                intent.putExtra("Key",dataList.get(holder.getAdapterPosition()).getKey());
                intent.putExtra("nombre_cience", dataList.get(holder.getAdapterPosition()).getNombre_cience());
                intent.putExtra("familia", dataList.get(holder.getAdapterPosition()).getFamilia());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void searchDataList(ArrayList<DataClase> searchList){
        dataList = searchList;
        notifyDataSetChanged();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder{

    ImageView recImage;
    TextView recTitle, recDesc, recCience, recFamily;
    CardView recCard;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        recImage = itemView.findViewById(R.id.recImage);
        recCard = itemView.findViewById(R.id.recCard);
        recDesc = itemView.findViewById(R.id.recDesc);
        recTitle = itemView.findViewById(R.id.recTitle);
        recCience = itemView.findViewById(R.id.recCience);
        recFamily = itemView.findViewById(R.id.recFamily);
    }
}
