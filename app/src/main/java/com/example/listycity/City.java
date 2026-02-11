package com.example.listycity;

/*
this is a class that defines a city
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o){
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return city.equals(other.city) && province.equals(other.province);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(city, province);
    }



}