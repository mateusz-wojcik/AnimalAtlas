package com.example.rudy.moviesapp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Rudy on 10.04.2018.
 */

public class ImageAdapter extends BaseAdapter{

    private Context context;
    private LayoutInflater inflater;
    private AnimalContainer animalContainer;
    private int[] photos;

    public ImageAdapter(Context context){
        this.context = context;
        inflater = LayoutInflater.from(context);
        animalContainer = new AnimalContainer();
        photos = animalContainer.getArrayIconList().get(DisplayAnimal.getAnimalId());
    }

    @Override
    public int getCount() {
        return photos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = inflater.inflate(R.layout.image_grid_layout, null);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewGrdLayout);
        imageView.setImageResource(photos[position]);

        return convertView;
    }

}
