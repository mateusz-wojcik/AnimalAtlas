package com.example.rudy.moviesapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rudy on 10.04.2018.
 */

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<Food> itemList;
    private LayoutInflater inflater;

    public ListViewAdapter(Context photosFragment, ArrayList<Food> itemList){
        this.itemList = itemList;
        inflater = LayoutInflater.from(photosFragment);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            convertView = inflater.inflate(R.layout.single_list_item, null);
            holder = new ViewHolder();
            setHolderViews(holder, convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        setHolderFields(holder, position);

        return convertView;
    }

    public void setHolderViews(ViewHolder holder, View convertView){
        holder.holderImageView = convertView.findViewById(R.id.imageViewListItem);
        holder.sampleTitle = convertView.findViewById(R.id.nameTextView);
        holder.sampleDescription = convertView.findViewById(R.id.speciesTextView);

    }

    public void setHolderFields(ViewHolder holder, int position){
        holder.holderImageView.setImageResource(itemList.get(position).getIconId());
        holder.sampleTitle.setText(itemList.get(position).getFoodName());
        holder.sampleDescription.setText(itemList.get(position).getFoodSpecies());

    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

    static class ViewHolder{
        ImageView holderImageView;
        TextView sampleTitle, sampleDescription;
    }
}
