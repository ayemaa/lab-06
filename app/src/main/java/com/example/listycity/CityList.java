package com.example.listycity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that defines a City.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Add city if it doesnt exist
     */
    public void add(City city){
        if (cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    public  List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}

