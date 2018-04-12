package com.example.rudy.moviesapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PhotosFragment extends Fragment {

    private GridView gridView;

    public PhotosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photos, container, false);
        this.gridView = view.findViewById(R.id.gridView);
        setReferences();

        return view;
    }

    public void setReferences(){
        this.gridView.setAdapter(new ImageAdapter(getActivity()));
    }

}
