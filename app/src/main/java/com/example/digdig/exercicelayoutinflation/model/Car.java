package com.example.digdig.exercicelayoutinflation.model;

/**
 * Created by digdig on 17-05-23.
 */

public class Car {
    private String name;
    private Float price;
    private int picture;

    public Car(String name, Float price, int picture) {
        this.name = name;
        this.price = price;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return getName() + "\n($" + getPrice()+")";
    }
}
