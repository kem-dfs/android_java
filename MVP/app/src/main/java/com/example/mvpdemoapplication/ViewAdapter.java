package com.example.mvpdemoapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ItemHolder> {

    ArrayList<Model> list;
    Context context;

    public ViewAdapter(Context context, ArrayList<Model> modelList){
        this.context = context;
        this.list = modelList;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        Model model = list.get(position);
        holder.title.setText(model.getTitle());
        holder.subTitle.setText(model.getSubTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    //Implement this first for item mapping
    static class ItemHolder extends RecyclerView.ViewHolder{
        TextView title, subTitle;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            subTitle = itemView.findViewById(R.id.subtitle);
        }
    }
}
