package com.example.rudy.moviesapp;

import java.util.ArrayList;

/**
 * Created by Rudy on 10.04.2018.
 */

public class AnimalContainer {

    private int[] icons = {R.drawable.cat, R.drawable.doge3x2,  R.drawable.pigeon_3x2, R.drawable.goat_3x2, R.drawable.lion_3x2};
    private String[] animalNames = {"Koteł", "Pieseł", "Gołąb", "Koza", "Lew"};
    private String[] animalSpecies = {"Ssak", "Ssak", "Ptak", "Ssak", "Ssak"};
    private int[] dogeIcons = {R.drawable.doge2_3x2, R.drawable.doge3_3x2, R.drawable.doge4_3x2, R.drawable.doge5_3x2, R.drawable.doge6_3x2, R.drawable.doge7_3x2};
    private int[] catIcons = {R.drawable.cat2_3x2, R.drawable.cat3_3x2, R.drawable.cat4_3x2, R.drawable.cat5_3x2, R.drawable.cat6_3x2, R.drawable.cat7_3x2};
    private int[] lionIcons = {R.drawable.lion2_3x2, R.drawable.lion3_3x2, R.drawable.lion4_3x2, R.drawable.lion5_3x2, R.drawable.lion6_3x2, R.drawable.lion7_3x2};
    private int[] goatIcons = {R.drawable.goat2_3x2, R.drawable.goat3_3x2, R.drawable.goat4_3x2, R.drawable.goat5_3x2, R.drawable.goat6_3x2, R.drawable.goat7_3x2};
    private int[] pigeonIcons = {R.drawable.pigeon2_3x2, R.drawable.pigeon3_3x2, R.drawable.pigeon4_3x2, R.drawable.pigeon5_3x2, R.drawable.pigeon6_3x2, R.drawable.pigeon7_3x2};
    private int[] dogeFoodIcons = {R.drawable.pokarm_1_3x2, R.drawable.pokarm_2_3x2, R.drawable.pokarm_3_3x2};
    private String[] dogeFoodNames = {"Pedigree", "Mięsko", "Chappii"};
    private String[] dogeFoodSpecies = {"Dobra karma", "Dobre mięso", "Smakołyki"};
    private ArrayList<int[]> arrayIconList;

    public AnimalContainer(){
        fillArrayIconList();
    }

    public ArrayList<Animal> getAnimalList(){
        ArrayList<Animal> data = new ArrayList<>();
        for(int i = 0; i < animalNames.length; i++){
            Animal current = new Animal();
            current.setIconId(icons[i]);
            current.setAnimalName(animalNames[i]);
            current.setAnimalSpecies(animalSpecies[i]);
            data.add(current);
        }

        return data;
    }

    public ArrayList<Food> getDogeFoodList(){
        ArrayList<Food> data = new ArrayList<>();
        for(int i = 0; i < dogeFoodNames.length; i++){
            Food current = new Food();
            current.setIconId(dogeFoodIcons[i]);
            current.setFoodName(dogeFoodNames[i]);
            current.setFoodSpecies(dogeFoodSpecies[i]);
            data.add(current);
        }

        return data;

    }

    public void fillArrayIconList(){
        arrayIconList = new ArrayList<>();
        arrayIconList.add(catIcons);
        arrayIconList.add(dogeIcons);
        arrayIconList.add(pigeonIcons);
        arrayIconList.add(goatIcons);
        arrayIconList.add(lionIcons);
    }

    public ArrayList<int[]> getArrayIconList(){
        return arrayIconList;
    }
}
