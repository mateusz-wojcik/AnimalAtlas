package com.example.rudy.moviesapp;

/**
 * Created by Rudy on 12.04.2018.
 */

public class Food {

    private String name, species;
    private int iconId;

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getFoodName() {
        return name;
    }

    public void setFoodName(String animalName) {
        this.name = animalName;
    }

    public String getFoodSpecies() {
        return species;
    }

    public void setFoodSpecies(String animalSpecies) {
        this.species = animalSpecies;
    }
}
