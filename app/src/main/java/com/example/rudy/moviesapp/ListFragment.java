package com.example.rudy.moviesapp;


import android.app.LauncherActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private AnimalContainer animalContainer;
    private ArrayList<Food> itemList;
    private ListView listView;

    public ListFragment() {
        // Required empty public constructor
    }

    public void setReferences(){
        animalContainer = new AnimalContainer();
        itemList = animalContainer.getDogeFoodList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setReferences();
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        listView = view.findViewById(R.id.listView);
        listView.setAdapter(new ListViewAdapter(getActivity(), itemList));

        return view;
    }

}
