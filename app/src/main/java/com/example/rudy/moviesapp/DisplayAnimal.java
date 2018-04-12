package com.example.rudy.moviesapp;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DisplayAnimal extends AppCompatActivity {

    private ImageView imageView;
    private TextView animalNameTextView, animalSpeciesTextView;
    private ConstraintLayout constraintLayout;
    private ViewPager viewPager;
    private com.example.rudy.moviesapp.PagerAdapter pagerAdapter;
    private List<Fragment> fragments;
    private static int animalId;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_animal);
        fillFragments();
        setReferences();
        setFields();
        setBackgroundColor();
        setAppTitle();
    }

    public void setReferences(){
        this.imageView = findViewById(R.id.imageViewGrdLayout);
        this.animalNameTextView = findViewById(R.id.animalNameTextView);
        this.animalSpeciesTextView = findViewById(R.id.animalSpeciesTextView);
        this.viewPager = findViewById(R.id.viewPager);
        this.constraintLayout = findViewById(R.id.constraintLayoutDisplayAnimal);
        this.pagerAdapter = new PagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(pagerAdapter);
    }

    public void fillFragments(){
        fragments = new ArrayList<>();
        fragments.add(new PhotosFragment());
        fragments.add(new ListFragment());
    }

    public void setFields(){
        setImage();
        setAnimalName();
        setAnimalSpecies();
    }

    public void setImage(){
        this.imageView.setImageResource(MainActivity.getAnimalList().get(animalId).getIconId());
    }

    public void setAnimalName(){
        this.animalNameTextView.setText(MainActivity.getAnimalList().get(animalId).getAnimalName());
    }

    public void setAnimalSpecies(){
        this.animalSpeciesTextView.setText(MainActivity.getAnimalList().get(animalId).getAnimalSpecies());
    }

    public void setAppTitle(){
        getSupportActionBar().setTitle(animalNameTextView.getText() + " " + getString(R.string.review));
    }

    public static void startDisplayAnimalActivity(int animalId, Context context){
        DisplayAnimal.animalId = animalId;
        context.startActivity(new Intent(context, DisplayAnimal.class));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void setBackgroundColor(){
        //nazwy po polsku specjalnie (żarcik)
        switch (animalSpeciesTextView.getText().toString()){
            case "Ssak":
                constraintLayout.setBackground(getDrawable(R.drawable.mammal_background_color));
                break;
            case "Ptak":
                constraintLayout.setBackground(getDrawable(R.drawable.bird_background_color));
                break;
        }
    }

    public static int getAnimalId(){
        return animalId;
    }


}
