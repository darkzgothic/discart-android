package com.zahidhasan.discart.model;

/**
 * Created by auuntoo on 3/1/18.
 */

public class Search {
    private String name;
    private String address;
    private int image;
    private String rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Search() {}

    public Search(String name, String address, int image, String rating) {

        this.name = name;
        this.address = address;
        this.image = image;
        this.rating = rating;
    }
}
