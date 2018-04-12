package com.example.rudy.moviesapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Rudy on 09.04.2018.
 */

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private List<Animal> data = Collections.emptyList();
    private Context context;

    public ViewAdapter(Context context, List<Animal> data){
        this.inflater = LayoutInflater.from(context);
        this.data = data;
        this.context = context;
    }

    public void delete(int position){
        data.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_view_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Animal current = data.get(position);
        holder.imageView.setImageResource(current.getIconId());
        holder.animalNameTextView.setText(current.getAnimalName());
        holder.animalSpeciesTextView.setText(current.getAnimalSpecies());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageView;
        private TextView animalNameTextView, animalSpeciesTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            setReferences();
            itemView.setOnClickListener(this);
        }

        public void setReferences(){
            this.imageView = itemView.findViewById(R.id.imageViewGrdLayout);
            this.animalNameTextView = itemView.findViewById(R.id.animalNameTextView);
            this.animalSpeciesTextView = itemView.findViewById(R.id.animalSpeciesTextView);
        }

        @Override
        public void onClick(View v) {
            DisplayAnimal.startDisplayAnimalActivity(getAdapterPosition(), context);
        }
    }

}
