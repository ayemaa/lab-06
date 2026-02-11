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
    /**
     * Willg get cities
     */
    public  List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * check if it has the city
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    /**
     * delete city
     */

    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
    /**
     * will count
     */
    public int countCities() {
        return cities.size();
    }

}

